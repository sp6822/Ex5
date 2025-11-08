package ex2;
public class Piano implements Playable {
    private int numberOfKeys;

    public Piano(String numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void play() {
        System.out.println("Piano with " + numberOfKeys + " keys - Playing a soft classical melody. (C4)");
    }

    public void openLid() {
        System.out.println("The piano lid is opened. The sheet music stand is ready.");
    }
}