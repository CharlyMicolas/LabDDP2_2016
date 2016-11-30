package Lab01_1606954773.soalA;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Universitas ui = new Universitas ("Universitas I", "Jl. Raya no.1");
		Universitas itb = new Universitas ("Insitut TB", "Jl. Umum no.3");
		Pegawai os = new Pegawai ("Obeth Simatupang", 40, "Jl. Cemara no.5", 30000, 160);
		Pegawai pm = new Pegawai ("Pradana Malih", 27, "Jl. Banteng no.10", 25000, 137);
		Pegawai si = new Pegawai ("Setyo Ikhlas", 38, "Jl. Mawar no.87", 40000, 162);
		Dosen ddp = new Dosen("Dodi Darmawan Pradana", 32, "Jl. Nyiur no. 21", 45000, 151);
		Dosen sc = new Dosen("Susi Chaniago", 35, "Jl. Kucing Siam no. 53", 40000, 160);
		Dosen sda = new Dosen("Sylvia D Anies", 46, "Jl. Cicak no. 7", 55000, 147);
		Mahasiswa ik = new Mahasiswa ("Ilham Kurnia", 19, "Jl. Serbet no.8", 6000000, 21);
		Mahasiswa daa = new Mahasiswa ("Diana Annisa Abdullah", 21, "Jl. Bungur no.65", 6000000, 18);
		Mahasiswa md = new Mahasiswa ("Mukhlis Darari", 20, "Jl. Kayumanis no.31", 5000000, 24);
		Mahasiswa psd = new Mahasiswa ("Paul Sarjono Dudi", 22, "Jl. Kedondong no.13", 5000000, 15);
		Mahasiswa pok = new Mahasiswa ("Patria Oesman Karina", 18, "Jl. Waru no.63", 6000000, 21);
		Mahasiswa tba = new Mahasiswa ("Tulus Berkat Aritonang", 21, "Jl. Puncak no.84", 6000000, 18);
		ui.addPegawai(os);
		ui.addPegawai(pm);
		ui.addDosen(ddp);
		ui.addDosen(sc);
		ui.addMahasiswa(ik);
		ui.addMahasiswa(daa);
		ui.addMahasiswa(md);
		ui.addMahasiswa(psd);
		itb.addPegawai(si);
		itb.addDosen(sda);
		itb.addMahasiswa(pok);
		itb.addMahasiswa(tba);
		
		//kerjakan Soal I
		/**
		 * Nama dosen yang ada di Universitas I
		 */
		System.out.println("Nama dosen yang ada di Universitas I:");
		for(int i=0; i<ui.getDaftarDosen().size();i++){
			System.out.println("	"+ui.getDaftarDosen().get(i).getNamaDosen());
		}
		
		//kerjakan Soal II
		/**
		 * Total Gaji Obeth Simatupang
		 */
		System.out.println("Total Gaji Obeth Simatupang = "+os.getGajiPerjam()*os.getTotalJamKerja());
		
		//kerjakan Soal III
		/**
		 * Rata-rata umur mahasiswa Institut TB
		 */
		// Jumlah semua umur mahasiswa
		int sum = 0;
		for(int i=0; i<itb.getDaftarMahasiswa().size(); i++){
			sum =  sum+ itb.getDaftarMahasiswa().get(i).getUmur();
		}
		// banyak mahasiswa ITB
		int n = itb.getDaftarMahasiswa().size();
		
		// pembulatan rata rata
		int mean = sum/n;
		
		System.out.println("Rata-rata umur mahasiswa Institut TB = "+mean+" tahun");
		
		//kerjakan Soal IV
		/**
		 * 
		 * pengeluaran gaji dosen dan pegawai Universitas I
		 */
		int i;
		int totalGajiDosen = 0;
		for(i=0; i<ui.getDaftarDosen().size();i++){
			int hitungGaji = ui.getDaftarDosen().get(i).getGajiPerjam()*ui.getDaftarDosen().get(i).getTotalJamKerja();
			totalGajiDosen = totalGajiDosen + hitungGaji;
		}
		
		int totalGajiPegawai = 0;
		for(i=0; i<ui.getDaftarPegawai().size();i++){
			int hitungGaji = ui.getDaftarPegawai().get(i).getGajiPerjam()*ui.getDaftarPegawai().get(i).getTotalJamKerja();
			totalGajiPegawai = totalGajiPegawai + hitungGaji;
		}
		
		int totalPengeluaran = totalGajiDosen+totalGajiPegawai;
		/**
		 * Pemasukan dari mahasiswa Universitas I
		 */
		int totalUangSemester = 0;
		for(i=0; i<ui.getDaftarMahasiswa().size();i++){
			totalUangSemester = totalUangSemester + ui.getDaftarMahasiswa().get(i).getUangSemester();
		}
		
		// Cek untuk atau Rugi
		System.out.println("Universitas I mengalami "+ ui.cekUntungRugi(totalPengeluaran, totalUangSemester));
		
		/**
		 * 
		 * pengeluaran gaji dosen dan pegawai Institut TB
		 */
		totalGajiDosen = 0;
		for(i=0; i<itb.getDaftarDosen().size();i++){
			int hitungGaji = itb.getDaftarDosen().get(i).getGajiPerjam()*itb.getDaftarDosen().get(i).getTotalJamKerja();
			totalGajiDosen = totalGajiDosen + hitungGaji;
		}
		
		totalGajiPegawai = 0;
		for(i=0; i<itb.getDaftarPegawai().size();i++){
			int hitungGaji = itb.getDaftarPegawai().get(i).getGajiPerjam()*itb.getDaftarPegawai().get(i).getTotalJamKerja();
			totalGajiPegawai = totalGajiPegawai + hitungGaji;
		}
		
		totalPengeluaran = totalGajiDosen+totalGajiPegawai;
		/**
		 * Pemasukan dari mahasiswa Universitas I
		 */
		totalUangSemester = 0;
		for(i=0; i<itb.getDaftarMahasiswa().size();i++){
			totalUangSemester = totalUangSemester + itb.getDaftarMahasiswa().get(i).getUangSemester();
		}
		
		// Cek untuk atau Rugi
		System.out.println("Institut TB mengalami "+ itb.cekUntungRugi(totalPengeluaran, totalUangSemester));
				
		

	}


}
