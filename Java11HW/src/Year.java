public class Year {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // true
    }

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
