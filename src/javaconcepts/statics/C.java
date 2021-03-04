package javaconcepts.statics;

public class C {
    private static int num1;
    private int num2;
    {
        num1+=10;
        num2+=10;
    }
    static {
        num1+=10;
        //num2+=10;
    }

    private void info(){
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void main(String[] args) {
        C test1 =  new C();
        test1.info();
        C test2 = new C();
        test2.info();
    }
}
