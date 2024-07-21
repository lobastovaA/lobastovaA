public class Num {
    public static void main(String[] args) {
        printNumberType(-3);  // Отрицательное число
    }

    public static void printNumberType(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
