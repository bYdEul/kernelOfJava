package testStatic;

public class MyClass extends Test {
    Person person = new Person("myclass");
    static {
        System.out.println("2.myClass static");
    }
    public MyClass(){
        System.out.println("7.myclass construction");
    }
}
