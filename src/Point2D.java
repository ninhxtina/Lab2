/** Christina Ninh
 * CSSKL143
 */
public class Point2D {
    private int x; // x-coordinate
    private int y; // y-coordinate


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void resetToOrigin()
    {
        this.x=0;
        this.y=0;
    }
    public void translate(int dx,int dy)
    {
        this.x+=dx;
        this.y+=dy;
    }
    @Override
    public String toString() {
        return "(" + x + ","+ y + ')';
    }


    public boolean equals(Point2D that) {
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        final Point2D other = (Point2D) that;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Point2D a= new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point2D at ("+a.getX()+", "+a.getY()+")");
        a.translate(-1, -1);
        System.out.println("Point2D at ("+a.getX()+", "+a.getY()+")");
        a.resetToOrigin();
        System.out.println("Point2D at ("+a.getX()+", "+a.getY()+")");
        Point2D b=new Point2D();
        Point2D c=new Point2D();
        System.out.println(b.toString());
        System.out.println(c);//because we have override the to string method in the point class
        System.out.println("Are b ans c equal: "+b.equals(c));
    }


}
