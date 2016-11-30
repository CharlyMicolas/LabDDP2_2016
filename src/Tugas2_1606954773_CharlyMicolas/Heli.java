package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 13/10/2016.
 */
public class Heli extends Kendaraan {

    public Heli(int kapasitas, String bbm) {
        super(kapasitas, bbm);
    }

    /**
     * Implementasi abstract method di class Kendaraan
     * @param jarak
     */
    @Override
    public void move(int jarak) {
        //Mobil terbang setinggi 14 km
        System.out.println("Mobil terbang setinggi "+jarak+" km");
    }
}
