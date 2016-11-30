package tugas1_1606954773;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Charly on 23/09/2016.
 *
 * Class ini akan meyimpan informasi nama anak yang melakukan latihan, 10 soal yang ditampilkan serta perhitungan score yang diperoleh anak
 *
 */
public class Latihan {

    private String nama_anak;                       // setiap latihan anak akan memasukkan nama
    private long batas_waktu;                       // batas waktu yang diset anak
    private ArrayList<Soal> soalLatihans;           // 10 soal yang digenerate secara random
    private ArrayList<JawabanAnak> jawabanAnaks;    // jawaban yang dimasukkan anak
    private int jlhJawabanBenarSesuaiWaktu;         // jumlah jawaban benar sesuai waktu
    private int jlhJawabanBenarMelewatiWaktu;       // jumlah jawaban benar melewati waktu
    private int jlhJawabanSalah;                    // jumlah jawaban salah

    public Latihan(String nama_anak) {
        this.nama_anak = nama_anak;
        this.batas_waktu = 20;
        this.soalLatihans = new ArrayList<Soal>();
        this.create10SoalLatihan();
        this.jawabanAnaks = new ArrayList<JawabanAnak>();

        this.jlhJawabanBenarSesuaiWaktu = 0;
        this.jlhJawabanBenarMelewatiWaktu = 0;
        this.jlhJawabanSalah = 0;

        System.out.println("Kerjakan soal latihan di bawah ini! Batas waktu pengerjaan tiap soal = "+this.batas_waktu+" detik.");
    }

    public Latihan(String nama_anak, int batas_waktu) {
        this.nama_anak = nama_anak;
        this.batas_waktu = batas_waktu;
        this.soalLatihans = new ArrayList<Soal>();
        this.create10SoalLatihan();
        this.jawabanAnaks = new ArrayList<JawabanAnak>();

        this.jlhJawabanBenarSesuaiWaktu = 0;
        this.jlhJawabanBenarMelewatiWaktu = 0;
        this.jlhJawabanSalah = 0;

        System.out.println("Kerjakan Soal Latihan Pecahan berikut! Batas waktu pengerjaan per soal adalah "+this.batas_waktu+" detik.");
    }

    public String getNama_anak() {
        return nama_anak;
    }

    public void setNama_anak(String nama_anak) {
        this.nama_anak = nama_anak;
    }

    public long getBatas_waktu() {
        return batas_waktu;
    }

    public void setBatas_waktu(int batas_waktu) {
        this.batas_waktu = batas_waktu;
    }

    public ArrayList<Soal> getSoalLatihan() {
        return soalLatihans;
    }

    public void setSoalLatihan(ArrayList<Soal> soalLatihan) {
        this.soalLatihans = soalLatihan;
    }

    public int getJlhJawabanBenarSesuaiWaktu() {
        return jlhJawabanBenarSesuaiWaktu;
    }

    public void setJlhJawabanBenarSesuaiWaktu(int jlhJawabanBenarSesuaiWaktu) {
        this.jlhJawabanBenarSesuaiWaktu = jlhJawabanBenarSesuaiWaktu;
    }

    public int getJlhJawabanBenarMelewatiWaktu() {
        return jlhJawabanBenarMelewatiWaktu;
    }

    public void setJlhJawabanBenarMelewatiWaktu(int jlhJawabanBenarMelewatiWaktu) {
        this.jlhJawabanBenarMelewatiWaktu = jlhJawabanBenarMelewatiWaktu;
    }

    public int getJlhJawabanSalah() {
        return jlhJawabanSalah;
    }

    public void setJlhJawabanSalah(int jlhJawabanSalah) {
        this.jlhJawabanSalah = jlhJawabanSalah;
    }

    /**
     * Generate 10 soal pecahan random
     */
    private void create10SoalLatihan() {

        Random randomNo = new Random();
        for (int count = 0; count < 10; count++) {

            int numePec1 = 0;
            int denoPec1 = 0;
            int numePec2 = 0;
            int denoPec2 = 0;

            //Random bilangan antara -9 sampai 9, kecuali 0
            while(numePec1==0){
                numePec1 = randomNo.nextInt(9 + 1 + 9) - 9;
            }
            while(denoPec1 == 0){
                denoPec1 = randomNo.nextInt(9 + 1 + 9) - 9;
            }
            while(numePec2 == 0){
                numePec2 = randomNo.nextInt(9 + 1 + 9) - 9;
            }
            while(denoPec2 == 0){
                denoPec2 = randomNo.nextInt(9 + 1 + 9) - 9;
            }
            /*
            while(numePec1==0){
                numePec1 = randomNo.nextInt(4) + 1;
            }
            while(denoPec1 == 0){
                denoPec1 = randomNo.nextInt(4) + 1;
            }
            while(numePec2 == 0){
                numePec2 = randomNo.nextInt(4) + 1;
            }
            while(denoPec2 == 0){
                denoPec2 = randomNo.nextInt(4) + 1;
            } */

            int operasi = randomNo.nextInt(4) + 1;

            Fraction pecahan1 = new Fraction(numePec1, denoPec1);
            pecahan1.simplifyFraction();

            Fraction pecahan2 = new Fraction(numePec2, denoPec2);
            pecahan2.simplifyFraction();

            switch (operasi) {
                case 1: {
                    Soal soal = new Soal(pecahan1, "+", pecahan2);

                    this.soalLatihans.add(soal);
                    break;
                }
                case 2: {
                    Soal soal = new Soal(pecahan1, "-", pecahan2);
                    this.soalLatihans.add(soal);
                    break;
                }
                case 3: {
                    Soal soal = new Soal(pecahan1, "x", pecahan2);
                    this.soalLatihans.add(soal);
                    break;
                }
                case 4: {
                    Soal soal = new Soal(pecahan1, ":", pecahan2);
                    this.soalLatihans.add(soal);
                    break;
                }
                default:
                    break;
            }
        }
    }

    /**
     * Menampilkan soal satu persatu
     */
    public void kerjakanSoal(String nama_anak){
        Scanner input = new Scanner(System.in);

        int nomor=0;
        for(int i=0; i<this.getSoalLatihan().size();i++){
            //menampilkan line soal
            nomor++;
            System.out.print("("+nomor+") "+this.getSoalLatihan().get(i).displaySoal());

            //menghitung lama pengerjaan soal
            long start = System.currentTimeMillis();
            String jawaban = input.next();
            long elapseTime = countTime(start);

            Fraction fraction = convertJawabanFromStringToFraction(jawaban);
            fraction.simplifyFraction();

            JawabanAnak jawabanAnak = new JawabanAnak(elapseTime,fraction);
            this.jawabanAnaks.add(jawabanAnak);
        }
        reviewJawaban(nama_anak);
        tampilkanScore(nama_anak);

    }

    private void reviewJawaban(String nama_anak) {
        System.out.println("===============================================================================");
        System.out.println("===============================Review Jawaban==================================");
        int nomor=0;
        for(int i=0; i<this.getSoalLatihan().size();i++){
            //menampilkan line soal
            nomor++;
            System.out.println("("+nomor+") "+this.getSoalLatihan().get(i).reviewSoal());
            System.out.println("Jawaban anda        : "+this.jawabanAnaks.get(i).getJawabanSoal().display()+ "("+isRight(i)+")");
            System.out.println("Lama pengerjaannya  : "+this.jawabanAnaks.get(i).getWaktuMenjawabPerSoal()+" detik.");
        }
    }

    //Cek jawaban Benar atau Salah
    private String isRight(int i) {
        String jawab = null;
        if(this.getSoalLatihan().get(i).getHasilOperasi().display().equals(this.jawabanAnaks.get(i).getJawabanSoal().display())){
            jawab = "Benar";
        }
        else {
            jawab = "Salah";
        }

        return jawab;
    }

    /**
     * Convert Inputan Jawaban user dari String ke Fraction
     * @param jawaban
     * @return
     */
    private Fraction convertJawabanFromStringToFraction(String jawaban){
        if(!jawaban.contains("/")){
            jawaban = jawaban+"/1";
        }

        String[] parts = jawaban.split("/");
        int nume = Integer.parseInt(parts[0]);
        int deno = Integer.parseInt(parts[1]);
        Fraction fraction = new Fraction(nume,deno);

        return fraction;
    }

    /**
     * Hitung waktu pengerjaan tiap soal
     * @param startTime
     * @return
     */
    private long countTime(long startTime){
        long estimatedTime = System.currentTimeMillis() - startTime;
        estimatedTime = estimatedTime/1000;
        return estimatedTime;
    }

    /**
     * Memeriksa jawaban yang dimasukkan anak dan waktu yang dibutuhkan mengerjakan setiap soal
     * @return
     */
    private void periksaJawaban(){
        int benar=0;
        int benarTapiTelat=0;
        int salah=0;
        for(int i=0; i<this.getSoalLatihan().size();i++){
            if(this.getSoalLatihan().get(i).getHasilOperasi().display().equals(this.jawabanAnaks.get(i).getJawabanSoal().display())){
                if(this.batas_waktu > this.jawabanAnaks.get(i).getWaktuMenjawabPerSoal()){
                    benar++;
                }
                else{
                    benarTapiTelat++;
                }
            }
            else{
                salah++;
            }

        }
        this.setJlhJawabanBenarSesuaiWaktu(benar);
        this.setJlhJawabanBenarMelewatiWaktu(benarTapiTelat);
        this.setJlhJawabanSalah(salah);
    }

    /**
     * Menjumlahkan total point yang diperoleh
     * @return
     */
    private int hitunganTotalPoint(){
        int totalPoint = (this.getJlhJawabanBenarSesuaiWaktu()*10)+(this.getJlhJawabanBenarMelewatiWaktu()*5)+(this.getJlhJawabanSalah()*0);

        return totalPoint;
    }

    /**
     * Menapilkan hasil rekapitulasi score
     */
    public void tampilkanScore(String nama_anak){
        System.out.println("===============================================================================");
        System.out.println("=============================Rekapitulasi Score================================");
        this.periksaJawaban();
        System.out.println("Jawaban benar kurang dari batas waktu   = "+this.getJlhJawabanBenarSesuaiWaktu());
        System.out.println("Jawaban benar melebihi batas waktu      = "+this.getJlhJawabanBenarMelewatiWaktu());
        System.out.println("Jawaban salah                           = "+this.getJlhJawabanSalah());
        System.out.println("TOTAL POINT: "+this.hitunganTotalPoint()+"("+this.getJlhJawabanBenarSesuaiWaktu()+" + "+this.getJlhJawabanBenarMelewatiWaktu()+" + "+this.getJlhJawabanSalah()+")");

        tawarkanLagi(nama_anak);

    }

    /**
     * Menawarkan pilihan kepada user di awal
     * @param nama
     */
    public void tampilkanPilihan(String nama){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Silahkan pilih menu di bawah!");
        System.out.println("(1) Latihan Soal dengan menggunakan batas waktu pengerjaan tiap soal = 20 detik");
        System.out.println("(2) Latihan Soal dengan menggunakan batas waktu pengerjaan tiap soal yang lain");
        System.out.println("(3) Keluar");
        System.out.print("Masukkan nomor pilihan anda   :");
        int pilihan = scanner2.nextInt();
        if(pilihan==1){
            Latihan latihan = new Latihan(nama);
            latihan.kerjakanSoal(nama);
        }
        else if(pilihan==2){
            System.out.print("Masukkan batas waktu pengerjaan tiap soal yang lain :");
            int batas_waktu = scanner2.nextInt();
            Latihan latihan = new Latihan(nama, batas_waktu);
            latihan.kerjakanSoal(nama);
        }
        else{
            System.exit(0);
        }
    }

    /**
     * Jika user sudah selesai mengerjakan soal dia bisa mencoba lagi
     * @param nama_anak
     */
    public void tawarkanLagi(String nama_anak){
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================================");
        System.out.println("Silahkan pilih menu di bawah!");
        System.out.println("(1) Coba Lagi");
        System.out.println("(2) Keluar");
        System.out.print("Masukkan nomor pilihan anda   :");
        int pilihan = sc.nextInt();
        if(pilihan==1){
            tampilkanPilihan(nama_anak);
        }
        else {
            System.exit(0);
        }
    }






}
