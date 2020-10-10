/** Christina Ninh
 * CSSKL143
 */
import java.awt.Color;

public class Circle {
    private int x, y;
    private double radius;
    private String shape = "O";
    private Color color;

    public Circle() {
        x = 0;
        y = 0;
        radius = 1;
        color = Color.white;


    }

    public Circle(int nx, int ny) {
        x = nx;
        y = ny;
        radius = 1;
        color = Color.white;
    }

    public Circle(int nx, int ny, double rad) {
        x = nx;
        y = ny;
        radius = rad;
        color = Color.white;
    }

    public void draw() {
        System.out.println(shape);
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    @Override
    public String toString() {
        return shape;
    }

    public boolean equals(Circle that) {
        if(this.x == that.x && this.y == that.y && this.radius == that.radius)
            return true;
        else
            return false;
    }
}
