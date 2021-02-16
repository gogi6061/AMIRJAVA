package homework.abstractShape;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double z;

    @Override
    public double getArea(){
        double p = ((a+b+z))/2;
        double area = Math.round(Math.sqrt(p*(p-a)*(p-b)*(p-z)));
        return area;

    }


    public Triangle(double a, double b, double z) throws NullPointerException {
        try {


            this.a = a;
            this.b = b;
            this.z = z;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
