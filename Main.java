import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 15);
        System.out.println("x:" + point.getX() + "y:" + point.getY());

        Circle mojeKolo = new Circle(10, point);
        System.out.println("obwód koła:" + mojeKolo.calculatePerimeter());
    }
}
