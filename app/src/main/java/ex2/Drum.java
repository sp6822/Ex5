package ex2;
public class Drum implements Playable {
    private String drumKitBrand;

    public Drum(String drumKitBrand) {
        this.drumKitBrand = drumKitBrand;
    }

    @Override
    public void play() {
        System.out.println(drumKitBrand + " Drums - Playing a bouncy funk beat! (Boom-Tss-Chak)");
    }

    public void performDrumRoll() {
        System.out.println(drumKitBrand + " Drums - Performing a breathtaking drum roll on the snare.");
    }
}