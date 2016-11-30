package Lab07_1606954773;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Admin on 12/11/2016.
 */
public class Lahan {

    private ArrayList<String> daftarUkuranLahan;
    private Petak[][] petaks;
    private int totalPetak;

    public Lahan() {
        this.daftarUkuranLahan = new ArrayList<String>();
        daftarUkuranLahan.add("5x5");
        this.petaks = new Petak[5][5];
        for(int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                petaks[i][j]= new Petak(i,j,false);
            }
        }
        this.totalPetak = 25;
    }

    public Petak[][] getPetaks() {
        return petaks;
    }

    public void setPetaks(Petak[][] petaks) {
        this.petaks = petaks;
    }

    public ArrayList<String> getDaftarUkuranLahan() {
        return daftarUkuranLahan;
    }

    public void setDaftarUkuranLahan(ArrayList<String> daftarUkuranLahan) {
        this.daftarUkuranLahan = daftarUkuranLahan;
    }

    public int getTotalPetak() {
        return totalPetak;
    }

    public void setTotalPetak(int totalPetak) {
        this.totalPetak = totalPetak;
    }

    public void addListUkuran(String ukuran){
        this.daftarUkuranLahan.add(ukuran);
    }

    public void perluasLahan(String ukuran){
        this.daftarUkuranLahan.add(ukuran);
        String[]pecah = ukuran.split("x");
        int p = Integer.parseInt(pecah[0]);
        int l = Integer.parseInt(pecah[1]);
        int total = p*l;
        this.totalPetak = this.totalPetak+total;
    }

    public void olahLahan(){
        Sawah sawah = new Sawah();
        System.out.println("Lahan sudah diolah pakai cangkul dan traktor!");
    }


}
