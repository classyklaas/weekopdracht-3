public class KawasakiH2R extends Motor {
    private boolean heeftAbs;

    public KawasakiH2R(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, boolean heeftAbs) {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.heeftAbs = heeftAbs;
    }

    public void geluidH2R(interfaceH2R motor){
        System.out.println("De uitlaat van de H2R is een tikkeltje aan de luide kant.");
    }
}
