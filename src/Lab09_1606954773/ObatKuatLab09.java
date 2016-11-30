package Lab09_1606954773;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Dimension;

/**
 * Main class, membuat frame untuk ditampilkan
 *
 * @author hafiyyansf
 * @version 25/11/2016
 */
public class ObatKuatLab09 {
    /**
     * Main method, membuat JFrame, membuat objek JPanel
     * Ukuran frame akan menyesuaikan dari JPanel
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
		 * BUATLAH FRAME, BUAT JPANEL DENGAN MEMANFAATKAN KELAS LOVECALCULATOR
		 * FRAME HARUS :
		 *   -  PROGRAM TERMINATE ON FRAME CLOSE
		 *   -  DITAMPILKAN
		 *   -  MEMAMNFAATKAN KELAS LOVECALCULATOR
		 */
        //TODO: implementasi kodingan anda dibawah ini
        JFrame frame = new JFrame();
        frame.setTitle("Ramalan Cinta");
        frame.setSize(600, 300);
        LoveCalculator loveCalculator = new LoveCalculator();
        frame.add(loveCalculator);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

/**
 * Class LoveCalculator yang extends JPanel
 * didalamnya merupakan implementasi LoveCalculator,
 * Layouting, penghitungan kadarCinta, pembuatan objek-objek gui lainnya
 *
 * @author hafiyyansf
 * @version 25/11/2016
 */
class LoveCalculator extends JPanel {
    private static final long serialVersionUID = 1L; // biarkan saja

    /*
     * SUDAH DIBERIKAN VARIABLE DIBAWAH INI UNTUK MEMBANTU
     * ANDA BOLEH MENAMBAH VARIABLE LAINNYA JIKA DIRASA PERLU
     */
    private JLabel cinta, judul, hasil, labelNama1, labelNama2;
    private JTextField namaPertama, namaKedua;
    private JButton submit;

    public static PanelData dataKamu = new PanelData("Nama Kamu");
    public static PanelData dataPasangan = new PanelData("Nama Pasangan Kamu");

    /**
     * Constructor LoveCalculator, dipanggil pertama kali objek ini dibuat
     */
    public LoveCalculator() {
        // membuat label untuk judul di paling atas
        setLayout(new BorderLayout());
        judul = new JLabel("Ramalan Cinta");

        setLayout(new BorderLayout());
        judul.setHorizontalAlignment(SwingConstants.CENTER); // (optional) membuat text rata tengah
        add(judul, BorderLayout.NORTH);

        // membuat label untuk menampilkan hasil
        // hasil akan digunakan untuk menampilkan hasil kadar cinta yang sudah dihitung
        hasil = new JLabel("0 %");
        hasil.setFont(new Font(hasil.getFont().getName(), Font.PLAIN, 50)); // (optional) membuat font text menjadi besar
        hasil.setHorizontalAlignment(SwingConstants.CENTER); // (optional) membuat text rata tengah

		/*
		 * BUATLAH KODINGAN UNTUK MENGATUR TATA LETAK OBJEK-OBJEK DIATAS
		 * INTINYA ADALAH AGAR GUI ANDA MUNCUL, TERTATA RAPI,
		 * LEBIH BAIK LAGI JIKA ANDA MAMPU MIRIP SEPERTI DI SOAL
		 *
		 * JANGAN LUPA, TOMBOLNYA DIBERI SESUATU AGAR PEKA SAAT DI KLIK
		 * MELAKUKAN PENGHITUNGAN KADARCINTA DAN MENAMPILKANNYA
		 */

        //TODO: implementasi kodingan anda dibawah

        PanelData dataKamu = new PanelData("Nama Kamu");
        dataKamu.setPreferredSize(new Dimension(200, 100));
        PanelData dataPasangan = new PanelData("Nama Pasangan Kamu");
        dataPasangan.setPreferredSize(new Dimension(200, 100));
        add(dataKamu, BorderLayout.WEST);
        add(dataPasangan, BorderLayout.EAST);

        add(hasil, BorderLayout.SOUTH);
        add(hasil, BorderLayout.CENTER);
        submit = new JButton("Hitung Cinta");
        submit.setPreferredSize(new Dimension(600, 100));
        submit.addActionListener(new HitungListener(dataKamu, dataPasangan));
        add(submit, BorderLayout.SOUTH);


        // set ukuran keseluruhan panel menjadi 500(width) x 200(height)
        // perubahan ini juga akan memengaruhi ukuran frame
        setPreferredSize(new Dimension(600, 200));
    }

    /**
     * Method static untuk membantu menghitung kadarCinta seseorang
     * yang ditentukan dari karakter2 masing-masing orang
     * tidak perlu mengganti method dibawah ini, manfaatkan saja
     *
     * @param orang1
     * @param orang2
     * @return kadarCinta seseorang
     */
    private static int hitungCinta(String orang1, int tanggal1, String bulan1, int tahun1, String orang2, int tanggal2, String bulan2, int tahun2) {
        if(orang1.equalsIgnoreCase(null) || orang2.equals(null) || tahun1==0 || tahun2==0 || tanggal1==0 || tanggal2==0){
            return 0;
        }

        int kadarCinta = 0;
        int total1 = 1;
        int total2 = 1;

        for (int i = 0; i < orang1.length(); i++) {
            total1 *= orang1.charAt(i);
        }
        for (int i = 0; i < bulan1.length(); i++) {
            total1 += bulan1.charAt(i);
        }
        for (int j = 0; j < orang2.length(); j++) {
            total2 *= orang2.charAt(j);
        }
        for (int j = 0; j < bulan2.length(); j++) {
            total2 += bulan2.charAt(j);
        }

        total1 += tanggal1 * tahun1;
        total2 += tanggal2 * tahun2;

        System.out.println(total1);

        kadarCinta = total1 + total2;
        kadarCinta = kadarCinta % 50 + 50;

        return kadarCinta;
    }

    /**
     * Inner class hasil implementasi ActionListener
     * Berguna untuk mendeteksi adanya action yang masuk
     * Gunakan kelas ini untuk menjalankan action ketika tombol dipencet
     *
     * @author hafiyyansf
     * @version 25/11/2016
     */

    private class HitungListener implements ActionListener {
        private PanelData dataKamu;
        private PanelData dataPasangan;

        public  HitungListener(PanelData dataKamu, PanelData dataPasangan){
            this.dataKamu = dataKamu;
            this.dataPasangan= dataPasangan;
        }

        public void actionPerformed(ActionEvent event) {
            String orang1 = dataKamu.getjTextFieldNama().getText(); // mendapat nama orang pertama
            String orang2 = dataPasangan.getjTextFieldNama().getText(); // mendapat nama orang kedua

            String tgl1 = dataKamu.getjTextFieldTanggal().getText();
            String tgl2 = dataPasangan.getjTextFieldTanggal().getText();
            int tanggal1=0, tanggal2=0;
            String bulan1 =  dataKamu.getjComboBoxBulan().getSelectedItem().toString();
            String bulan2 =  dataKamu.getjComboBoxBulan().getSelectedItem().toString();

            try{
                tanggal1 = Integer.parseInt(tgl1);
                tanggal2 = Integer.parseInt(tgl2);

            } catch(NumberFormatException exception) {
                System.out.println("Date is not a number");
            }
            int tahun1=0, tahun2=0;
            try{
                tahun1 = Integer.parseInt(dataKamu.getjTextFieldTahun().getText());
                tahun2 = Integer.parseInt(dataKamu.getjTextFieldTahun().getText());

            } catch(NumberFormatException exception) {
                System.out.println("Year is not a number");
            }


            Integer nilai = hitungCinta(orang1, tanggal1, bulan1, tahun1, orang2, tanggal2, bulan2, tahun2);
            hasil.setText(nilai + " %");
        }
    }
}
