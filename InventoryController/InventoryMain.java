package InventoryController;

import InventoryModel.Inventory;
import InventoryService.InventoryService;
import Util.UserInputOutput;

import java.util.Scanner;

public class InventoryMain {

    public static void main(String[] args) {

        InventoryService inventoryService = new InventoryService();

        while (true) {
            int choice = UserInputOutput.getUserChoice();

            switch (choice) {
                case 1:
                    Inventory inventory = readDataFromConsole();
                    inventoryService.addInventory(inventory);
                    break;
                case 2:
                    String editName = UserInputOutput.getProductName();
                    double price = UserInputOutput.getProductPrice();
                    double weight = UserInputOutput.getProductWeight();

                    inventoryService.editInventory(editName, price, weight);

                    break;
                case 3:
                    String name = UserInputOutput.getProductName();

                    inventoryService.deleteInventory(name);
                    break;
                case 4:
                    inventoryService.display();
                    break;
                default:
                    break;
            }
            if(choice  == 5)
                break;
        }
    }

    public static Inventory readDataFromConsole() {
        Inventory inventory = new Inventory();
        System.out.println("Add Inventory");

        String name = UserInputOutput.getProductName();
        inventory.setName(name);

        double price = UserInputOutput.getProductPrice();
        inventory.setPrice(price);

        double weight = UserInputOutput.getProductWeight();
        inventory.setWeight(weight);

        return inventory;
    }
}
