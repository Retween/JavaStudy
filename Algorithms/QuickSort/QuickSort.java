import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        Integer pivot = list.get(0);

        List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot).collect(Collectors.toList());
        List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot).collect(Collectors.toList());

        return Stream.of(
                quicksort(less).stream(),
                Stream.of(pivot),
                quicksort(greater).stream())
                .flatMap(Function.identity()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(quicksort(
                Arrays.asList(1, 23, 4, 6, 8, 456, 865, 34, 67, 345, 8, 3, 8, 543, 893, 3)));
    }

}
