public class Main {
    public static void main(String[] args) {
        Kunde k = new PrivatKunde("Horst", "Müller");
        Konto ko = new Konto(k);
        System.out.println(ko.getType());
        ko.addKreditkarte();
        ko.addKreditkarte();
        System.out.printf("Zum Konto mit der Kontonummer %d von %s %s gehören die folgenden Kreditkarten:%n",
                ko.getKontonummer(), ((PrivatKunde)ko.getKunde()).getVorname(), ko.getKunde().getName());
        for (Kreditkarte karte : ko.getKarten()){
            System.out.println(karte.getKreditkartennummer());
        }

    }
}