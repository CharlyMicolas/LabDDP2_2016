package Lab01_1606954773.soalA;

public class Dosen {
	private String namaDosen;
	private int umur;
	private String alamat;
	private int gajiPerjam;
	private int totalJamKerja;
	
	/**
	 * 
	 * @param namaDosen
	 * @param umur
	 * @param alamat
	 * @param gajiPerjam
	 * @param totalJamKerja
	 */
	public Dosen(String namaDosen, int umur, String alamat, int gajiPerjam,
			int totalJamKerja) {
		this.namaDosen = namaDosen;
		this.umur = umur;
		this.alamat = alamat;
		this.gajiPerjam = gajiPerjam;
		this.totalJamKerja = totalJamKerja;
	}

	public String getNamaDosen() {
		return namaDosen;
	}

	public void setNamaDosen(String namaDosen) {
		this.namaDosen = namaDosen;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getGajiPerjam() {
		return gajiPerjam;
	}

	public void setGajiPerjam(int gajiPerjam) {
		this.gajiPerjam = gajiPerjam;
	}

	public int getTotalJamKerja() {
		return totalJamKerja;
	}

	public void setTotalJamKerja(int totalJamKerja) {
		this.totalJamKerja = totalJamKerja;
	}
	
	
	
	
	

}
