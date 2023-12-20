package datastructures.sets;

import java.util.*;
import java.util.stream.Collectors;

public class MergeSort {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(7, -5, 3, 8, -4, 11, -19, 21));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 13, -7, 0, 11, -4, 3, -5));

        Set<Integer> mergeSet = new HashSet<>(list1);

        mergeSet.addAll(list2);

        List<Integer> sortSet = mergeSet.stream().sorted().collect(Collectors.toList());
        System.out.println(sortSet);

    }
}
