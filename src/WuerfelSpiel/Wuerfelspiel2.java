package WuerfelSpiel;

// Klasse WuerfelSpiel.Wuerfelspiel2
public class Wuerfelspiel2 implements Spiel {
    private String[] spieler;

    public void setSpieler(String[] spieler) {
        this.spieler = spieler;
    }

    public void spiele() {
        int[] ergebnisse = new int[spieler.length];
        for (int i = 0; i < spieler.length; i++) {
            int wurf = (int) (Math.random() * 6) + 1;
            ergebnisse[i] = wurf;
            System.out.println(spieler[i] + " hat " + wurf + " gewürfelt.");
        }

        int maxWurf = 0;
        int gewinner = -1;
        for (int i = 0; i < spieler.length; i++) {
            if (ergebnisse[i] > maxWurf) {
                maxWurf = ergebnisse[i];
                gewinner = i;
            }
        }

        System.out.println("Das WuerfelSpiel.Spiel ist beendet! Der Gewinner ist " + spieler[gewinner] + ".");
    }
}
