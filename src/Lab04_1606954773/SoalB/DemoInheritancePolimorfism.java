package Lab04_1606954773.SoalB;

public class DemoInheritancePolimorfism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Status hanya bisa diisi oleh 4 value : FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
		// oleh sebab itu tipe data status yang digunakan adalah enum.
		Siswa boy = new Siswa("Boy", "Jln. Gundal Gandul", "022746281", "emp4W@no.com", Status.JUNIOR);
		System.out.println(boy.toString());
		System.out.println("Alamat: "+boy.getAlamat());
		System.out.println("No Telp: "+boy.getNomor_telepon());
		System.out.println("Email: "+boy.getEmail());
		//System.out.println("Status: "+boy.getStatus());
		
		System.out.println();
		
		Pegawai justin =  new Pegawai("Justin", "Bukit Sakti", "089279211231", "jVsTiN@timbersaw.com", 4000000, 1111);
		System.out.println(justin.toString());
		System.out.println("Alamat: "+justin.getAlamat());
		System.out.println("No Telp: "+justin.getNomor_telepon());
		System.out.println("Email: "+justin.getEmail());
		System.out.println("Gaji: "+justin.getGaji());

		System.out.println();
		
		Dosen oniichan = new Dosen("Oniichan", "Cempaka Indah", "928102931", "sugooii@kawaii.com", 4301, 6000000, 8);
		System.out.println(oniichan.toString());
		System.out.println("Alamat: "+oniichan.getAlamat());
		System.out.println("No Telp: "+oniichan.getNomor_telepon());
		System.out.println("Email: "+oniichan.getEmail());
		System.out.println("Ruangan: "+oniichan.getRuang_kerja());
		System.out.println("Gaji: "+oniichan.getGaji());
		System.out.println("Jumlah jam kerja: "+oniichan.getJam_kerja());
		
		System.out.println();
		
		Staff ardhan = new Staff("Ardhan", "Permata Biru", "928492131", "g4m3JAm@it.com", 2302, 5000000, "Manager Development");
		System.out.println(ardhan.toString());
		System.out.println("Alamat: "+ardhan.getAlamat());
		System.out.println("No Telp: "+ardhan.getNomor_telepon());
		System.out.println("Email: "+ardhan.getEmail());
		System.out.println("Ruangan: "+ardhan.getRuang_kerja());
		System.out.println("Gaji: "+ardhan.getGaji());
		System.out.println("Jabatan: "+ardhan.getJabatan());
	
		System.out.println();
	}

}
