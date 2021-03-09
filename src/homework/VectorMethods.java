package homework;


public class VectorMethods {


    public static void main(String[] args) {
        Vector2D a1 = new Vector2D(5, 1);
        Vector2D a2 = new Vector2D(6, 1);
        a1.add(a2);
        a1.sub(a2);
        a1.mult(2);

    }
}

class Vector2D {
    double x;
    double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void add(Vector2D other) {
        this.x += other.x;
        this.y += other.y;
        System.out.println(this.x + " " + this.y);

    }

    public void sub(Vector2D other) {
        this.x -= other.x;
        this.y -= other.y;
        System.out.println(this.x + " " + this.y);
    }

    public void mult(double t) {
        this.x *= t;
        this.y *= t;
        System.out.println(this.x + " " + this.y);

    }
}