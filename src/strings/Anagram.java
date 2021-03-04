package strings;

public class Anagram {

    public static boolean isAnagramUsingStringFunctions(String word, String anagram){
        if(word.length() != anagram.length()){
            return  false;
        }else{
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = anagram.indexOf(c);
                if(index != -1){
                    anagram = anagram.substring(0,index) + anagram.substring(index + 1, anagram.length());
                }else
                    return false;
            }
        }
        return anagram.isEmpty();
    }



    public static void main(String[] args) {

        System.out.println(isAnagramUsingStringFunctions("angel","angle"));

    }
}
