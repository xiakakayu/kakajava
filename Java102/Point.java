package Java102;

public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
		this.x = x;
		this.y = y;
    }
    //translating x direction
    public Point translateX(double t) {
      return new Point (x + t, y);
    }
    //translating y direction
    public Point translateY (double t) {
      return new Point(x, y + t);
    }
    @Override
    public String toString() {
      return "(" + x + "," + y + ")";
    }
    public static double distance(Point p1, Point p2) {
      return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    //Practice: Center of Mass
    public static Point centerOfMass(Point[] points) {
      if (points == null || points.length == 0) {
          throw new IllegalArgumentException("Array of points must not be null or empty");
      }

      double sumX = 0;
      double sumY = 0;

      for (Point point : points) {
          sumX += point.x;
          sumY += point.y;
      }

      double centerX = sumX / points.length;
      double centerY = sumY / points.length;

      return new Point(centerX, centerY);
    }
     // Non-static method: Calculate angle from positive x-axis
     public double angleFromXAxis() {
      double radians = Math.atan2(y, x);
      return Math.toDegrees(radians);
  }
  // Non-static method: Rotate point by a given angle (in degrees)
  public Point rotate(double thetaDegrees) {
    double thetaRadians = Math.toRadians(thetaDegrees); // Convert degrees to radians
    double cosTheta = Math.cos(thetaRadians);
    double sinTheta = Math.sin(thetaRadians);

    double newX = x * cosTheta - y * sinTheta;
    double newY = x * sinTheta + y * cosTheta;

    return new Point(newX, newY);
}
}
