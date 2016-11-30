package Lab03_1606954773.SoalB.tutorial.bentuk2D;

/**
 * Created by Admin on 24/09/2016.
 */
public class Persegi implements Bentuk2D {
    private String namaPersegi;
    private int sisi;

    public Persegi(String namaPersegi, int sisi) {
        this.namaPersegi = namaPersegi;
        this.sisi = sisi;
    }

    public String getNamaPersegi() {
        return namaPersegi;
    }

    public void setNamaPersegi(String namaPersegi) {
        this.namaPersegi = namaPersegi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public String getNamaBentuk() {
        return namaPersegi;
    }

    @Override
    public double getKeliling() {
        return 4*this.sisi;
    }

    @Override
    public double getLuas() {
        return this.sisi*this.sisi;
    }
}
