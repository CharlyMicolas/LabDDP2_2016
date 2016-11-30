package tugas1_1606954773;


import java.util.Scanner;

/**
 * Created by Charly on 21/09/2016.
 */
public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("===============================================================================");
        System.out.println("=========Selamat Datang di Aplikasi Latihan Operasi Aritmatika Pecahan=========");
        System.out.println("=========                                                             =========");
        System.out.println("===============================================================================");
        System.out.print("Masukkan nama anda anda       : ");
        String nama = scanner.nextLine();
        System.out.println("Silahkan pilih nomor menu di bawah!");
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



}
