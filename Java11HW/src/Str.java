public class Str {
    public static void main(String[] args) {
        // Примеры вызова метода
        printStringMultipleTimes("Java - это здорово!", 2);
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
