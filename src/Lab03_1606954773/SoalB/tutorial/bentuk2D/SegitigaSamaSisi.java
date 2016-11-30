package Lab03_1606954773.SoalB.tutorial.bentuk2D;

/**
 * Created by Admin on 24/09/2016.
 */
public class SegitigaSamaSisi extends Segitiga{

    public SegitigaSamaSisi(String namaSegitiga, double sisi) {
        super(namaSegitiga, sisi, sisi);
        double tinggi = cariTinggiSamaSisi(sisi);
        super.setTinggi(tinggi);
    }

    private double cariTinggiSamaSisi(double sisi){
        double tinggi = Math.sqrt(sisi*sisi-(sisi/2)*(sisi/2));
        return tinggi;
    }




}
