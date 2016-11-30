package Lab01_1606954773.soalB;

public class Pasien {
	private String nama;
	private int umur;
	private String jnsKelamin;
	private String namaDokter;
	private String jenisObat;
	
	/**
	 * @param nama
	 * @param umur
	 * @param jnsKelamin
	 * @param namaDokter
	 * @param jenisObat
	 */
	public Pasien(String nama, int umur, String jnsKelamin, String namaDokter,
			String jenisObat) {
		super();
		this.nama = nama;
		this.umur = umur;
		this.jnsKelamin = jnsKelamin;
		this.namaDokter = namaDokter;
		this.jenisObat = jenisObat;
	}
	
	
	
	/**
	 * @param nama
	 * @param umur
	 * @param jnsKelamin
	 */
	public Pasien(String nama, int umur, String jnsKelamin) {
		this.nama = nama;
		this.umur = umur;
		this.jnsKelamin = jnsKelamin;
		namaDokter = "";
		jenisObat = "";
	}



	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	public String getJnsKelamin() {
		return jnsKelamin;
	}
	public void setJnsKelamin(String jnsKelamin) {
		this.jnsKelamin = jnsKelamin;
	}
	public String getNamaDokter() {
		return namaDokter;
	}
	public void setNamaDokter(String namaDokter) {
		this.namaDokter = namaDokter;
	}
	public String getJenisObat() {
		return jenisObat;
	}
	public void setJenisObat(String jenisObat) {
		this.jenisObat = jenisObat;
	}
	
	
	

}
