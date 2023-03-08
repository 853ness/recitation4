import java.util.Scanner;

public class Recitation4 {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = scan.nextDouble();
        System.out.println("Enter y: ");
        double y = scan.nextDouble();
        Point p = new Point(x, y);
        Circle circle1 = new Circle(p, 16.0);
        Point q = new Point(14, 12);
        Circle circle2 = new Circle(q, 40.0);
        if (circle1.intersects(circle2)) {
            System.out.println("Circles intersect!");
        } else {
            System.out.println("Circles do not intersect!");
        }
        return;

    }
}
