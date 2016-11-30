package Lab03_1606954773.SoalB.tutorial.bentuk2D;

/**
 * Created by Admin on 24/09/2016.
 */
public class Lingkaran implements Bentuk2D {

    private String namaLingkara;
    private int radian;
    public static final double phi = 3.14;

    public Lingkaran(String namaLingkara, int radian) {
        this.namaLingkara = namaLingkara;
        this.radian = radian;
    }

    public String getNamaLingkara() {
        return namaLingkara;
    }

    public void setNamaLingkara(String namaLingkara) {
        this.namaLingkara = namaLingkara;
    }

    public int getRadian() {
        return radian;
    }

    public void setRadian(int radian) {
        this.radian = radian;
    }

    @Override
    public String getNamaBentuk() {
        return namaLingkara;
    }

    @Override
    public double getKeliling() {
        return phi*this.radian*2;
    }

    @Override
    public double getLuas() {
        return phi*this.radian*this.radian;
    }
}
