package InventoryService;

import InventoryModel.Inventory;

import java.util.ArrayList;
import java.util.List;

public interface InventoryServiceInterface {


    void addInventory(Inventory inventory);

    void deleteInventory(String name);

    void editInventory(String name, double price, double weight);

    boolean findByName(String name);

    List<Inventory> findAll();

}
///public abstract ArrayList<Inventory> addInventory(Inventory inventory,ArrayList<Inventory>arrayList);
//    //public abstract ArrayList<Inventory> editInventory(Inventory inventory,ArrayList<Inventory> arrayList,String editName);
//    //public abstract ArrayList<Inventory> deleteInventory(Inventory inventory,ArrayList<Inventory>arrayList,String deleteName);