package cirkle;

public class Circle {

    public double radius;
    public final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        
    }

    public double circumference() {
        double circumference = radius * 2 * PI;
        return circumference;

    }

    public double area() {
        double area = PI * radius * radius;
        return area;

    }

   

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    
}
