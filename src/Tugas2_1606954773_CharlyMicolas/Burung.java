package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 13/10/2016.
 */
public class Burung extends Binatang{

    public Burung(){
        super("Tanpa Nama");

    }

    /**
     * Implementasi abstract method di class Binatang
     * @param jarak
     */
    @Override
    public void move(int jarak) {
        //Burung Tanpa Nama terbang setinggi 35 km
        System.out.println("Burung "+this.getNama()+" terbang setinggi "+jarak+" km");
    }

    /**
     * Implementasi abstract method di class Binatang
     * @param makanan
     */
    @Override
    public void eat(String makanan) {
        //Tanpa Nama makan Larva
        System.out.println(this.getNama()+" makan "+makanan);
    }

    /**
     * Implementasi abstract method di class Binatang
     */
    @Override
    public void bersuara() {
        ///Burung Twiti: Cit cit cuit...
        System.out.println("Burung "+this.getNama()+": Cit cit cuit...");
    }
}
