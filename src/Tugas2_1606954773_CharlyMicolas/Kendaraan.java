package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 12/10/2016.
 */
public abstract class Kendaraan implements Benda {

    protected int kapasitas;
    protected String BBM;

    public Kendaraan(int kapasitas, String BBM) {
        this.kapasitas = kapasitas;
        this.BBM = BBM;
    }

    //Class Kendaraan punya abstract method move
    public abstract void move(int jarak);

    //Setter dan Getter
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getBBM() {
        return BBM;
    }

    public void setBBM(String BBM) {
        this.BBM = BBM;
    }

}
