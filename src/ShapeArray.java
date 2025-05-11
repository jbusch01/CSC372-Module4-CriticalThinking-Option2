import java.util.ArrayList;

public class ShapeArray {
    public static void main(String[] args) {
        Shape rec = new Rectangle(10,15);
        Shape tri = new Triangle(10,10,15);
        Shape cir = new Circle(5);

        ArrayList<Shape> shapeArray = new ArrayList<>();
        shapeArray.add(rec);
        shapeArray.add(tri);
        shapeArray.add(cir);

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}