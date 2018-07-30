package InnerClass;

public class Circle {
    double radius = 0;
    public Circle(double radius){
        this.radius = radius;
    }
    class Draw{
        public void Draw(){
            System.out.println("drawshape");
        }
    }
}
