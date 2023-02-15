package WuerfelSpiel;

// Hauptprogramm
public class Main {
    public static void main(String[] args) {
        String[] spieler = {"Alice", "Bob"};

        Spiel spiel1 = new Wuerfelspiel1();
        spiel1.setSpieler(spieler);
        spiel1.spiele();

        Spiel spiel2 = new Wuerfelspiel2();
        spiel2.setSpieler(spieler);
        spiel2.spiele();
    }
}
