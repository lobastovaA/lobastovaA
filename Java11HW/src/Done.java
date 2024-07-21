public class Done {
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 42;

        int[] array = createArray(len, initialValue);


        System.out.println("Созданный массив:");
        printArray(array);
    }


    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
