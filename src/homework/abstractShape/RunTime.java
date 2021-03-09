package homework.abstractShape;

public class RunTime {
    public static void main(String[] args) {
        Shapes shapeArray = new Shapes(new Triangle(3,4,5.5),new Circle(5),new Rectangle(3,4));
        shapeArray.getShapesList();
    }
}
