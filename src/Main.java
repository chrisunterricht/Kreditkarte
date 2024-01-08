import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kunde k = new Kunde("Horst", "Müller");
        Konto ko = new Konto(k);
        ko.addKreditkarte();
        ko.addKreditkarte();
        System.out.printf("Zum Konto mit der Kontonummer %d von %s %s gehören die folgenden Kreditkarten:%n",
                ko.getKontonummer(), ko.getKunde().getVorname(), ko.getKunde().getNachname());
        for (Kreditkarte karte : ko.getKarten()){
            System.out.println(karte.getKreditkartennummer());
        }

    }
}