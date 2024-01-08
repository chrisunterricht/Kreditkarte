import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Konto {

    private String kundenvorname;
    private String kundennachname;
    private List<Kreditkarte> karten = new ArrayList<>();
    private int kontonummer;

    // Verwendung von Arraylist
    public Konto(String vorname, String nachname){
        Random r = new Random();
        this.kontonummer = r.nextInt(900) + 100;
        this.kundenvorname = vorname;
        this.kundennachname = nachname;
        karten.add(new Kreditkarte());
    }

    public void removeKreditkarte(Kreditkarte k){
        this.karten.remove(k);
    }

    public void addKreditkarte(){
        this.karten.add(new Kreditkarte());
    }

    public void removeKreditkarteFromList(Kreditkarte k){
        this.karten.remove(k);
    }

    public void addKreditkarteToList(){
        this.karten.add(new Kreditkarte());
    }

    public String getKundenvorname() {
        return kundenvorname;
    }

    public void setKundenvorname(String kundenvorname) {
        this.kundenvorname = kundenvorname;
    }

    public String getKundennachname() {
        return kundennachname;
    }

    public void setKundennachname(String kundennachname) {
        this.kundennachname = kundennachname;
    }

    public List<Kreditkarte> getKarten() {
        return karten;
    }

    public void setKarten(List<Kreditkarte> karten) {
        this.karten = karten;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }
}
