package Lab04_1606954773.SoalB;

public class Orang {
	private String nama;
	private String alamat;
	private String nomor_telepon;
	private String email;
	
	public Orang(String nama, String alamat, String nomor_telepon, String email) {
		
		this.nama = nama;
		this.alamat = alamat;
		this.nomor_telepon = nomor_telepon;
		this.email = email;
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

	public String getNomor_telepon() {
		return nomor_telepon;
	}

	public void setNomor_telepon(String nomor_telepon) {
		this.nomor_telepon = nomor_telepon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.getNama()+" Orang";
	}
	
	
	
	
	
	

}
