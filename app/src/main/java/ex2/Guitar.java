package ex2;
public class Guitar implements Playable {
    private String type;

    public Guitar(int type) {
        this.type = type;
    }

    @Override
    public void play() {
        System.out.println(type + " Guitar - Playing a loud rock chord! (G Major)");
    }

    public void tune() {
        System.out.println(type + " Guitar - Tuning the strings to perfect pitch.");
    }
}