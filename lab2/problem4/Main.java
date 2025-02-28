package lab2.problem4;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean computeArea = false;
        do {
            areaCalculator();
            System.out.println("Do you want to continue(y/n):");
            String continuePrompt = sc.nextLine();
            if (continuePrompt.equals("y")) {
                computeArea = true;
            } else {
                computeArea = false;
            }

        } while (computeArea);
        sc.close();
    }

    public static void areaCalculator() {
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");

        String input = sc.nextLine().trim().toLowerCase();

        switch (input) {
            case "c": {
                System.out.println("Enter the radius of the Circle");
                double radius = Double.valueOf(sc.nextLine());
                CircleRecord circle = new CircleRecord(radius);
                System.out.printf("The area of the Circle is: %.2f", circle.computeArea());
                System.out.println("");
                break;
            }

            case "r": {
                System.out.println("Enter the width of the Rectangle");
                double width = Double.valueOf(sc.nextLine());
                System.out.println("Enter the height of the Rectangle");
                double height = Double.valueOf(sc.nextLine());
                Rectangle rt = new Rectangle(height, width);
                System.out.printf("The area of the Rectangle is: %.2f", rt.computeArea());
                System.out.println("");
                break;
            }

            case "t": {
                System.out.println("Enter the height of the Triangle");
                double height = Double.valueOf(sc.nextLine());
                System.out.println("Enter the base of the Triangle");
                double base = Double.valueOf(sc.nextLine());
                TriangleRecord tri = new TriangleRecord(height, base);
                System.out.printf("The area of the Triangle is: %.2f", tri.computeArea());
                System.out.println("");
                break;
            }

            default:
                System.out.println("Invalid Input, please enter a valid choice (C, R, or T).");
                break;
        }
    }
}
