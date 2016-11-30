package Lab01_1606954773.soalB;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RumahSakit cipto = new RumahSakit("Cipto Mangunkusumo","Jl.Diponegoro","20");
			RumahSakit haji = new RumahSakit("RS. Haji Jakarta","Jl.Raya Pondok Gede","15");
			Dokter aji = new Dokter("Aji Cipo",23,"Pria",2000000,"Spesialis Jantung");
			Dokter budi = new Dokter("Budi Gudi",21,"Pria",1500000,"Penyakit Dalam");
			Dokter cinta = new Dokter("Cinta Astuti",25,"Wanita",3000000,"Spesialis Anak");
			Dokter wati = new Dokter("Wati Ayu",22,"Wanita",1500000,"Spesialis Jantung");
			Dokter carla = new Dokter("Carla Siana",24,"Wanita",3000000,"Spesialis Kulit");
			
			Pasien a = new Pasien("Jhon", 18, "Pria", "Aji Cipo", "Tablet");
			Pasien b = new Pasien("Doe", 45, "Pria", "Cinta Astuti", "Sirup");
			Pasien c = new Pasien("Gloria", 55, "Wanita", "Aji Cipo", "Sirup");
			Pasien d = new Pasien("Abi", 18, "Pria", "Wati Ayu", "Tablet");
			Pasien e = new Pasien("Yuna", 23, "Wanita", "Cinta Astuti", "Tablet");
			Pasien f = new Pasien("Yuri", 34, "Wanita", "Aji Cipo", "Tablet");
			Pasien g = new Pasien("Abdul", 15, "Pria", "Wati Ayu", "Sirup");
			Pasien h = new Pasien("Salim", 44, "Pria", "Carla Siana", "Tablet");
			Pasien i = new Pasien("Nining", 35, "Wanita", "Budi Gudi", "Sirup");
			Pasien j = new Pasien("Dodon", 9, "Pria", "Wati Ayu", "Tablet");
			Pasien k = new Pasien("Kero", 33, "Pria");
			Pasien l = new Pasien("Bayu", 22, "Pria");
			Pasien m = new Pasien("Endah", 19, "Wanita");
			Pasien n = new Pasien("Nur", 16, "Wanita");
			
			cipto.addDokter(aji);
			cipto.addDokter(carla);
			
			haji.addDokter(budi);
			haji.addDokter(cinta);
			haji.addDokter(wati);
			cipto.addPasien(a);
			cipto.addPasien(c);
			cipto.addPasien(f);
			cipto.addPasien(h);
			cipto.addPasien(k);
			cipto.addPasien(l);
			cipto.addPasien(m);
			haji.addPasien(i);
			haji.addPasien(b);
			haji.addPasien(e);
			haji.addPasien(d);
			haji.addPasien(g);
			haji.addPasien(j);
			haji.addPasien(n);
			
			//Soal I
			/**
			 * semua pasien yang dirawat di rumah sakit cipto
			 */
			int x;
			System.out.println("Daftar Pasien RS Cipto");
			for(x=0; x<cipto.getDaftarPasien().size();x++){
				System.out.println("	"+cipto.getDaftarPasien().get(x).getNama());
			}
			/**
			 * semua pasien yang dirawat di rumah sakit haji
			 */
			System.out.println("Daftar Pasien RS Haji");
			for(x=0; x<haji.getDaftarPasien().size();x++){
				System.out.println("	"+cipto.getDaftarPasien().get(x).getNama());
			}
			
			
			//Soal II
			/**
			 * jumlah ruang rawat rumah sakit cipto
			 */
		
			System.out.println("Ruang Kosong RS Cipto "+ cipto.jlhRuangKosong()+ " ruangan");
			
			
			/**
			 * jumlah ruang rawat rumah sakit cipto
			 */
			System.out.println("Ruang Kosong RS Haji "+ haji.jlhRuangKosong()+ " ruangan");
			
			
			
			//Soal III
			/**
			 * pasien yang dirawat oleh Dokter Aji Cipo
			 * 
			 */
			System.out.println("Daftar Pasien Dr. Aji Cipo:");
			for(x=0;x<cipto.getDaftarPasien().size();x++){
				if(cipto.getDaftarPasien().get(x).getNamaDokter().equals("Aji Cipo")){
					System.out.println("	"+cipto.getDaftarPasien().get(x).getNama());
				}
				
			}
		
			for(x=0;x<haji.getDaftarPasien().size();x++){
				if(haji.getDaftarPasien().get(x).getNamaDokter().equals("Aji Cipo")){
					System.out.println("	"+haji.getDaftarPasien().get(x).getNama());
				}
				
				
			}
			
			//Soal IV
			/**
			 * pasien yang belum ditangani oleh dokter di rumah sakit Cipto MangunKusumo
			 */
		
			System.out.print("Pasien yg belum ditangani di RS Cipto:");
			for(x=0;x<cipto.getDaftarPasien().size();x++){
				if(cipto.getDaftarPasien().get(x).getNamaDokter().equals("")){
					System.out.println("	"+cipto.getDaftarPasien().get(x).getNama());
				}
				
			}
	
			
			//Soal V
			/**
			 * hitung total biaya obat yang dikeluarkan oleh rumah sakit jika harga
sirup = 500.000 dan tablet = 250.000 pada rumah sakit Cipto
			 */
			int totalBiayaObat = 0;
			for(x=0;x<cipto.getDaftarPasien().size();x++){
				if(cipto.getDaftarPasien().get(x).getJenisObat().equals("Sirup")){
					totalBiayaObat = totalBiayaObat+500000;
				}
				if(cipto.getDaftarPasien().get(x).getJenisObat().equals("Tablet")){
					totalBiayaObat = totalBiayaObat+250000;
				}
			}
			System.out.println("Total Biaya Obat RS Cipto "+totalBiayaObat);
			
			
			//Soal VI
		/**
		 * hitung total biaya pengeluaran rumah sakit cipto dan haji (asumsi 
biaya total = total gaji dokter + biaya obat pasien
		 */
			
			//total gaji Dokter di kedua RS
			int totalGajiDokter = 0;
			int totalBiayaObatPasien = 0;
			
			for(x=0;x<cipto.getDaftarDokter().size();x++){
				totalGajiDokter = totalGajiDokter + cipto.getDaftarDokter().get(x).getGajiPerBulan();
			}
			
			
			for(x=0;x<cipto.getDaftarPasien().size();x++){
				if(cipto.getDaftarPasien().get(x).getJenisObat().equals("Sirup")){
					totalBiayaObatPasien = totalBiayaObat+500000;
				}
				if(cipto.getDaftarPasien().get(x).getJenisObat().equals("Tablet")){
					totalBiayaObatPasien = totalBiayaObat+250000;
				}
			}
			
			int biayaTotal = totalGajiDokter+ totalBiayaObatPasien;
			
			System.out.println("Total Biaya RS Cipto "+biayaTotal);
			
		
			totalGajiDokter = 0;
			totalBiayaObatPasien = 0;
			for(x=0;x<haji.getDaftarDokter().size();x++){
				totalGajiDokter = totalGajiDokter + haji.getDaftarDokter().get(x).getGajiPerBulan();
			}
			
			for(x=0;x<haji.getDaftarPasien().size();x++){
				if(haji.getDaftarPasien().get(x).getJenisObat().equals("Sirup")){
					totalBiayaObatPasien = totalBiayaObat+500000;
				}
				if(haji.getDaftarPasien().get(x).getJenisObat().equals("Tablet")){
					totalBiayaObatPasien = totalBiayaObat+250000;
				}
			}
			
			biayaTotal = totalGajiDokter+ totalBiayaObatPasien;
			System.out.println("Total Biaya RS Haji "+biayaTotal);
			
			
			
			

	}

}
