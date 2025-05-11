import java.util.ArrayList;

public class ShapeArray {
    public static void main(String[] args) {
        Shape rec = new Rectangle(10,15);
        Shape tri = new Triangle(10,10,15);
        Shape cir = new Circle(5);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rec);
        shapes.add(tri);
        shapes.add(cir);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}