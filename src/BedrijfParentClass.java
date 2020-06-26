public abstract class BedrijfParentClass {

    protected String naam;
    protected double belastingpercentage;

    public BedrijfParentClass(String naam, double belastingpercentage) {
        this.naam = naam;
        this.belastingpercentage = belastingpercentage;
    }

    public static void belastingBijhouden(double verkoopprijs) {
    }

    public String toString() {
        return "Dit is een willekeurig bedrijf";
    }
}


