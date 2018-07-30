package testStatic;

public class Test {
    Person person = new Person("Test");
    static {
        System.out.println("1.test static");
    }
    public Test(){
        System.out.println("5.test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}
