package Lab03_1606954773.SoalA;

/**
 * Created by Admin on 23/09/2016.
 */
public class Hewan implements Cloneable{
    private String jenis;

    public Hewan() {
        System.out.println("Bikin Hewan Default");
        this.jenis = "Default";
    }
    public Hewan(String jenis) {
        System.out.println("Bikin Hewan " + jenis);
        this.jenis = jenis;
    }
    public String getJenis() {
        return this.jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String toString() {
        return "Hewan [ jenis: " + getJenis() + " ]";
    }

    // override method equals

    // untuk membantu pembandingan dua buah Hewan
    public boolean equals(Object obj) {
        // ubah dulu si obj jadi tipe Hewan
        if (obj instanceof Hewan) {
            Hewan yangLain = (Hewan) obj;

            // karena sifat (variable) Hewan
            // hanya ada 1, yaitu jenis - String
            return this.getJenis().equals(yangLain.getJenis());
        } else {
            return false;
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
