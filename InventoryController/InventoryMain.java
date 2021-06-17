package InventoryController;

import InventoryModel.Inventory;
import InventoryService.InventoryService;
import Util.UserInputOutput;

import java.util.Scanner;

public class InventoryMain {
    static Scanner scanner = new Scanner(System.in);

    //static InventoryServiceInterface inventoryServiceInterface = new InventoryService();
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
                    if (inventoryService.findByName(editName)) {

                        double price = UserInputOutput.getProductPrice();
                        double weight = UserInputOutput.getProductWeight();

                        inventoryService.editInventory(editName, price, weight);
                    }
                    break;
                case 3:
                    String name = UserInputOutput.getProductName();
                    if (inventoryService.findByName(name)) {
                        inventoryService.deleteInventory(name);
                    }
                    break;
                case 4:
                    UserInputOutput.display(inventoryService.findAll());
                    break;
                default:
                    System.out.println("Invalid Input !!!");
                    break;
            }
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
/*
InventoryService inventoryService = new InventoryService();

        ArrayList<Inventory> inventoryArrayList = new ArrayList();
        while (true){
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Inventory inventory1 = new Inventory();
                    System.out.println("Add Inventory");

                    System.out.println("Enter the name :");
                    String name = sc.next();
                    inventory1.setName(name);

                    System.out.println("Enter the price : ");
                    double price  = sc.nextDouble();
                    inventory1.setPrice(price);

                    System.out.println("Enter the weight : ");
                    double weight = sc.nextDouble();
                    inventory1.setWeight(weight);
                    inventoryArrayList = inventoryServiceInterface.addInventory(inventory1,inventoryArrayList);
                    for(Inventory i : inventoryArrayList){
                        System.out.println(i.getName()+ " " + i.getPrice() + " " + i.getWeight());
                    }
                    break;
                case 2:
                    System.out.println("Edit Inventory");

                    System.out.println("Enter the name to edit : ");
                    String editName = sc.next();
                    inventoryArrayList = inventoryServiceInterface.editInventory(inventory,inventoryArrayList,editName);
                    for(Inventory i : inventoryArrayList){
                        System.out.println(i.getName()+ " " + i.getPrice() + " " + i.getWeight());
                    }
                    break;
                case 3:
                    System.out.println("Delete Inventory");

                    System.out.println("Enter the name to delete : ");
                    String deleteName = sc.next();
                    inventoryArrayList = inventoryServiceInterface.editInventory(inventory,inventoryArrayList,deleteName);
                    for(Inventory i : inventoryArrayList){
                        System.out.println(i.getName()+ " " + i.getPrice() + " " + i.getWeight());
                    }
                    break;
                case 4:
                    System.out.println("View Inventory");
                    break;
                case 5:
                    System.out.println("Count Inventory");
                    break;
            }
            if(choice == 6)
                break;
        }
 */