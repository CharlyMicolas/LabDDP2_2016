package Lab06_1606954773;
/**
 * 
 * @author charly.micolas
 * NPM 		: 1606954773
 * Aslab 	: Agung Putra Pasaribu
 */


public abstract class UpahLembur {
	private double nominalPerJam;

	/**
	 * @param nominalPerJam
	 */
	public UpahLembur(double nominalPerJam) {
		this.nominalPerJam = nominalPerJam;
	}

	
	public double getNominalPerJam() {
		return nominalPerJam;
	}

	public void setNominalPerJam(double nominalPerJam) {
		this.nominalPerJam = nominalPerJam;
	}
	
	/**
	 * menghitung upah lembur
	 * @param jam
	 * @return
	 */
	public double hitung(double jam){
		return nominalPerJam * jam;
	} 
	
	/**
	 * Mengembalikan tipe object generic
	 * @param divisi
	 * @return
	 * @throws Exception
	 */
	public static UpahLembur buatPenghitung(String divisi)throws Exception{
		if(divisi.equals("Marketing")){
			return  new LemburMarketing(3000000);
		}
		else if(divisi.equals("Riset")){
			return  new LemburRiset(45000);
		}
		else if(divisi.equals("Keuangan")){
			return  new LemburKeuangan(35000);
		}
		else{
			throw new Exception("Belum mendukung perhitungan upah lembur divisi "+ divisi);
		}
	}
	
}
