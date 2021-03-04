package javaconcepts.statics;

public class G {
    public static void main(String[] args) {
        System.out.println("main() method");
        System.out.println(H.VAL + " ");
        System.out.println(H.VAL + 100 + " ");
    }
}

class H{
    final static int VAL = 9090;
    static {
        System.out.println("** Static BLOC: " + VAL + " ");
    }

}
