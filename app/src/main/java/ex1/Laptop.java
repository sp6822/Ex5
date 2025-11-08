package ex1;
public class Laptop implements Chargeable {
    private String model;

    public Laptop(String model) {
        this.model = model;
    }

    @Override
    public void charge() {
        System.out.println(model + " - Laptop is now charging.");
    }

    public void runHeavySoftware(String software) {
        System.out.println(model + " - Running software: " + software);
    }
}
