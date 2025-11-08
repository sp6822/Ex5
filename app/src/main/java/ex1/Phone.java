package ex1;

public class Phone implements Chargeable {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public void charge() {
        System.out.println(model + " - Phone is now charging.");
    }

    public void makeCall(String number) {
        System.out.println(model + " - Calling: " + number);
    }
}