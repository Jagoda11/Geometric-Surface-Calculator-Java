package cirkle;

import java.util.Scanner;

public class UI {

    public static int mainMenu(Scanner keyboard) {
        System.out.println("*********Please, choose a shape ********");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle\n");
        System.out.print("Your choice: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    public static int subMenu(Scanner keyboard) {
        System.out.println("*********Please, choose an operation ********");
        System.out.println("1. Area");
        System.out.println("2. Perimeter\n");
        System.out.print("Your choice: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    public static void triangleOperations() {
        System.out.print("side1: ");
        double side1 = Main.scanner.nextDouble();
        System.out.print("side2: ");
        double side2 = Main.scanner.nextDouble();
        System.out.print("side3: ");
        double side3 = Main.scanner.nextDouble();
        int x = UI.subMenu(Main.scanner);
        if (x == 1) {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.area());
        } else if (x == 2) {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.perimeter());
        }
    }

    public static void circleOperations() {
        System.out.println("radius: ");
        double radius = Main.scanner.nextDouble();
        int x = UI.subMenu1(Main.scanner);
        if (x == 1) {
            Circle circle = new Circle(radius);
            System.out.println(circle.area());
        } else if (x == 2) {
            Circle circle = new Circle(radius);
            System.out.println(circle.circumference());

        }
    }

    public static int subMenu1(Scanner keyboard) {
        System.out.println("*********Please, choose an operation ********");
        System.out.println("1. Area");
        System.out.println("2. Circumference\n");
        System.out.print("Your choice: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    public static void rectangleOperations() {
        System.out.print("side1: ");
        double side1 = Main.scanner.nextDouble();
        System.out.print("side2: ");
        double side2 = Main.scanner.nextDouble();
        int x = UI.subMenu(Main.scanner);

        if (x == 1) {
            Rectangle rectangle = new Rectangle(side1, side2);
            System.out.println(rectangle.area());
        } else if (x == 2) {
            Rectangle rectangle = new Rectangle(side1, side2);
            System.out.println(rectangle.perimeter());
        }
    }

    public static int subMenu2(Scanner keyboard) {
        System.out.println("*********Please, choose an operation ********");
        System.out.println("1. Area");
        System.out.println("2. Perimeter\n");
        System.out.print("Your choice: ");

        int choice = keyboard.nextInt();
        return choice;
    }

}
