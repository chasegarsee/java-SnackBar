package snackBarApp;

public class Main {
    private static void workWithData() {

        // New Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // New Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // New Snacks
        Snack chips = new Snack(id, "Chips", 36, 1.00, food.getId());
        Snack chocolateBar = new Snack(id, "Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack(id, "Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack(id, "Soda", 24, 2.50, drink.getId());
        Snack water = new Snack(id, "Water", 36, 1.00, drink.getId());
    }

}