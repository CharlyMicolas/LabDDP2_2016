package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 13/10/2016.
 */
public class Mobil extends Kendaraan {

    private String merk;

    public Mobil(String merk, int kapasitas, String bbm) {
        super(kapasitas, bbm);
        this.merk = merk;
    }

    //Setter dan Getter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * Implementasi abstract method di class Kendaraan
     * @param jarak
     */
    @Override
    public void move(int jarak) {
        //Mobil Do car melaju sejauh 98 km
        System.out.println("Mobil "+this.getMerk()+" melaju sejauh "+jarak+"km");
    }


}
