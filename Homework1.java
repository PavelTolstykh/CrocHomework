import java.util.Scanner;

public class Main {

    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        System.out.println("Введите координату х вершины №1: ");
        a.x = scanner.nextDouble();
        System.out.println("Введите координату y вершины №1: ");
        a.y = scanner.nextDouble();
        System.out.println("Введите координату х вершины №2: ");
        b.x = scanner.nextDouble();
        System.out.println("Введите координату y вершины №2: ");
        b.y = scanner.nextDouble();
        System.out.println("Введите координату х вершины №3: ");
        c.x = scanner.nextDouble();
        System.out.println("Введите координату y вершины №3: ");
        c.y = scanner.nextDouble();
        double s = 0.5 * (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
        System.out.println("Площадь треугольника: " + s);
    }
}
