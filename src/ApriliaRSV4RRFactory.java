
public class ApriliaRSV4RRFactory extends Motor implements interfaceMotoren {

    private boolean isV4;

    public ApriliaRSV4RRFactory(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, boolean isV4) {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.isV4 = isV4;
    }

    public void geluid(Motor motor) throws methodeException {

        throw new methodeException(
                "Exception op de methode 'geluid' in de class 'ApriliaRSV4RRFactory'");
    }
}
