package Lesson_12;

public class Url {
    public static String getServerName(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);
        return endIndex == -1 ? url.substring(startIndex) : url.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String url = "https://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        System.out.println("Имя сервера: " + getServerName(url));
    }
}