package cirkle;

import java.util.Scanner;
import cirkle.Circle;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        switchChoice(UI.mainMenu(scanner));

    }

    public static void switchChoice(int choice) {
        switch (choice) {
            case 1:
                UI.triangleOperations();

                break;

            case 2:

                UI.circleOperations();

                break;

            case 3:

                UI.rectangleOperations();
                break;

            default:
                System.out.println("not a valid choice");

        }

    }

}
