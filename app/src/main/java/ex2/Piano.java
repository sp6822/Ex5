package ex2;

public class Piano implements Playable {
    private String scale;

    public Piano(String scale) {
        this.scale = scale;
    }

    @Override
    public void play() {
        System.out.println("Piano - Playing a melody in the " + scale + " scale.");
    }

    public void openLid() {
        System.out.println("The piano lid is opened.");
    }
}