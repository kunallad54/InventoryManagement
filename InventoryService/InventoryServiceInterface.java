package InventoryService;

import InventoryModel.Inventory;

public interface InventoryServiceInterface {


    void addInventory(Inventory inventory);

    void deleteInventory(String name);

    void editInventory(String name, double price, double weight);

    void display();

}
