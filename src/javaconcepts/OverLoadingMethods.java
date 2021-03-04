package javaconcepts;

public class OverLoadingMethods {
    public static void testMethod(Object x){
        System.out.println("Java object");
    }

    public static void testMethod(String x){
        System.out.println("Java String");
    }

    /*public static void testMethod(Integer x){
        System.out.println("Java Integer");
    }*/

    public static void main (String[] args){
        testMethod(null);
    }
}
