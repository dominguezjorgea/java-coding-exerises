package patterns.singleton;

class MyCode {

    static MySingleton instance1;
    static MySingleton instance2;
    static MySingleton instance3;

    public static void initiateSinglenton()
    {
        instance1 = MySingleton.getInstance();
        instance2 = MySingleton.getInstance();
        instance3 = MySingleton.getInstance();
    }

    // END of modifiable code---------------------------------------
    public static void main (String[] args)
    {
        initiateSinglenton();
        System.out.println("Is this a singleton? " + (instance1 == instance2 && instance1 == instance3 && instance3 == instance2 && instance1!=null ));
    }
}
