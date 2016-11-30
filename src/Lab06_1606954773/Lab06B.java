package Lab06_1606954773;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author charly.micolas
 * NPM 		: 1606954773
 * Aslab 	: Agung Putra Pasaribu
 */

public class Lab06B {

	
	public static void main(String[] args) throws Exception{
		
		String NIP = "", nama = "", divisi = "";
		double jam = 0;
		boolean exception;
		int barisan=0;
		
		try{	
			File inputFile = new File("RekapLembur2.txt");
			Scanner  input = new Scanner(inputFile);
			PrintWriter out = new PrintWriter("UpahLembur2.txt");
			PrintWriter outException =  new PrintWriter("UpahLemburException.txt");
			
			while(input.hasNext()){
				exception=false;
				barisan++;
				String baris = input.nextLine();
				String[] attribut = baris.split(" ");
				try{
					NIP = attribut[0];
					nama = attribut[1];
					divisi = attribut[2];
					
					//berpotensi salah number format
					jam = Double.parseDouble(attribut[3]);
				
					//Hitung upah
					UpahLembur penghitung = UpahLembur.buatPenghitung(divisi);
					double upah = penghitung.hitung(jam);
					
					//Cek jika tidak ada exeption maka cetak ke file output
					if(exception==false){
						out.println(String.format("%s %s %s %.1f", NIP, nama, divisi, upah));
						out.flush();
					}
				}
				//menangkap apabila ada error array index
				catch(ArrayIndexOutOfBoundsException e){
					outException.println(String.format("Pada baris-%d terdapat ketidaksesuaian indeks", barisan));
					exception = true;
				}
				//menangkap error number format
				catch(NumberFormatException e){
					exception = true;
					outException.println(String.format("%s %s %s memiliki format jam salah", NIP, nama, divisi));
				}
				//general exception
				catch(Exception e){
					outException.println(String.format(e.getMessage()));
				}
				outException.flush();
			}
			input.close();
			out.close();
			outException.close();
			
		}catch(FileNotFoundException e){
			exception = true;
			System.out.println("File ngak ditemukan");
		}
		

		
	}

}
