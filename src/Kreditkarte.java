public class Kreditkarte {
    private int geheimzahl;
    private String typ = "Visa";
    private double verfuegungsrahmen = 2000.0;

    // Die Konstruktoren mit unterschiedlicher Parametersignatur
    public Kreditkarte() {
    }

    public Kreditkarte(double verfuegungsrahmen){
        this.verfuegungsrahmen = verfuegungsrahmen;
    }
    public Kreditkarte (double verfuegungsrahmen, int geheimzahl){
        this.verfuegungsrahmen = verfuegungsrahmen;
        this.geheimzahl = geheimzahl;
    }
    public Kreditkarte(double verfuegungsrahmen, int geheimzahl, String typ){
        this.verfuegungsrahmen = verfuegungsrahmen;
        this.geheimzahl = geheimzahl;
        this.typ = typ;
    }

    // Die beiden Methoden, die direkt etwas anzeigen
    public void geheimzahlAnzeigen() {
        System.out.println(this.geheimzahl);
    }

    public void verfuegungsRahmenAnzeigen() {
        System.out.println(this.verfuegungsrahmen);
    }

    // ...und die Setter & Getter
    public int getGeheimzahl() {
        return geheimzahl;
    }

    public void setGeheimzahl(int geheimzahl) {
        this.geheimzahl = geheimzahl;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getVerfuegungsrahmen() {
        return verfuegungsrahmen;
    }

    public void setVerfuegungsrahmen(double verfuegungsrahmen) {
        this.verfuegungsrahmen = verfuegungsrahmen;
    }
}
