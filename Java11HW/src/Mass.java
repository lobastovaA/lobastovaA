public class Mass {
    public static void main(String[] args) {

        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };


        System.out.println("Исходный массив:");
        printArray(array);


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }


        System.out.println("Измененный массив:");
        printArray(array);
    }


    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
