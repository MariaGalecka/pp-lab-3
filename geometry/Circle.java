package geometry;

public class Circle {
  private double radius;
  private Point center;

  public Circle (double radius, Point center) {
    this.radius = radius;
    this.center = center;
  }

  public Point getCenter () {
    return center;
  }

  public double calculatePerimeter (){
   double pi = Math.PI;
    return 2 * pi * radius;
  }

}
