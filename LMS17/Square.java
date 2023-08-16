package LMS17;

public class Square extends Shape {
    public Square(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return( getA()+getA())*2;
    }
}
