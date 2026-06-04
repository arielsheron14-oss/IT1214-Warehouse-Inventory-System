//Manage the inventory of the warehouse items ,allowing users to update , search and Display the items in the inventory.


import java.util.*;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void add_Item(Item item) {
        items.add(item);
    }

    public void remove_Item(String id) {
        Item found = null;
        for (Item item : items) {
            if (item.getItemId().equalsIgnoreCase(id)) {
                found = item;
                break;
            }
        }
        if (found != null) {
            items.remove(found);
            System.out.println("Item has been removed");
        } else {
            System.out.println("Item not found");
        }
    }

    public void updateQuantity(String id, int qty) {
        for (Item item : items) {
            if (item.getItemId().equalsIgnoreCase(id)) {
                item.setQuantity(qty);
                System.out.println("Quantity updated");
                return;
            }
        }
        System.out.println("Item not found");
    }

    public void searchItem(String key) {
        boolean found = false;
        for (Item item : items) {
            if (item.getItemId().equalsIgnoreCase(key) || item.getItemName().equalsIgnoreCase(key)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }
}