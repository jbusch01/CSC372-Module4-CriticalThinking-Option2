public class Circle extends Shape {
    private double radius;
    private double pi = Math.PI;

    public Circle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
        
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }
    
    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle - Area: " + area() + ", Perimeter: " + perimeter();
    }
}