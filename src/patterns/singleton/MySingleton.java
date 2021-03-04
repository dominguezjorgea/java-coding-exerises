package patterns.singleton;

class MySingleton {

    private static MySingleton instance;

    public MySingleton(){
        //instance = new MySingleton();
    }

    public static MySingleton getInstance()
    {
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }

    public String WHO_AM_I(String myName)
    {
        return "" + hashCode();
    }
}