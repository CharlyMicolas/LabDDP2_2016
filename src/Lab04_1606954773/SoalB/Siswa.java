package Lab04_1606954773.SoalB;

public class Siswa extends Orang {
	
	private final Status status;

	public Siswa(String nama, String alamat, String nomor_telepon,
			String email, Status status) {
		super(nama, alamat, nomor_telepon, email);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return this.getNama()+" Siswa";
	}
	
	
	
	

	
	
	

}
