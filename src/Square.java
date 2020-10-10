/** Christina Ninh
 * CSSKL143
 */
import java.awt.Color;

public class Square {
    private int x, y;
    private double sideLength;
    private String shape = "[]";
    private Color color;

    public Square() {
        x = 0;
        y = 0;
        sideLength = 1;
        color = Color.white;

    }

    public Square(int nx, int ny) {
        x = nx;
        y = ny;
        sideLength = 1;
        color = Color.white;
    }

    public Square(int nx, int ny, double len) {
        x = nx;
        y = ny;
        sideLength = len;
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

    public double getSideLength() {
        return sideLength;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return shape;
    }

    public boolean equals(Square that) {
        if(this.x == that.x && this.y == that.y && this.sideLength == that.sideLength)
            return true;
        else
            return false;
    }
}