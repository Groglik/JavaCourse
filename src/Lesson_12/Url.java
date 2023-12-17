package Lesson_12;

public class Url {
    public Url() {
    }

    public static String getServerName(String urlAddress) {
        int startIndex = urlAddress.indexOf("/") + 2;
        int endIndex = urlAddress.indexOf("/", startIndex);
        return endIndex == -1 ? urlAddress.substring(startIndex) : urlAddress.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String urlAddress = "https://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        System.out.println("Имя сервера: " + getServerName(urlAddress));
    }
}