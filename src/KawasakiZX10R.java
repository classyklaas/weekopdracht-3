public class KawasakiZX10R extends Motor implements interfaceMotoren {
    private boolean heeftAbs;

    public KawasakiZX10R(String merk, String model, int bouwjaar, int kilometerstand, int prijs, int hoeveelheidCilinders, boolean heeftAbs) {
        super(merk, model, bouwjaar, kilometerstand, prijs, hoeveelheidCilinders);
        this.heeftAbs = heeftAbs;
    }

    public void geluid(Motor motor) {
        System.out.println("Fun fact: Kawasaki's maken over het algemeen een 'huilend' geluid, omdat ze veelal reguliere 4-cilinders zijn.");
    }
}

