import java.util.ArrayList;

public class lijstjeMotoren {

    public static ArrayList<Motor> aangeschafteMotoren = new ArrayList<>();

    public static void lijstjeMotoren(Motor motor){
        aangeschafteMotoren.add(motor);
    }

    public static ArrayList<Motor> getAangeschafteMotoren() {
        for (Motor a : aangeschafteMotoren){

        System.out.println(a.model);
        }
        return aangeschafteMotoren;
    }
}

