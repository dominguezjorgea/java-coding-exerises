package datastructures.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReductionCost {

    public static int reductionCost(List<Integer> num) {
        ArrayList<Integer> num2 = new ArrayList<>(num);
        int position = num2.size()-1;
        int sum = 0;

        while (position >0){
            sum = sum + num2.get(0) + num2.get(1);
            num2.add(sum);
            num2.remove(0);
            num2.remove(0);
            position--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("reductionCost Tests:");
        List<Integer> num = Arrays.asList(1,2,3,4);
        System.out.println("The reduction cost for the List "+ num + " is: " + reductionCost(num));
        List<Integer> num2 = Arrays.asList(4,6,8);
        System.out.println("The reduction cost for the List "+ num2 + " is: " + reductionCost(num2));
        List<Integer> num3 = Arrays.asList(1,2,3);
        System.out.println("The reduction cost for the List "+ num3 + " is: " + reductionCost(num3));
        System.out.println();

    }
}
