package LMS17;

public class Trapezoid extends Shape {

    public Trapezoid(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return (getA()+getB()) /2;

    }
}


