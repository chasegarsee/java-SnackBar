package snackBarApp;

public class VendingMachine {
    private int id;
    private String name;

    public VendingMachine(int id, String name) {
        maxId++;
        id = maxId;
        this.name = name;
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

    public void getName(String name) {
        this.name = name;
    }
}
