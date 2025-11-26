package Exercise;

public class Cfsm {
    public static void main(String[] args) {

        MenuItem[] menu = {
                new MenuItem("orange juice", "drink", 2.13),
                new MenuItem("lemonade", "drink", 0.99),
                new MenuItem("cranberry juice", "drink", 2.50),
                new MenuItem("pineapple juice", "drink", 2.85),
                new MenuItem("lemon iced tea", "drink", 1.90),
                new MenuItem("vanilla chai latte", "drink", 3.30),
                new MenuItem("hot chocolate", "drink", 2.50),
                new MenuItem("iced coffee", "drink", 1.40),

                new MenuItem("tuna sandwich", "food", 4.20),
                new MenuItem("ham and cheese sandwich", "food", 3.70),
                new MenuItem("bacon and egg", "food", 4.00),
                new MenuItem("steak", "food", 7.50),
                new MenuItem("hamburger", "food", 5.00),
                new MenuItem("cinnamon roll", "food", 0.77)
        };

        CoffeeShop tcs = new CoffeeShop("Tesha's Coffee Shop", menu);

        System.out.println("Adding orders:");
        System.out.println(tcs.addOrder("tuna sandwich"));
        System.out.println(tcs.addOrder("2. iced tea"));
        System.out.println(tcs.addOrder("3. cinnamon roll"));
        System.out.println(tcs.addOrder("4. iced coffee"));

        System.out.println(tcs.listOrders());
        System.out.println(tcs.dueAmount());
        System.out.println(tcs.orders.size());

        for(String order: tcs.orders){
            System.out.println(order);
        }
//
        for(int i = 0; i < tcs.orders.size(); i++){
            System.out.println("Here");
            System.out.println(tcs.fulfillOrder());
        }
//
//        System.out.println(tcs.fulfillOrder());
//        System.out.println(tcs.fulfillOrder());
//        System.out.println(tcs.fulfillOrder());

        System.out.println(tcs.listOrders());
        System.out.println("Total Due: $" + tcs.dueAmount());
        System.out.println("Cheapest Item: " +tcs.cheapestItem());
        System.out.println(tcs.drinksOnly());
        System.out.println(tcs.foodOnly());
    }
}


