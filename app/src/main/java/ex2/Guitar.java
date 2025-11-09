package ex2;

public class Guitar implements Playable {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Guitar with " + numberOfStrings + " strings - Strumming a powerful chord.");
    }

    public void tune() {
        System.out.println("Guitar - Tuning the strings.");
    }
}