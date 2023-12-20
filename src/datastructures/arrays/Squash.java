package datastructures.arrays;

public class Squash {

    public static StringBuilder squashString (String input){
        char[] charArray1 = input.toCharArray();
        char[] charArray2 = new char[input.length()];
        int index2=0;
        int[] charArray3 = new int[input.length()];
        int index3 = 0;

        StringBuilder result = new StringBuilder();
        System.out.println(input.length());
        for (int i = 0; i < input.length(); i++) {
            if(i==0){
                charArray2[index2]= charArray1[i];
                index2++;
                charArray3[index3]=1;
                index3++;
            }
            if(i>0 && i<= input.length()-1){
                if(charArray1[i] == charArray1[i-1]){
                    charArray3[index3-1]++;
                }else{
                    charArray2[index2]= charArray1[i];
                    charArray3[index3]=1;
                    index3++;
                    index2++;
                }
            }

        }
        for (int i = 0; i <index2 ; i++) {
            result.append(charArray2[i]);
            result.append(charArray3[i]);
        }
        System.out.println(result);
        return result;

    }
    public static void main(String[] args) {
        System.out.println(Squash.squashString("AAABBBCCC"));
    }
}
