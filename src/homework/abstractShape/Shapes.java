package homework.abstractShape;

import java.util.*;

public class Shapes {
    private List<Shape> arrays = new ArrayList<>();

    public Shapes(Shape... shapeArray) {
        arrays.addAll(Arrays.asList(shapeArray));

    }


    public void getShapesList() {
        for (int i = 0; i < arrays.size(); i++) {


            System.out.printf("%s area is: %f\n",
                    arrays.get(i).getClass().getName(),
                    arrays.get(i).getArea());


        }
    }
}
