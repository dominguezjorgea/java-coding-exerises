package datastructures.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin {

    public static int maxMin(List<Integer> arr, int k){
        ArrayList <Integer> arrLocal = new ArrayList<>(arr);
        System.out.println();
        System.out.println("Initial List: " + arrLocal);
        System.out.println("K is: " + k);
        List<Integer> minima = new ArrayList<>();
        if(k<=arrLocal.size()){
            for (int i = 0; i < arrLocal.size()-1; i++) {
                if((i+k) <=arrLocal.size()){
                    List<Integer> subList = new ArrayList<>(arrLocal.subList(i, i + k));
                    System.out.println("SubList " + (i+1) + " :" + subList);
                    int resp = minSubArray(subList);
                    minima.add(resp);
                }
                else
                    break;
            }
            System.out.println("The minima os the sublist is: " + minima);
            return maxArr(minima);
        }else
            return 0;
    }

    private static int minSubArray(List<Integer> subArr){
        int min = subArr.get(0);
        for (int i = 0; i < subArr.size(); i++) {
            if(subArr.get(i) <= min)
                min = subArr.get(i);
        }
        return min;
    }

    private static int maxArr(List<Integer> subArr){
        int max = subArr.get(0);
        for (int i = 0; i < subArr.size(); i++) {
            if(subArr.get(i) >= max)
                max = subArr.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("MaxMin Tests:");
        List<Integer> arr = Arrays.asList(9,8,8,7,6,5);
        System.out.println("The maxMin is : " + maxMin(arr,2));
        List<Integer> arr2 = Arrays.asList(1,2,3,1,2);
        System.out.println("The maxMin is : " + maxMin(arr2,2));
        List<Integer> arr4 = Arrays.asList(1,2,3,1,2);
        System.out.println("The maxMin is : " + maxMin(arr4,9));
        List<Integer> arr5 = Arrays.asList(1,2,3,1,2);
        System.out.println("The maxMin is : " + maxMin(arr5,1));

    }
}
