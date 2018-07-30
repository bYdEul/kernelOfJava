package Singleton;

public class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo(){

    }
    public static SingletonDemo getInstance(){    //static?
        if(instance == null)
            instance = new SingletonDemo();
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo s1 = new SingletonDemo();
        s1.getInstance();
        System.out.println(s1.getInstance().toString());
    }
}


