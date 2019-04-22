package snackBarApp;

public class Snack {
    private int id;
    private String name;
    private double quantity;
    private int cost;
    private int vendingID;

    public Snack(int id, String name, double quantity, int cost, int vendingID) {
        maxId++;
        id = maxId;

        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingID = vendingID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
