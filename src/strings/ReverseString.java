package strings;

public class ReverseString {

    public static String reverseStringLoop(String str){
        String reverseStr ="";
        System.out.println("str length is " + str.length());
        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println("Str " + str);
        return reverseStr;
    }

    public static String reverseStringRecursive(String str){
        if (str.length() == 1)
            return str;
        else
            return str.charAt(str.length()-1) + reverseStringRecursive(str.substring(0, str.length()-1));
    }

    public static String reverseStringStringBuffer(String str){
        StringBuffer sbStr = new StringBuffer(str);
        StringBuilder sbrStr = new StringBuilder(str);
        StringBuilder reverseStr = sbrStr.reverse();
        System.out.println("Reverse String Builder Option" + reverseStr.toString());
        return sbStr.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println("Reverse of 'Jorge Dominguez' with a loop function is " + reverseStringLoop("Jorge Dominguez"));
        System.out.println("Reverse of 'Jorge Dominguez' with a recursive function is " + reverseStringRecursive("Jorge Dominguez"));
        System.out.println("Reverse of 'Jorge Dominguez' with a StringBuffer/StringBuffer function is " + reverseStringStringBuffer("Jorge Dominguez"));
    }
}
