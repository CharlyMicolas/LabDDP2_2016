package Lab06_1606954773;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author charly.micolas
 * NPM 		: 1606954773
 * Aslab 	: Agung Putra Pasaribu
 */

public class Lab06A {
	public static void main(String[] args)throws Exception{
		String NIP, nama, divisi;
		double jam;
		
		File inputFile = new File("RekapLembur.txt");
		Scanner input = new Scanner(inputFile);
		PrintWriter out = new PrintWriter("UpahLembur.txt");
		
		
		while(input.hasNext()){
			//simpan setiap line
			String baris = input.nextLine();
			
			//split berdasarkan space
			String[] attribut = baris.split(" ");
			NIP = attribut[0];
			nama = attribut[1];
			divisi = attribut[2];
			jam = Double.parseDouble(attribut[3]);
			
			//Hitung upah 
			UpahLembur penghitung = UpahLembur.buatPenghitung(divisi);
			double upah = penghitung.hitung(jam);
			
			//cetak ke file UpahLembur
			out.println(String.format("%s %s %s %.1f", NIP, nama, divisi, upah));
			
		}
		
		input.close();
		out.close();
	}

}
