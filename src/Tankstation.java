public class Tankstation extends BedrijfParentClass {

    private static double accijnzen;

    public Tankstation(String naam, double belastingpercentage) {
        super(naam, belastingpercentage);
    }

    public static void belastingBijhouden(double verkoopprijs) {
        accijnzen = (accijnzen + verkoopprijs * 0.80);
        System.out.println("Totale hoeveelheid accijnzen van deze tankbeurt: EUR " + accijnzen);
    }

    public String toString() {
        return "De staatskas is weer gevuld, let's go!";
    }
}


