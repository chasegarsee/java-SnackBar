package snackBarApp;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        id = ++maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void addCashOnHand(double cashOnHand) {
        this.cashOnHand += cashOnHand;
    }

    public void buySnack(double cost) {
        this.cashOnHand -= cost;
    }

    @Override
    public String toString() {
        String rtnString = "Customer's id: " + id + '\n' + "Customer's name: " + name + "\n"
                + "Customer's current amount of Fat Stacks: " + cashOnHand + '\n';

        return rtnString;
    }
}