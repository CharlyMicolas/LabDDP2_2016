package Lab03_1606954773.SoalB.tutorial.demo;

import Lab03_1606954773.SoalB.tutorial.bentuk2D.Lingkaran;
import Lab03_1606954773.SoalB.tutorial.bentuk2D.Persegi;
import Lab03_1606954773.SoalB.tutorial.bentuk2D.SegitigaSamaSisi;
import Lab03_1606954773.SoalB.tutorial.bentuk2D.SegitigaSikuSiku;

/**
 * Created by Admin on 24/09/2016.
 */
public class DemoInterface {
    public static void main(String[] args) {
       //objek bangu2D
        SegitigaSikuSiku segi3Siku = new SegitigaSikuSiku("SiKumbang", 3, 4);
        SegitigaSamaSisi segi3Sisi = new SegitigaSamaSisi("SamaSisi Baru", 8);
        Persegi persegi = new Persegi("Papan Tulis", 10);
        Lingkaran lingkaran = new Lingkaran("Lingling", 8);

        //cetakname, luas, keliling, variable yng dibutuhkan
        //untuk perhitungan setiap object bangun2D di atas

        //Object Segitiga Siku Siku
        System.out.println("Nama    :"+segi3Siku.getNamaBentuk());
        System.out.println("Luas    :"+segi3Siku.getLuas());
        System.out.println("Keliling:"+segi3Siku.getKeliling());
        System.out.println("SisiAlas:"+segi3Siku.getAlas());
        System.out.println("Tinggi  :"+segi3Siku.getTinggi());
        System.out.println("----------------------------------");

        //Object Segitiga Sama Sisi
        System.out.println("Nama    :"+segi3Sisi.getNamaBentuk());
        System.out.println("Luas    :"+segi3Sisi.getLuas());
        System.out.println("Keliling:"+segi3Sisi.getKeliling(segi3Sisi.getAlas()));
        System.out.println("Sisi    :"+segi3Sisi.getAlas());
        System.out.println("Tinggi  :"+segi3Sisi.getTinggi());
        System.out.println("----------------------------------");

        //Object Persegi
        System.out.println("Nama    :"+persegi.getNamaBentuk());
        System.out.println("Luas    :"+persegi.getLuas());
        System.out.println("Keliling:"+persegi.getKeliling());
        System.out.println("Sisi    :"+persegi.getSisi());
        System.out.println("----------------------------------");

        //Object Lingkaran
        System.out.println("Nama    :"+lingkaran.getNamaBentuk());
        System.out.println("Luas    :"+lingkaran.getLuas());
        System.out.println("Keliling:"+lingkaran.getKeliling());
        System.out.println("Radian  :"+lingkaran.getRadian());
    }
}
