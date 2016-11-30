package Lab03_1606954773.SoalB.tutorial.bentuk2D;

/**
 * Created by Admin on 24/09/2016.
 */
public class Segitiga implements Bentuk2D{
    protected String namaSegitiga;
    protected double alas;
    protected double tinggi;

    public Segitiga(String namaSegitiga, double alas, double tinggi) {
        this.namaSegitiga = namaSegitiga;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public String getNamaSegitiga() {
        return namaSegitiga;
    }

    public void setNamaSegitiga(String namaSegitiga) {
        this.namaSegitiga = namaSegitiga;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public String getNamaBentuk() {
        return namaSegitiga;
    }

    /**
     * Mencari keliling segitiga
     * @return
     */
    @Override
    public double getKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(this.alas,2)+Math.pow(this.tinggi,2));
        double keliling = this.alas+this.tinggi+sisiMiring;
        return keliling;
    }

    /**
     * Mencari keliling segitiga sama sisi
     * @param sisi
     * @return
     */

    public double getKeliling(double sisi) {
        double keliling = 3*sisi;
        return keliling;
    }

    /**
     * Mencari Luas
     * @return
     */
    @Override
    public double getLuas() {
        double Luas = 0;
        Luas = this.alas*this.tinggi/2;
        return Luas;
    }
}
