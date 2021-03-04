package datastructures.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinDeletions {

    public static int getMinDeletions(String s) {
        List<Character> list = convertStringToCharList(s);
        List<Character> uniqueList = list.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Sort: "+ uniqueList);
        int tamS = s.length();
        System.out.println(" tan S" + tamS);
        int sortedTam = uniqueList.size();
        System.out.println("sortedTam " + sortedTam);

        return tamS - sortedTam;
    }

    public static List<Character> convertStringToCharList(String str)
    {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static void main(String[] args) {
        System.out.println(getMinDeletions("aaabbbcccdddeee"));
    }
}