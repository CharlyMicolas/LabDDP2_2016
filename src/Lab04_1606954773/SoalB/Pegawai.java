package Lab04_1606954773.SoalB;

public class Pegawai extends Orang {
	private int gaji;
	private int ruang_kerja;
	
	public Pegawai(String nama, String alamat, String nomor_telepon, String email,
			int gaji, int ruang_kerja) {
		super(nama, alamat, nomor_telepon, email);
		this.gaji = gaji;
		this.ruang_kerja = ruang_kerja;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}

	public int getRuang_kerja() {
		return ruang_kerja;
	}

	public void setRuang_kerja(int ruang_kerja) {
		this.ruang_kerja = ruang_kerja;
	}
	
	@Override
	public String toString() {
		return this.getNama()+" Pegawai";
	}
	
	
	

}
