public class DucatiSuperleggera extends Motor implements interfaceMotoren{
    private String kleur;

    public DucatiSuperleggera(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, String kleur) {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.kleur = kleur;
    }

    public String toString(){
        return "Een " + this.bouwjaar + " " + this.merk + " " + this.model + " " + this.hoeveelheidCilinders + "-cilinder (kleur: " + this.kleur + ") met een kilometerstand van " + this.kilometerstand + " kilometer. De prijs is EUR " + this.prijs + ",-";
    }

    public void geluid(Motor motor){
        System.out.println("Fun fact: Ducati's maken over het algemeen een 'brullend' geluid, omdat ze veelal 2-cilinders zijn.");
    };
}

