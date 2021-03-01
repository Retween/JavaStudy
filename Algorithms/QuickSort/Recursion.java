import java.util.Arrays;

public class Recursion {
    public static int sum(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
            return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    public static int count(int[] array) {
        if (array.length == 1) {
            return 1;
        } else return 1 + count(Arrays.copyOfRange(array, 1, array.length));
    }

    public static int max(int[] array) {
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        } else {
            return Math.max(array[array.length - 1], max(Arrays.copyOfRange(array, 0, array.length - 1)));
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(count(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(max(new int[]{1, 2, 234, 4, 23225, 6}));
    }

}
