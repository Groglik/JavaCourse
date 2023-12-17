import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("E:\\Projects\\JavaStudying\\AcademShool\\src\\nature.jpg"));
        BufferedImage image2 = ImageIO.read(new File("E:\\Projects\\JavaStudying\\AcademShool\\src\\nature - copy.jpg"));
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
                {1 / 9., 1 / 9., 1 / 9.}
        };

        int[][] array2 = {
                {-5, 0, -1},
                {-1, 15, -2},
                {0, -4, -2}
        };
        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        double[] pixel = new double[COLORS_COUNT_IN_RGB];
        int[] pixel1 = new int[COLORS_COUNT_IN_RGB];
        // цикл по строкам картинки

        // цикл по строкам картинки
        for (int y = 1; y < height - 1; ++y) {
            // цикл пикселям строки
            for (int x = 1; x < width - 1; ++x) {
                // получаем текущий пиксель с координатами (x, y) - его цвета кладутся в массив pixel
                raster.getPixel(x, y, pixel);

                for (int colour = 0; colour < COLORS_COUNT_IN_RGB; ++colour) {
                    int k = 0;
                    for (int i = y - 1; i <= y+1; i++) {
                        int l = 0;

                        for (int j = x - 1; j <= x+1; j++) {
                            raster.getPixel(j, i, pixel1);
                            pixel[colour] += pixel1[colour] * array[k][l];
                            l++;
                        }

                        k++;
                    }
                    pixel[colour] = (int) Math.round(pixel[colour]);

                    if (pixel[colour] > 255) {
                        pixel[colour] = 255;
                    } else if (pixel[colour] < 0) {
                        pixel[colour] = 0;
                    }
                }

                // записываем значения цветов для пикселя в картинку
                raster2.setPixel(x, y, pixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(image2, "png", new File("out.png"));
    }
}

