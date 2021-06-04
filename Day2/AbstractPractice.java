package Day2;

import org.w3c.dom.css.Rect;

abstract class Shape{
    public double width;
    public double height;
    public double radius;
    public float pie = 3.14f;

    public abstract double getArea();
}

class Rectangle extends Shape{

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape{

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.pie * radius * radius;
    }
}


public class AbstractPractice {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3.4,4.1);
        Circle circ = new Circle(9.2);

        System.out.println(rect.getArea());
        System.out.println(circ.getArea());
    }

}
