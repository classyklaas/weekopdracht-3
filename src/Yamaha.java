public class Yamaha extends Motor implements interfaceMotoren{
    private int hoeveelheidWielen;

    public Yamaha(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, int hoeveelheidWielen) throws ConstructorException {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.hoeveelheidWielen = hoeveelheidWielen;
    }

    public String toString(){
        return "Een " + this.bouwjaar + " " + this.merk + " " + this.model + " " + this.hoeveelheidCilinders + "-cilinder met een kilometerstand van " + this.kilometerstand + " kilometer. De prijs is EUR " + this.prijs + ",-. De " + this.model + " is een " + this.hoeveelheidWielen + "-wieler";
    }

    public void geluid(Motor motor){
        System.out.println("Fun fact: veel Yamaha's hebben een onregelmatige/niet reguliere ontsteking, hetgeen een uniek geluid oplevert.");
    };
}
