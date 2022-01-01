package c20;

import shape.Circle;
import shape.Shapes;
import shape.Square;
import shape.Triangle;

public class C5_20{
    static Square Box = new Square(25,25);
    static Triangle tri = new Triangle(8,4);
    static Circle Oval = new Circle(25,25);

    public static void main(String[] args) {
        System.out.println("Box Area:"+Box.getArea());
        System.out.println("Box Perimeter:"+Box.getPerimeter());
        System.out.println("tri Area:"+tri.getArea());
        System.out.println("tri Perimeter:"+tri.getPerimeter());
        System.out.println("Oval Area:"+Oval.getArea());
    }
}
