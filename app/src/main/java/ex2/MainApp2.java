package ex2;

import ex2.Playable;

public class MainApp2 {
    public static void main(String[] args) {
        Playable[] band = {
                new Guitar(7),
                new Piano("A Minor"),
                new Drum("bass")
        };
        for (Playable instrument : band)
        {
            instrument.play();
        }
    }
}