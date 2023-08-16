package LMS17;

public class Rectangle extends Shape {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return (getA()+getB()) *2;
    }
}