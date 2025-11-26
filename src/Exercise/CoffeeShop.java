package Exercise;

import java.util.ArrayList;

public class CoffeeShop {
    String name;
    MenuItem[] menu;
    ArrayList<String> orders;

    public CoffeeShop(String name, MenuItem[] menu) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<>();
    }

    public String addOrder(String itemName) {
        for (MenuItem item : menu) {
            if (item.name.equalsIgnoreCase(itemName)) {
                orders.add(itemName);
                return "Order added!";
            }
        }
        return "This item is currently unavailable!";
    }

    // 2. fulfillOrder
    public String fulfillOrder() {
        if (orders.size() > 0) {
            String firstOrder = orders.remove(0);
            return "The " + firstOrder + " is ready!";
        }
        return "All orders have been fulfilled!";
    }

    public ArrayList<String> listOrders() {
        return orders;
    }

    public double dueAmount() {
        double total = 0;

        for (String orderName : orders) {
            for (MenuItem item : menu) {
                if (item.name.equalsIgnoreCase(orderName)) {
                    total += item.price;
                }
            }
        }

        return (total * 100.0) / 100.0;
    }

    public String cheapestItem() {
        MenuItem cheapest = menu[0];

        for (MenuItem item : menu) {
            if (item.price < cheapest.price) {
                cheapest = item;
            }
        }

        return cheapest.name;
    }

    public ArrayList<String> drinksOnly() {
        ArrayList<String> drinks = new ArrayList<>();

        for (MenuItem item : menu) {
            if (item.type.equalsIgnoreCase("drink")) {
                drinks.add(item.name);
            }
        }

        return drinks;
    }

    public ArrayList<String> foodOnly() {
        ArrayList<String> foods = new ArrayList<>();

        for (MenuItem item : menu) {
            if (item.type.equalsIgnoreCase("food")) {
                foods.add(item.name);
            }
        }

        return foods;
    }
}
