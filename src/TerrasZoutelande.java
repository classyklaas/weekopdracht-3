public class TerrasZoutelande extends BedrijfParentClass{

    private static double belasting;

    public TerrasZoutelande(String naam, double belastingpercentage) {
        super(naam, belastingpercentage);
    }

    public static void belastingBijhouden(double hoeveelheidKoffie) {
        belasting = (belasting + hoeveelheidKoffie * 0.09);
        System.out.println("Totale hoeveelheid belasting op deze " + hoeveelheidKoffie + " koppen koffie: EUR " + belasting);
    }

    public String toString() {
        return "Welkom bij restaurant 'Zoutelanden'!";
    }
}