package Lab03_1606954773.SoalA;

/**
 * Created by Admin on 23/09/2016.
 */
public class Kadal extends Hewan {

    public Kadal() {
        super("Kadal Default");
        System.out.println("Eh ini bikin Kadal lowh");
    }

    public Kadal(String jenis) {
        super(jenis);
    }

    public String getJenis() {
        return "Hipster " + super.getJenis();
    }
}
