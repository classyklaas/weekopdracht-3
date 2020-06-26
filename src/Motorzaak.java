public class Motorzaak extends BedrijfParentClass{

    private static double omzet;
    private static double belasting;
    private static int voorraadApriliaRSV4RR;
    private static int voorraadApriliaRSV4RRFactory;
    private static int voorraadBMWS1000RR;
    private static int voorraadDucatiPanigale;
    private static int voorraadDucatiSuperleggera;
    private static int voorraadKawasakiZX10R;
    private static int voorraadKawasakiH2R;
    private static int voorraadYamahaNiken;

    public Motorzaak(String naam, double belastingpercentage){
        super(naam, belastingpercentage);
        this.voorraadApriliaRSV4RR = 10;
        this.voorraadApriliaRSV4RRFactory = 5;
        this.voorraadBMWS1000RR = 10;
        this.voorraadDucatiPanigale = 10;
        this.voorraadDucatiSuperleggera = 2;
        this.voorraadKawasakiZX10R = 10;
        this.voorraadKawasakiH2R = 2;
        this.voorraadYamahaNiken = 0;
    }

    public static void belastingBijhouden(Motor motor) {
        belasting = belasting + Motor.prijs * 0.20;
        System.out.println("Totale hoeveelheid belasting: EUR " + belasting);
    }

    public static void omzetBijhouden(Motor motor){
        omzet = omzet + Motor.prijs;
        System.out.println("Totale omzet motorzaak: " + omzet);
    }

    public static int voorraadApriliaRRBijwerken(Motor motor) throws GeenVoorraadException {
        voorraadApriliaRSV4RR = voorraadApriliaRSV4RR - 1;
        if (voorraadApriliaRSV4RR >= 0) {
            System.out.println("De huidige voorraad Aprilia RSV4 RR-modellen is " + voorraadApriliaRSV4RR);
        } else {
            throw new GeenVoorraadException(
                    "Alle RSV4 RR-modellen zijn verkocht!");
        }
        return voorraadApriliaRSV4RR;
    }

    public static int voorraadApriliaFactoryBijwerken(Motor motor) throws GeenVoorraadException {
        voorraadApriliaRSV4RRFactory = voorraadApriliaRSV4RRFactory - 1;
        if (voorraadApriliaRSV4RR >= 0) {
            System.out.println("De huidige voorraad Aprilia RSV4 Factory-modellen is " + voorraadApriliaRSV4RRFactory);
        } else {
            throw new GeenVoorraadException(
                    "Alle RSV4 RR Factory-modellen zijn verkocht!");
        }
        return voorraadApriliaRSV4RRFactory;
    }

    public static int voorraadBMWS1000RRBijwerken(Motor motor) throws GeenVoorraadException {
        voorraadBMWS1000RR = voorraadBMWS1000RR - 1;
        if (voorraadBMWS1000RR >= 0) {
            System.out.println("De huidige voorraad BMW S1000RR-modellen is " + voorraadBMWS1000RR);
        } else {
            throw new GeenVoorraadException(
                    "Alle S1000RR-modellen zijn verkocht!");
        }
        return voorraadBMWS1000RR;
    }

    public static int voorraadDucati1199Bijwerken(Motor motor) throws GeenVoorraadException {
        voorraadDucatiPanigale = voorraadDucatiPanigale - 1;
        if (voorraadDucatiPanigale >= 0) {
            System.out.println("De huidige voorraad Ducati 1199-modellen is " + voorraadDucatiPanigale);
        } else {
            throw new GeenVoorraadException(
                    "Alle 1199-modellen's zijn verkocht!");
        }
        return voorraadDucatiPanigale;
    }

    public static int voorraadDucatiSuperLeggeraBijwerken(Motor motor) throws GeenVoorraadException {
        voorraadDucatiSuperleggera = voorraadDucatiSuperleggera - 1;
        if (voorraadDucatiSuperleggera >= 0) {
            System.out.println("De huidige voorraad Ducati Superleggera-modellen is " + voorraadDucatiSuperleggera);
        } else {
            throw new GeenVoorraadException(
                    "Alle Superleggera's zijn verkocht!");
        }
        return voorraadDucatiSuperleggera;
    }

    public static int voorraadKawasakiZX10RBijwerken(Motor motor) throws GeenVoorraadException {
        voorraadKawasakiZX10R = voorraadKawasakiZX10R - 1;
        if (voorraadDucatiSuperleggera >= 0) {
            System.out.println("De huidige voorraad Kawasaki ZX-10R-modellen is " + voorraadKawasakiZX10R);
        } else {
            throw new GeenVoorraadException(
                    "Alle ZX-10R-modellen zijn verkocht!");
        }
        return voorraadKawasakiZX10R;
    }

    public static int voorraadKawasakiH2Bijwerken(Motor motor) throws GeenVoorraadException {
        voorraadKawasakiH2R = voorraadKawasakiH2R - 1;
        if (voorraadKawasakiH2R >= 0) {
            System.out.println("De huidige voorraad Kawasaki H2R-modellen is " + voorraadKawasakiH2R);
        } else {
            throw new GeenVoorraadException(
                    "Alle H2-modellen zijn verkocht!");
        }
        return voorraadKawasakiH2R;
    }

//    Ik heb de onderstaande methode uiteindelijk niet gebruikt, zodat ik de Yamaha-constructor doelbewust een exception kon laten throwen
//    public static int voorraadYamahaNikenBijwerken(Motor motor) throws GeenVoorraadException {
//        voorraadYamahaNiken = voorraadYamahaNiken - 1;
//        if (voorraadYamahaNiken >= 0) {
//            System.out.println("De huidige voorraad Yamaha Nikne-modellen is " + voorraadYamahaNiken);
//        } else {
//            throw new GeenVoorraadException(
//                    "Alle Niken-modellen zijn verkocht!");
//        }
//        return voorraadYamahaNiken;
//    }

    public static void motorVerkopen() throws ConstructorException {

        System.out.println(" ");

        ApriliaRSV4RR motor1 = new ApriliaRSV4RR("Aprilia", "RSV4 RR", 2020, 0, 20000, 4, true);
        System.out.println("1. " + motor1 + ". Aantal op voorraad: " + Motorzaak.voorraadApriliaRSV4RR);
        ApriliaRSV4RRFactory motor2 = new ApriliaRSV4RRFactory("Aprilia", "RSV4 Factory", 2020, 0, 25000, 4, true);
        System.out.println("2. " + motor2 + ". Aantal op voorraad: " + Motorzaak.voorraadApriliaRSV4RRFactory);
        BMWS1000RR motor3 = new BMWS1000RR("BMW", "S1000RR", 2020, 0, 25000, 4, true);
        System.out.println("3. " + motor3 + ". Aantal op voorraad: " + Motorzaak.voorraadBMWS1000RR);
        DucatiSuperleggera motor4 = new DucatiSuperleggera("Ducati", "Panigale Superleggera", 2018, 0, 75000, 2, "rood");
        System.out.println("4. " + motor4 + ". Aantal op voorraad: " + Motorzaak.voorraadDucatiSuperleggera);
        DucatiPanigale1199 motor5 = new DucatiPanigale1199("Ducati", "Panigale 1199", 2011, 17500, 13999, 2, "rood");
        System.out.println("5. " + motor5 + ". Aantal op voorraad: " + Motorzaak.voorraadDucatiPanigale);
        KawasakiZX10R motor6 = new KawasakiZX10R("Kawasaki", "ZX-10R", 2015, 10000, 11999, 4, true);
        System.out.println("6. " + motor6 + ". Aantal op voorraad: " + Motorzaak.voorraadKawasakiZX10R);
        KawasakiH2R motor7 = new KawasakiH2R("Kawasaki", "H2R", 2016, 10000, 19999, 4, true);
        System.out.println("7. " + motor7 + ". Aantal op voorraad: " + Motorzaak.voorraadKawasakiH2R);
        Yamaha motor8 = new Yamaha("Yamaha", "Niken", 2020, 0, 20000, 4, 3);
        System.out.println("8. " + motor8 + ". Aantal op voorraad: " + Motorzaak.voorraadYamahaNiken);

        System.out.println(" ");
        System.out.println("Waar gaat uw voorkeur naar uit?");
    }

    public String toString() {
        return "Welkom bij motorzaak " + this.naam + "! We hebben de volgende modellen in de aanbieding:";
    }
}
