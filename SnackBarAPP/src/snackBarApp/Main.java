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
        Snack chips = new Snack("Chips", 36, 1.00, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 36, 1.00, drink.getId());

        System.out.println("**Jane Buys 3 sodas**");
        jane.buySnack(soda.sellSnack(3));

        System.out.println("**Jane Buys 1 Pretz**");
        jane.buySnack(pretzel.sellSnack(1));

        System.out.println("**Bob Buys 2 sodas**");
        bob.buySnack(soda.sellSnack(2));
    }

    public static void main(String[] args) {
        workWithData();

    }

}