package Lab07_1606954773;

/**
 * Created by Admin on 12/11/2016.
 */
public class Pasar {

    private int stockAyamKampung;
    private AyamKampung ayamKampung;
    private int stockBibitTanaman;
    private BibitTananam bibitTananam;
    private int stockBibiPohon;
    private BibitPohon bibitPohon;

    public Pasar() {
        this.stockAyamKampung = 10;
        this.ayamKampung = new AyamKampung();
        this.stockBibitTanaman = 10;
        this.bibitTananam = new BibitTananam();
        this.stockBibiPohon = 10;
        this.bibitPohon = new BibitPohon();
    }


}
