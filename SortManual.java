public class SortManual {

    public static void swap(int[] arr, int i, int j) {
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void sortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] data = {100, 53, 523, 98, 4, 7, 8, 20, 32, 90, 9872, 12};

        int[] ascData = data.clone();
        int[] descData = data.clone();

        System.out.println("Asli:");
        printArray(data);

        sortAsc(ascData);
        System.out.println("\nAsc:");
        printArray(ascData);

        sortDesc(descData);
        System.out.println("\nDesc:");
        printArray(descData);
    }
}
