public class ApriliaRSV4RR extends Motor implements interfaceMotoren{

    private boolean isV4;

    public ApriliaRSV4RR(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, boolean isV4) {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.isV4 = isV4;
    }

    public void geluid(Motor motor){
        System.out.println("Aprilia: bekend om de V4. Het geluid kan misschien het best worden vergeleken met een combinatie van een V2 en een reguliere 4-cilinder.");
    };

}
