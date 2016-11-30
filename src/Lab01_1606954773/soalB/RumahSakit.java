package Lab01_1606954773.soalB;

import java.util.ArrayList;

public class RumahSakit {
	private String namaRS;
	private String alamatRS;
	private String jlhRuangRawat;
	private ArrayList<Dokter> daftarDokter;
	private ArrayList<Pasien> daftarPasien;
	
	/**
	 * @param namaRS
	 * @param alamatRS
	 * @param jlhRuangRawat
	 */
	public RumahSakit(String namaRS, String alamatRS, String jlhRuangRawat) {
		this.namaRS = namaRS;
		this.alamatRS = alamatRS;
		this.jlhRuangRawat = jlhRuangRawat;
		daftarDokter = new ArrayList<Dokter>();
		daftarPasien = new ArrayList<Pasien>();
	}

	public String getNamaRS() {
		return namaRS;
	}

	public void setNamaRS(String namaRS) {
		this.namaRS = namaRS;
	}

	public String getAlamatRS() {
		return alamatRS;
	}

	public void setAlamatRS(String alamatRS) {
		this.alamatRS = alamatRS;
	}

	public String getJlhRuangRawat() {
		return jlhRuangRawat;
	}

	public void setJlhRuangRawat(String jlhRuangRawat) {
		this.jlhRuangRawat = jlhRuangRawat;
	}

	public ArrayList<Dokter> getDaftarDokter() {
		return daftarDokter;
	}

	public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
		this.daftarDokter = daftarDokter;
	}

	public ArrayList<Pasien> getDaftarPasien() {
		return daftarPasien;
	}

	public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
		this.daftarPasien = daftarPasien;
	}

	public void addDokter(Dokter dokter) {
		// TODO Auto-generated method stub
		daftarDokter.add(dokter);
		
	}

	public void addPasien(Pasien pasien) {
		// TODO Auto-generated method stub
		daftarPasien.add(pasien);
		
	}
	
	public int jlhRuangKosong(){
		int ruangTerpakai = daftarPasien.size();
		int ruangkosong = Integer.parseInt(getJlhRuangRawat())- ruangTerpakai;
		
		return ruangkosong;
	}

	
	
	
	
	
	
	
	
	

}
