package Lab01_1606954773.soalB;

public class Dokter {
	private String nama;
	private int umur;
	private String jnsKelamin;
	private int gajiPerBulan;
	private String spesialisasi;
	/**
	 * @param nama
	 * @param umur
	 * @param jnsKelamin
	 * @param gajiPerBulan
	 * @param spesialisasi
	 */
	public Dokter(String nama, int umur, String jnsKelamin, int gajiPerBulan,
			String spesialisasi) {
		this.nama = nama;
		this.umur = umur;
		this.jnsKelamin = jnsKelamin;
		this.gajiPerBulan = gajiPerBulan;
		this.spesialisasi = spesialisasi;
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
	public int getGajiPerBulan() {
		return gajiPerBulan;
	}
	public void setGajiPerBulan(int gajiPerBulan) {
		this.gajiPerBulan = gajiPerBulan;
	}
	public String getSpesialisasi() {
		return spesialisasi;
	}
	public void setSpesialisasi(String spesialisasi) {
		this.spesialisasi = spesialisasi;
	}
	
	
	
	
	
	

}
