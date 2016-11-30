package Lab04_1606954773.SoalB;

public class Staff extends Pegawai{
	private String jabatan;

	public Staff(String nama, String alamat, String nomor_telepon, String email,
			int gaji, int ruang_kerja, String jabatan) {
		super(nama, alamat, nomor_telepon, email, gaji, ruang_kerja);
		this.jabatan = jabatan;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}	
	
	@Override
	public String toString() {
		return this.getNama()+" Staff";
	}

}
