import java.util.Scanner;

public class UserInterface {
    public PrivatKunde createKunde(){
        String vorname = this.getLine("Vorname eingeben: ");
        String nachname = this.getLine("Nachname eingeben: ");
        return new PrivatKunde(vorname, nachname);
    }

    private String getLine(String hint){
        System.out.println(hint);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}
