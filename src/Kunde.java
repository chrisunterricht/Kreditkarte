public class Kunde {
    private String vorname;
    private String nachname;
    private final int kundennummer;

    public Kunde(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
        this.kundennummer = (int)System.currentTimeMillis();
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getKundennummer() {
        return this.kundennummer;
    }
}
