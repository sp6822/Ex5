package ex2;
public class MainApp2 {
    public static void main(String[] args) {
        Playable[] band = {
                new Guitar(6),
                new Piano("C Major"),
                new Drum("Bass Drum")
        };
        for (Playable instrument : band) {
            instrument.play();
        }
    }
}