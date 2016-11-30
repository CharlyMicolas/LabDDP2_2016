package Lab03_1606954773.SoalA;

/**
 * Created by Admin on 23/09/2016.
 */
public class CobaInheritance {

    public static void main(String[] args) {
        //potongan 1
        Hewan misteri = new Hewan("Loch Ness Monster");
        System.out.println(misteri.getJenis());
        System.out.println(misteri);
        System.out.println(new Cicak(false));

        //potongan 2
        Kadal kadal1 = new Kadal("Kadal Sumatra");
        System.out.println(kadal1.getJenis());


        //potongan 3
        Cicak cicak1 = new Cicak(true);
        if (cicak1.isEkorSudahLepas()) {
            System.out.println("Kasihan");
        } else {
            System.out.println("Hiiiiii");
        }

        //potongan 4
        Kadal kadal2 = cicak1;
        Hewan hewan2 = cicak1;
        Object obj = cicak1;

        try {
            Cicak cicak2 = (Cicak)cicak1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //potongan 5
        kadal1.setJenis("Kadal Jawa");
        System.out.println(kadal1.getJenis());
        if (kadal1 instanceof Hewan) {
            Hewan abc = (Hewan) kadal1;
           // System.out.println("Dia Hewan");
        }

    }
}
