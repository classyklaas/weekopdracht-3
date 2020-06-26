import java.util.Scanner;

public class Motorrijder {

    private String naam;
    private static double portemonnee;

    public Motorrijder(String naam, int portemonnee) {
        this.naam = naam;
        this.portemonnee = portemonnee;
    }

    public static double portemonneeBijwerken(int prijs) {
        portemonnee = portemonnee - prijs;
        System.out.println("Je hebt nog EUR " + portemonnee + " in je portemonnee.");
        return portemonnee;
    }

    public static double getPortemonnee() {
        return portemonnee;
    }

    public static void motorKopen() throws GeenVoorraadException, ConstructorException, methodeException {

        Scanner scanner = new Scanner(System.in);
        int nummerTeKopenMotor = scanner.nextInt();

        if (nummerTeKopenMotor == 1) {
            ApriliaRSV4RR motor1 = new ApriliaRSV4RR("Aprilia", "RSV4 RR", 2020, 0, 17500, 4, true);
            System.out.println("De Aprilia RSV4 RR");
            portemonneeBijwerken(17500);
            Motorzaak.voorraadApriliaRRBijwerken(motor1);
            Motorzaak.omzetBijhouden(motor1);
            Motorzaak.belastingBijhouden(motor1);
            motor1.geluid(motor1);
            lijstjeMotoren.lijstjeMotoren(motor1);
        }
        if (nummerTeKopenMotor == 2) {
            ApriliaRSV4RRFactory motor2 = new ApriliaRSV4RRFactory("Aprilia", "RSV4 Factory", 2020, 0, 25000, 4, true);
            System.out.println("De Aprilia RSV4 Factory");
            portemonneeBijwerken(25000);
            Motorzaak.voorraadApriliaFactoryBijwerken(motor2);
            Motorzaak.omzetBijhouden(motor2);
            Motorzaak.belastingBijhouden(motor2);
            motor2.geluid(motor2);
            lijstjeMotoren.lijstjeMotoren(motor2);
        }
        if (nummerTeKopenMotor == 3) {
            BMWS1000RR motor3 = new BMWS1000RR("BMW", "S1000RR", 2020, 0, 25000, 4, true);
            System.out.println("De BMW S1000RR");
            portemonneeBijwerken(25000);
            Motorzaak.voorraadBMWS1000RRBijwerken(motor3);
            Motorzaak.omzetBijhouden(motor3);
            Motorzaak.belastingBijhouden(motor3);
            motor3.geluid(motor3);
            lijstjeMotoren.lijstjeMotoren(motor3);
        }
        if (nummerTeKopenMotor == 4) {
            DucatiSuperleggera motor4 = new DucatiSuperleggera("Ducati", "Panigale Superleggera", 2018, 0, 75000, 2, "rood");
            System.out.println("De Ducati Panigale Superleggera");
            Motorzaak.voorraadDucatiSuperLeggeraBijwerken(motor4);
            Motorzaak.omzetBijhouden(motor4);
            Motorzaak.belastingBijhouden(motor4);
            portemonneeBijwerken(75000);
            motor4.geluid(motor4);
            lijstjeMotoren.lijstjeMotoren(motor4);
        }
        if (nummerTeKopenMotor == 5) {
            DucatiPanigale1199 motor5 = new DucatiPanigale1199("Ducati", "Panigale 1199", 2011, 17500, 13999, 2, "rood");
            System.out.println("De Ducati Panigale 1199");
            Motorzaak.voorraadDucati1199Bijwerken(motor5);
            Motorzaak.omzetBijhouden(motor5);
            Motorzaak.belastingBijhouden(motor5);
            portemonneeBijwerken(13999);
            motor5.geluid(motor5);
            lijstjeMotoren.lijstjeMotoren(motor5);
        }
        if (nummerTeKopenMotor == 6) {
            KawasakiZX10R motor6 = new KawasakiZX10R("Kawasaki", "ZX-10R", 2015, 10000, 11999, 4, true);
            System.out.println("Kawasaki ZX-10R");
            Motorzaak.voorraadKawasakiZX10RBijwerken(motor6);
            Motorzaak.omzetBijhouden(motor6);
            Motorzaak.belastingBijhouden(motor6);
            portemonneeBijwerken(11999);
            motor6.geluid(motor6);
            lijstjeMotoren.lijstjeMotoren(motor6);
        }
        if (nummerTeKopenMotor == 7) {
            KawasakiH2R motor7 = new KawasakiH2R("Kawasaki", "H2R", 2016, 10000, 19999, 4, true);
            System.out.println("De Kawasaki H2");
            Motorzaak.voorraadKawasakiH2Bijwerken(motor7);
            Motorzaak.omzetBijhouden(motor7);
            Motorzaak.belastingBijhouden(motor7);
            portemonneeBijwerken(19999);
            lijstjeMotoren.lijstjeMotoren(motor7);
            motor7.geluidH2R(new interfaceH2R() {
                @Override
                public void geluidH2R(interfaceH2R motor) {
                    System.out.println("Test");
                }
            });
        }
        if (nummerTeKopenMotor == 8) {
            Yamaha motor8 = new Yamaha("Yamaha", "Niken", 2020, 0, 20000, 4, 3);

            throw new ConstructorException(
                    "Excuses, we blijken geen Niken-modellen op voorraad te hebben");
        }
    }
}



