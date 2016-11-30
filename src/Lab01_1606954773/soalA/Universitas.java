package Lab01_1606954773.soalA;

import java.util.ArrayList;

public class Universitas {
	private String nama;
	private String alamat;
	private ArrayList<Pegawai> daftarPegawai;
	private ArrayList<Dosen> daftarDosen;
	private ArrayList<Mahasiswa> daftarMahasiswa;
	
	
	
	/**
	 * @param nama
	 * @param alamat

	 */
	public Universitas(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
		daftarPegawai = new ArrayList<Pegawai>();
		daftarDosen = new ArrayList<Dosen>();
		daftarMahasiswa = new ArrayList<Mahasiswa>();
	}
	
	

	public String getNama() {
		return nama;
	}



	public void setNama(String nama) {
		this.nama = nama;
	}



	public String getAlamat() {
		return alamat;
	}



	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}



	public ArrayList<Pegawai> getDaftarPegawai() {
		return daftarPegawai;
	}



	public void setDaftarPegawai(ArrayList<Pegawai> daftarPegawai) {
		this.daftarPegawai = daftarPegawai;
	}



	public ArrayList<Dosen> getDaftarDosen() {
		return daftarDosen;
	}



	public void setDaftarDosen(ArrayList<Dosen> daftarDosen) {
		this.daftarDosen = daftarDosen;
	}



	public ArrayList<Mahasiswa> getDaftarMahasiswa() {
		return daftarMahasiswa;
	}



	public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
		this.daftarMahasiswa = daftarMahasiswa;
	}



	public void addPegawai(Pegawai pgw) {
		
		daftarPegawai.add(pgw);
		
	}

	public void addMahasiswa(Mahasiswa mhs) {
		daftarMahasiswa.add(mhs);
		
		
	}

	public void addDosen(Dosen dsn) {
		daftarDosen.add(dsn);
	}
	
	public String cekUntungRugi(int totalPengeluaran,
			int totalUangSemester) {
		// TODO Auto-generated method stub
		String hasil = null;
		if(totalPengeluaran>totalUangSemester){
			hasil = "Rugi";
		}
		else if(totalPengeluaran==totalUangSemester){
			hasil = "Balik Modal";
		}
		else{
			hasil = "Untung";
		}
		return hasil;
	}
	/*
	public int totalGajiDosen(){
		int i;
		int totalGajiDosen = 0;
		for(i=0; i<getDaftarDosen().size();i++){
			int hitungGaji = getDaftarDosen().get(i).getGajiPerjam()*getDaftarDosen().get(i).getTotalJamKerja();
			totalGajiDosen = totalGajiDosen + hitungGaji;
		}
		
		return totalGajiDosen;
	}
	*/

}
