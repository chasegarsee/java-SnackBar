package snackBarApp;

public class VendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name) {
        id = ++maxId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String rtnSting = "Vending Machine's id:" + id + "\n" + "Vending Machine's " + name + '\n';

        return rtnSting;
    }

}
