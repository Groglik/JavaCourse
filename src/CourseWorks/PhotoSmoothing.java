package CourseWorks;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class PhotoSmoothing {
    public static int getCorrectRangeLimit(int pixelComponent) {
        if (pixelComponent > 255) {
            return 255;
        } else if (pixelComponent < 0) {
            return 0;
        }

        return pixelComponent;
    }

    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("E:\\Projects\\JavaCourse\\src\\nature.jpg"));
        BufferedImage image2 = ImageIO.read(new File("E:\\Projects\\JavaCourse\\src\\nature - copy.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();
        WritableRaster raster2 = image2.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        double[][] array = {
                {1 / 9., 1 / 9., 1 / 9.},
                {1 / 9., 1 / 9., 1 / 9.},
                {1 / 9., 1 / 9., 1 / 9.}};

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        double[] centralPixel = new double[COLORS_COUNT_IN_RGB];
        int[] relatedPixel = new int[COLORS_COUNT_IN_RGB];

        // цикл по строкам картинки
        for (int y = 1; y < height - 1; ++y) {
            // цикл пикселям строки
            for (int x = 1; x < width - 1; ++x) {
                // получаем текущий пиксель с координатами (x, y) - его цвета кладутся в массив pixel
                raster.getPixel(x, y, centralPixel);

                for (int i = y - 1; i <= y + 1; i++) {
                    for (int j = x - 1; j <= x + 1; j++) {
                        raster.getPixel(j, i, relatedPixel);

                        centralPixel[0] += relatedPixel[0] * array[i - y + 1][j - x + 1];
                        centralPixel[1] += relatedPixel[1] * array[i - y + 1][j - x + 1];
                        centralPixel[2] += relatedPixel[2] * array[i - y + 1][j - x + 1];
                    }
                }

                centralPixel[0] = getCorrectRangeLimit((int) Math.round(centralPixel[0]));
                centralPixel[1] = getCorrectRangeLimit((int) Math.round(centralPixel[1]));
                centralPixel[2] = getCorrectRangeLimit((int) Math.round(centralPixel[2]));

                // записываем значения цветов для пикселя в картинку
                raster2.setPixel(x, y, centralPixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(image2, "png", new File("out.png"));
    }
}