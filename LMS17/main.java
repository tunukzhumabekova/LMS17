package LMS17;

public class main {
    public static void main(String[] args) {
        System.out.print("perimeter of square with lengths 5: ");
        Square square=new Square(5,5);
        System.out.println(square.getPerimeter());
        System.out.print("perimeter of rectangle with lengths 5 and 8:");
        Rectangle rectangle=new Rectangle(5,8);
        System.out.println(rectangle.getPerimeter());
        System.out.print("perimeter of trapezoid with lengths 5 nad 10:");
        Trapezoid trapezoid=new Trapezoid(5,10);
        System.out.println(trapezoid.getPerimeter());
        System.out.print("perimeter of triangle with lengths 5,5 and 5:");
        Triangle triangle=new Triangle(5,5,5);
        System.out.println(triangle.getPerimeter());
        System.out.print  ("perimeter of parallelogram with length 5 and 5:");
        Parallelogram parallelogram=new Parallelogram(5,5);
        System.out.println(parallelogram.getPerimeter());
    }
}
