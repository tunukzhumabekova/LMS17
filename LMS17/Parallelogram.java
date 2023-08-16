package LMS17;

public class Parallelogram extends Shape{


    public Parallelogram(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return (getA()+getB()) *2;

    }
}
