import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws GeenVoorraadException, ConstructorException, methodeException {

        Scanner scanner = new Scanner(System.in);

        Motorzaak motorzaak = new Motorzaak("Kostelijk Motorrijden", 0.20);
        Motorrijder motorrijder = new Motorrijder("Klaas", 100000);
        System.out.println(motorzaak);
        motorzaak.motorVerkopen();
        motorrijder.motorKopen();
        while (true) {
            System.out.println(" ");
            System.out.println("Nog een motor kopen? ja/nee");
            String antwoord = scanner.nextLine();
            if (antwoord.equals("ja")) {
                Motorzaak.motorVerkopen();
                Motorrijder.motorKopen();
            } else {
                System.out.println(" ");
                break;
            }
        }
        System.out.println("Uiteraard gaan we een ritje maken. Welke motor pak je?");
        lijstjeMotoren.getAangeschafteMotoren();
        String welkemotor = scanner.nextLine();

        if (welkemotor.equals("RSV4 RR") || welkemotor.equals("RSV4 Factory")) {
            System.out.println("De Aprilia is gestart! Laten we een rondje rijden. Wat wordt de afstand?");
        } else if (welkemotor.equals("S1000RR")) {
            System.out.println("De BMW is gestart! Laten we een rondje rijden. Wat wordt de afstand?");
        } else if (welkemotor.equals("Panigale 1199") || welkemotor.equals("Panigale Superleggera")) {
            System.out.println("De Ducati wilde uiteindelijk met pijn en moeite starten! Laten we een rondje rijden. Wat wordt de afstand?");
        } else if (welkemotor.equals("ZX-10R") || welkemotor.equals("H2R")) {
            System.out.println("De Kawasaki is gestart! Laten we een rondje rijden. Wat wordt de afstand?");
        } else if (welkemotor.equals("Niken")) {
            System.out.println("De Yamaha is gestart! Laten we een rondje rijden. Wat wordt de afstand?");
        }

        int afstand = Integer.valueOf(scanner.nextLine());
        if (afstand >= 250) {
            RondjeRijden rondjeRijden = new RondjeRijden();
            System.out.println(rondjeRijden);
            Tankstation tankstation = new Tankstation("Tankstation licht ontvlambaar", 0.80);
            System.out.println("Hoeveel liter benzine heb je getankt?");
            int hoeveelheidBenzine = Integer.valueOf(scanner.nextLine());
            Tankstation.belastingBijhouden(hoeveelheidBenzine);
            System.out.println(tankstation);
            TerrasZoutelande terrasjePakken = new TerrasZoutelande("Zoutelanden", 0.09);
            System.out.println(terrasjePakken);
            System.out.println("Hoeveel koppen koffie heb je gedronken?");
            int hoeveelheidKoffie = Integer.valueOf(scanner.nextLine());
            TerrasZoutelande.belastingBijhouden(hoeveelheidKoffie);

        } else {
            RondjeRijden rondjeRijden = new RondjeRijden();
            System.out.println(rondjeRijden);
        }
    }
}

