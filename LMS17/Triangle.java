package LMS17;

public class Triangle extends Shape {
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c=c;
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC() ;

    }

}