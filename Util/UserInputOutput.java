package Util;

import java.util.Scanner;

public class UserInputOutput {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getProductName() {
        System.out.println("Enter the name :");
        return scanner.next();
    }

    public static Double getProductPrice() {
        System.out.println("Enter the price : ");
        return scanner.nextDouble();
    }

    public static Double getProductWeight() {
        System.out.println("Enter the weight : ");
        return scanner.nextDouble();
    }

    public static int getUserChoice() {

        System.out.println("Press 1 - Add Products to Inventory");
        System.out.println("Press 2 - Edit Products of Inventory");
        System.out.println("Press 3 - Delete Products from Inventory");
        System.out.println("Press 4 - Display Products of Inventory");
        System.out.println("Press 5 - To view Total Value of Inventory ");
        System.out.println("Press 6 - To view Total Weight of Inventory ");
        System.out.println("Press 7 - To view Total Price of Inventory ");
        System.out.println("Press 8 - To Quit ");

        return scanner.nextInt();
    }

}
