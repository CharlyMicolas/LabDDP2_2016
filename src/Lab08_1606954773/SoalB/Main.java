package Lab08_1606954773.SoalB;

import javafx.geometry.Pos;

import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;

/**
 * Created by Charly Micolas on 19/11/2016.
 */

public class Main {

    public static void main(String[] args) {

        JOptionPane jOptionPane = new JOptionPane();
        String x, y, diameter, panjang, lebar, alas, tinggi, sisiSegitiga, alasSegitiga, tinggiSegitiga;


        // Minta input ordinat x dan y
        x = jOptionPane.showInputDialog(null,"masukkan koordinat x");
        y = jOptionPane.showInputDialog(null,"masukkan koordinat y");
        int xx = Integer.parseInt(x);
        int yy = Integer.parseInt(y);
        int d, p, l, a, t, s, at, tt;

        //Minta masukan nama bangun datar
        String nama = jOptionPane.showInputDialog(null,"masukkan nama bangun");



            //Buat frame dan bangun yang akan diisi dalam frame
            if(nama.equalsIgnoreCase("lingkaran")){
                diameter = jOptionPane.showInputDialog(null,"masukkan panjang diameter");
                d = Integer.parseInt(diameter);
                Position lingkaran = new Lingkaran(xx,yy,d);
                Frame frame = new Frame(nama, lingkaran);
            }
            else if(nama.equalsIgnoreCase("persegi")){
                panjang = jOptionPane.showInputDialog(null,"masukkan panjang persegi");
                p = Integer.parseInt(panjang);
                lebar = jOptionPane.showInputDialog(null,"masukkan lebar persegi");
                l = Integer.parseInt(lebar);
                Position persegi = new Persegi(xx, yy, p, l);
                Frame frame = new Frame(nama, persegi);
            }
            else if(nama.equalsIgnoreCase("jajar genjang")){
                alas = jOptionPane.showInputDialog(null,"masukkan alas jajar genjang");
                a = Integer.parseInt(alas);
                tinggi = jOptionPane.showInputDialog(null,"masukkan tinggi jajar genjang");
                t = Integer.parseInt(tinggi);
                Position jajarGenjang = new JajarGenjang(xx, yy, a, t);
                Frame frame = new Frame(nama, jajarGenjang);
            }
            else if(nama.equalsIgnoreCase("segitiga sama sisi")){
                sisiSegitiga = jOptionPane.showInputDialog(null,"masukkan sisi segitiga sama sisi");
                s = Integer.parseInt(sisiSegitiga);
                Position samasisi = new SegitigaSamasisi(xx, yy, s);
                Frame frame = new Frame(nama, samasisi);
            }
            else if(nama.equalsIgnoreCase("segitiga siku-siku")){
                alasSegitiga = jOptionPane.showInputDialog(null,"masukkan alas segitiga sama sisi");
                at = Integer.parseInt(alasSegitiga);
                tinggiSegitiga = jOptionPane.showInputDialog(null,"masukkan tinggi segitiga sama sisi");
                tt = Integer.parseInt(tinggiSegitiga);
                Position sikusiku = new SegitigaSikusiku(xx, yy, at, tt);
                Frame frame = new Frame(nama, sikusiku);
            }
            else{
                jOptionPane.showMessageDialog(null, "Bangun Datar Tidak Dikenali", "Warning" ,JOptionPane.ERROR_MESSAGE);
            }
        }

}

