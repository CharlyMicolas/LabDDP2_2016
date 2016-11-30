package Lab01_1606954773.soalA;

public class Mahasiswa {
	private String namaMahasiswa;
	private int umur;
	private String alamat;
	private int uangSemester;
	private int totalSks;
	
	/**
	 * @param namaMahasiswa
	 * @param umur
	 * @param alamat
	 * @param uangSemester
	 * @param totalSks
	 */
	public Mahasiswa(String namaMahasiswa, int umur, String alamat,
			int uangSemester, int totalSks) {
		this.namaMahasiswa = namaMahasiswa;
		this.umur = umur;
		this.alamat = alamat;
		this.uangSemester = uangSemester;
		this.totalSks = totalSks;
	}

	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}

	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
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

	public int getUangSemester() {
		return uangSemester;
	}

	public void setUangSemester(int uangSemester) {
		this.uangSemester = uangSemester;
	}

	public int getTotalSks() {
		return totalSks;
	}

	public void setTotalSks(int totalSks) {
		this.totalSks = totalSks;
	}
	
	
	
	
	
	

}
