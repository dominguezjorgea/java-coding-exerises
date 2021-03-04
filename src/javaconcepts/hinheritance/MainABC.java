package javaconcepts.hinheritance;

public class MainABC {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        A a = new A();
        //b = (B) a;
        c.info();
        b.info();
        a.info();
    }
}
