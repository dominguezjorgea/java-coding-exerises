package datastructures.sets;

import java.util.*;
import java.util.stream.Collectors;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(7, -5, 3, 8, -4, 11, -19, 21));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(6, 13, -7, 0, 11, -4, 3, -5));

        Set<Integer> mergeSet = new HashSet<>(list1);

        for(int i=0; i<list2.size();i++ ){
            Integer temp = list2.get(i);
            mergeSet.add(temp);
        }

        List<Integer> sortSet = mergeSet.stream().sorted().collect(Collectors.toList());
        System.out.println(sortSet);

    }
}
