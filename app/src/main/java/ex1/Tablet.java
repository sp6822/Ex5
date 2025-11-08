package ex1;

public class Tablet implements Chargeable {
    private String model;

    public Tablet(String model) {
        this.model = model;
    }

    @Override
    public void charge() {
        System.out.println(model + " - Tablet is now charging.");
    }

    public void readBook(String title) {
        System.out.println(model + " - Opening book: " + title);
    }
}