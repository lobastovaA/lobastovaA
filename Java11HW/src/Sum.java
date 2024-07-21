public class Sum {
    public static void main(String[] args) {
        System.out.println(isSumInRange(3, 7));
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
