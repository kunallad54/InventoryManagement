package DAO;

import InventoryModel.Inventory;
import InventoryService.InventoryServiceInterface;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class InventoryDAO implements InventoryServiceInterface {

    JSONArray jsonArray = new JSONArray();

    @Override
    public void addInventory(Inventory inventory) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name",inventory.getName());
        jsonObject.put("Price",inventory.getPrice());
        jsonObject.put("Weight",inventory.getWeight());
        jsonArray.add(jsonObject);
    }

    @Override
    public void deleteInventory(String name) {
        JSONObject obj;
        for (int i = 0; i < jsonArray.size(); i++) {
            obj = (JSONObject) jsonArray.get(i);
            String existingName = (String) obj.get("Name");
            if(existingName.equalsIgnoreCase(name)){
                jsonArray.remove(obj);
            }
        }
    }

    @Override
    public void editInventory(String name, double price, double weight) {
        JSONObject obj;
        for (int i = 0; i < jsonArray.size(); i++) {
           obj = (JSONObject) jsonArray.get(i);
           String existingName = (String) obj.get("Name");
           if(existingName.equalsIgnoreCase(name)){
               obj.replace("Price",price);
               obj.replace("Weight",weight);
           }
        }
    }

    @Override
    public void display(){
        System.out.println(jsonArray);
    }

}
