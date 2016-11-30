package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 12/10/2016.
 */
public abstract class Binatang implements Benda {

    protected String nama;
    protected int umur;

    public Binatang(String nama) {
        this.nama = nama;
        this.umur = 1;//Umur Default
    }

    //Class binatang punya 3 abstract method
    public abstract void move(int jarak);
    public abstract void eat(String makanan);
    public abstract void bersuara();

    //Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
