package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private double quantity;
    private int cost;
    private int vendingID;

    public Snack(int id, String name, double quantity, int cost, int vendingID) {

        id = ++maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getvendingID() {
        return vendingID;
    }

    public void setVendingID(int vendingID) {
        this.vendingID = vendingID;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        String rtnString = "Snacks id " + id + "\n" + "Snack's name: " + name + "\n" + "Snack's quantity: " + quantity
                + "\n" + "Snack's cost: " + cost + "\n";

        return rtnString;

    }
}
