import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static java.lang.String.format;

public class BinarySearch2 {
    public <T extends Comparable<T>> int find(T[] array, T key) {
        return search(array, key, 0, array.length);
    }

    private <T extends Comparable<T>> int search(T[] array, T key, int left, int right) {
        if (right < left) return -1;

        int mid = (left + right) >>> 1;
        int comp = key.compareTo(array[mid]);

        if (comp == 0) {
            return mid;
        } else if (comp < 0) {
            return search(array, key, left, mid - 1);
        } else {
            return search(array, key, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        // Just generate data
        Random r = ThreadLocalRandom.current();

        int size = 100;
        int maxElement = 100000;

        Integer[] integers =
                IntStream.generate(() -> r.nextInt(maxElement))
                        .limit(size)
                        .sorted()
                        .boxed()
                        .toArray(Integer[]::new);

        // The element that should be found
        int shouldBeFound = integers[r.nextInt(size - 1)];

        BinarySearch2 search = new BinarySearch2();
        int atIndex = search.find(integers, shouldBeFound);

        System.out.println(
                format(
                        "Should be found: %d. Found %d at index %d. An array length %d",
                        shouldBeFound, integers[atIndex], atIndex, size));

        int toCheck = Arrays.binarySearch(integers, shouldBeFound);
        System.out.println(
                format(
                        "Found by system method at an index: %d. Is equal: %b", toCheck, toCheck == atIndex));
    }
}
