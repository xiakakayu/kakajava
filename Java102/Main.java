package Java102;

public class Main {

    public class Point {
        public final double x;
        public final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point translateX(double t) {
            return new Point(x + t, y);
        }

        public Point translateY(double t) {
            return new Point(x, y + t);
        }

        public Point reflect() {
            return new Point(-x, -y); // Reflect across the origin
        }
    }

    public Main() {
        Point point = new Point(4, 3);
        System.out.println("Original point: x = " + point.x + ", y = " + point.y);

        // Translate along X
        Point xTranslation = point.translateX(3); // (7, 3)
        System.out.println("x translation: x = " + xTranslation.x + ", y = " + xTranslation.y);

        // Translate along Y
        Point yTranslation = point.translateY(-7); // (4, -4)
        System.out.println("y translation: x = " + yTranslation.x + ", y = " + yTranslation.y);

        // Translate both X and Y
        Point xyTranslation = point.translateX(-4).translateY(-3); // (0, 0)
        System.out.println("xy translation: x = " + xyTranslation.x + ", y = " + xyTranslation.y);

        // Reflect the point
        Point reflectedPoint = point.reflect(); // (-4, -3)
        System.out.println("Reflected point: x = " + reflectedPoint.x + ", y = " + reflectedPoint.y);
    }

    public static void main(String[] args) {
        new Main();
    }
}