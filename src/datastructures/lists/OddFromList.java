package datastructures.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OddFromList {

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(2,2,3,3,4,4,1,1,2));
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (Integer i:numbersList){
            if(numberMap.containsKey(i))
                numberMap.remove(i);
            else
                numberMap.put(i,i);
            }
        System.out.println("el numero que tiene ocurrencias impar es: " + numberMap);
    }

}

