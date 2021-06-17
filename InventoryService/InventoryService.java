package InventoryService;

import DAO.InventoryDAO;
import InventoryModel.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryService implements InventoryServiceInterface {
    //Scanner sc = new Scanner(System.in);
    InventoryDAO inventoryDAO = new InventoryDAO();
    @Override
    public void addInventory(Inventory inventory) {
        inventoryDAO.addInventory(inventory);
    }

    @Override
    public void deleteInventory(String name) {
        inventoryDAO.deleteInventory(name);
    }

    @Override
    public void editInventory(String name, double price, double weight) {
        inventoryDAO.editInventory(name, price, weight);
    }

    @Override
    public boolean findByName(String name) {

        return inventoryDAO.findByName(name);

    }

    @Override
    public List<Inventory> findAll(){

        return inventoryDAO.findAll();
    }

}
/*
    @Override
    public ArrayList<Inventory> addInventory(Inventory inventory, ArrayList<Inventory> arrayList) {
        arrayList.add(inventory);
        return arrayList;
    }

    @Override
    public ArrayList<Inventory> editInventory(Inventory inventory, ArrayList<Inventory> arrayList,String editName) {
        for(int i = 0;i < arrayList.size(); i++){
            if(arrayList.get(i).getName().equals(editName)){
                System.out.println("Enter the new name : ");
                String newName = sc.nextLine();
                inventory.setName(newName);

                System.out.println("Enter the new price : ");
                double newPrice = sc.nextDouble();
                inventory.setPrice(newPrice);

                System.out.println("Enter the new weight : ");
                double newWeight = sc.nextDouble();
                inventory.setWeight(newWeight);

                arrayList.set(i,inventory);
            }
        }
        return arrayList;
    }

    @Override
    public ArrayList<Inventory> deleteInventory(Inventory inventory, ArrayList<Inventory> arrayList, String deleteName) {
        return null;
    }*/