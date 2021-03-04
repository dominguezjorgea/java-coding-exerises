package strings;

public class StringComparison {
    
    String getLiteralString(){
        return "555";
    }

    private void run() {
        System.out.println("555" == "555" + "");
        System.out.println(" ");
        System.out.println(getLiteralString() == getLiteralString() + "");
    }

    public static void main(String[] args) {
        new StringComparison().run();
    }
}
