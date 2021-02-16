package homework.abstractShape;

public class Circle extends Shape{
    private double red;

    @Override
    double getArea() {
        double d;
        d = Math.round(Math.PI*Math.pow(this.getRed(), 2));
        return  d;

    }

    public Circle(double red) throws  NullPointerException {
        try {


            this.red = red;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());

        }
    }

    public double getRed() {
        return red;
    }

    public void setRed(double red) {
        this.red = red;
    }
}
