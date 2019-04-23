package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {

        id = ++maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity() {
        this.quantity += quantity;
    }

    public double sellSnack(int quantity) {
        this.quantity -= quantity;
        return quantity * cost;
    }

    public int getvendingMachineId() {
        return vendingMachineId;
    }

    public void setvendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    @Override
    public String toString() {
        String rtnString = "Snacks id " + id + "\n" + "Snack's name: " + name + "\n" + "Snack's quantity: " + quantity
                + "\n" + "Snack's cost: " + cost + "\n";

        return rtnString;

    }
}
