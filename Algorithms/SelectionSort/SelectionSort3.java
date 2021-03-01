import java.util.Arrays;

public class SelectionSort3 {
    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }

            if (min != i) {
                swap(arr, i, min);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[]{4, 23, 6, 78, 1, 54, 231, 9, 12})));
    }
}
