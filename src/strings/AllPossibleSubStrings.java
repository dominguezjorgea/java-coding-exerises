package strings;

import java.util.ArrayList;

public class AllPossibleSubStrings {

    public static ArrayList<String> allPossibleSubStrings(String str){
        ArrayList<String> allSubStrings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                allSubStrings.add(str.substring(i,j));
            }

        }
        return allSubStrings;
    }

    public static void main(String[] args) {
        System.out.println(allPossibleSubStrings("jorge"));
    }
}
