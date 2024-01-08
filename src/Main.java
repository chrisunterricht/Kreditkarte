public class Main {
    public static void main(String[] args) {
        Kreditkarte[] kreditkartenArray = {
                new Kreditkarte(),
                new Kreditkarte(5000, 1234),
                new Kreditkarte(10000, 1234, "Mastercard")
        };
        for (Kreditkarte kreditkarte : kreditkartenArray){
            System.out.println(kreditkarte.getTyp());
            System.out.println(kreditkarte.getVerfuegungsrahmen());
            System.out.println(kreditkarte.getGeheimzahl());
            kreditkarte.geheimzahlAnzeigen();
            kreditkarte.verfuegungsRahmenAnzeigen();
        }

    }
}