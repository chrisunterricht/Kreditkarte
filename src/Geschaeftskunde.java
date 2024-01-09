public class Geschaeftskunde extends Kunde{

    private String rechtsform;

    public Geschaeftskunde(String name, String rechtsform) {
        super(name, (int)System.currentTimeMillis());
        this.rechtsform = rechtsform;
    }

    public String getRechtsform() {
        return rechtsform;
    }

    public void setFirmierung() {
        this.rechtsform = rechtsform;
    }

    @Override
    public String getType() {
        return "Business";
    }
}
