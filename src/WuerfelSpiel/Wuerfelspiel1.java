package WuerfelSpiel;

// Klasse WuerfelSpiel.Wuerfelspiel1
public class Wuerfelspiel1 implements Spiel {
    private String[] spieler;

    public void setSpieler(String[] spieler) {
        this.spieler = spieler;
    }

    public void spiele() {
        int[] ergebnisse = new int[spieler.length];
        for (int i = 0; i < spieler.length; i++) {
            int summe = 0;
            for (int j = 0; j < 3; j++) {
                int wurf = (int) (Math.random() * 6) + 1;
                summe += wurf;
            }
            ergebnisse[i] = summe;
            System.out.println(spieler[i] + " hat " + summe + " Punkte gewürfelt.");
        }

        int maxPunkte = 0;
        int gewinner = -1;
        for (int i = 0; i < spieler.length; i++) {
            if (ergebnisse[i] > maxPunkte) {
                maxPunkte = ergebnisse[i];
                gewinner = i;
            }
        }

        System.out.println("Das WuerfelSpiel.Spiel ist beendet! Der Gewinner ist " + spieler[gewinner] + ".");
    }
}
