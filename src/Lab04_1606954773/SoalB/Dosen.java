package Lab04_1606954773.SoalB;

public class Dosen extends Pegawai {
	private int jam_kerja;
	
	public Dosen(String nama, String alamat, String nomor_telepon, String email,
			int gaji, int ruang_kerja, int jam_kerja) {
		super(nama, alamat, nomor_telepon, email, gaji, ruang_kerja);
		this.setJam_kerja(jam_kerja);
	}

	public int getJam_kerja() {
		return jam_kerja;
	}

	public void setJam_kerja(int jam_kerja) {
		this.jam_kerja = jam_kerja;
	}
	
	@Override
	public String toString() {
		return this.getNama()+" Dosen";
	}

	
	
	

}
