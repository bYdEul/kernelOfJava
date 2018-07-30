package InnerClass;

public class Outer {
    private Inner inner = null;
    public void Outer(){

    }

    public Inner getInnerInstance(){
        if(inner == null) inner = new Inner();
        return inner;
    }

    class Inner{
        public void Inner(){

        }
    }
}
