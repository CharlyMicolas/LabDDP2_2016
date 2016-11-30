package Tugas2_1606954773_CharlyMicolas;

/**
 * Created by Admin on 13/10/2016.
 */
public class Kucing extends Binatang {


    public Kucing(String nama) {
        super(nama);
    }

    /**
     * Implementasi abstract method di class Binatang
     * @param jarak
     */
    @Override
    public void move(int jarak) {
        System.out.println("Kucing "+this.getNama()+" berlari sejauh "+jarak+" km");
    }


    /**
     * Overload method move
     * @param didekati
     */
    public void move(String didekati) {
        System.out.println("Kucing "+this.getNama()+" mendekati "+didekati);
    }

    /**
     * Implementasi abstract method di class Binatang
     * @param makanan
     */
    @Override
    public void eat(String makanan) {
        System.out.println(this.getNama()+" makan "+ makanan);
    }

    /**
     * Implementasi abstract method di class Binatang
     */
    @Override
    public void bersuara() {
        System.out.println("Kucing "+this.getNama()+": Ngeong ngeong...");
    }

}
