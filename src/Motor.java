public abstract class Motor {

    public static int prijs;
    protected String merk;
    protected String model;
    protected int bouwjaar;
    protected int kilometerstand;
    protected int hoeveelheidCilinders;

    public Motor(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders){
        this.merk = merk;
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.kilometerstand = kilometerstand;
        this.prijs = prijs;
        this.hoeveelheidCilinders = hoeveelheidCilinders;
    }

    public String toString(){
        return "Een " + this.bouwjaar + " " + this.merk + " " + this.model + " " + this.hoeveelheidCilinders + "-cilinder met een kilometerstand van " + this.kilometerstand + " kilometer. De prijs is EUR " + this.prijs + ",-";
    }
    public String getName() {
        return model;
    }

}
