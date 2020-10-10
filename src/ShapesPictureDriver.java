/** Christina Ninh
 * CSSKL143
 */
public class ShapesPictureDriver {
    public static void main(String[] args) {
        Square firstSquare = new Square();
        Square secondSquare = new Square(10,20);

        firstSquare.setX(3);
        firstSquare.setY(4);

        System.out.println("Drawing the first square : " + firstSquare.toString());

        firstSquare.draw();

        secondSquare.setWidth(30);
        secondSquare.setHeight(30);

        System.out.println("Drawing the next square with area : " +secondSquare.getArea());

        secondSquare.draw();

        //circles
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(5,5);

        firstCircle.setX(1);
        firstCircle.setY(5);
        firstCircle.setRadius(3);

        System.out.println("Drawing the first circle : " + firstCircle.toString());

        firstCircle.draw();

        secondCircle.setX(2);
        secondCircle.setY(10);
        secondCircle.setRadius(6);

        System.out.println("Drawing the second circle with area " + secondCircle.getArea());

        secondCircle.draw();

        Picture picture = new Picture();

        picture.addSquare(firstSquare);
        picture.addSquare(secondSquare);
        picture.addCircle(firstCircle);
        picture.addCircle(secondCircle);

        System.out.println("Drawing a Picture with Circles & Squares:\n");

        System.out.println(picture.toString());
    }
}
