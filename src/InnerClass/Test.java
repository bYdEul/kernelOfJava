package InnerClass;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        Outer.Inner inner1 = outer.getInnerInstance();
    }
}
