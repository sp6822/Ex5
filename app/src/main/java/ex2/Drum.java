package ex2;

public class Drum implements Playable {
    private String drumType;

    public Drum(String drumType) {
        this.drumType = drumType;
    }

    @Override
    public void play() {
        System.out.println(drumType + " drum - Hitting a heavy beat.");
    }

    public void performDrumRoll() {
        System.out.println(drumType + " drum - Performing a quick roll.");
    }
}