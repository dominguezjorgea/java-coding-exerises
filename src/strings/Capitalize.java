package strings;

import java.util.Arrays;
import java.util.List;

public class Capitalize {
    static String cap (String str){
        String strFinal = "";
        List<String> items = Arrays.asList(str.split(" "));
        for (String temp:  items) {
            strFinal += CapitalizeFirstLetter(temp);
            strFinal+= " ";
        }
        return strFinal;
    }

    public static String CapitalizeFirstLetter(String str)
    {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(cap("this is not capitalized"));
    }
}
