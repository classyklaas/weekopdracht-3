public class BMWS1000RR extends Motor implements interfaceMotoren{
    private boolean heeftLedVerlichting;

    public BMWS1000RR(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, boolean heeftLedVerlichting) {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.heeftLedVerlichting = heeftLedVerlichting;
    }

    public void geluid(Motor motor){
        System.out.println("BMW's staan er onder andere om bekend niet al te veel geluid te maken. De S1000RR is de enige uitzondering.");
    };
}
