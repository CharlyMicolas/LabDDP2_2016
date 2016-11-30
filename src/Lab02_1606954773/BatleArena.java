package Lab02_1606954773;

import java.util.ArrayList;

public class BatleArena {
	
	private String nama_arena;
	private String alamat;
	private ArrayList<Pelatih> daftarPeserta;
	
	public BatleArena(String nama_arena, String alamat) {
		
		this.nama_arena = nama_arena;
		this.alamat = alamat;
		this.daftarPeserta = new ArrayList<Pelatih>();
	}
	public String getNama_arena() {
		return nama_arena;
	}
	public void setNama_arena(String nama_arena) {
		this.nama_arena = nama_arena;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public ArrayList<Pelatih> getDaftarPeserta() {
		return daftarPeserta;
	}
	public void setDaftarPeserta(ArrayList<Pelatih> daftarPeserta) {
		this.daftarPeserta = daftarPeserta;
	}
	
	public void daftarkanPelatih(Pelatih pelatih) {
		if(pelatih.getListMonster().size()>=3){
			this.daftarPeserta.add(pelatih);
			System.out.println("Pelatih "+ pelatih.getNama_pelatih()+" berhasil didaftarkan.");
		}
		else{
			System.out.println("Pendaftaran pelatih "+pelatih.getNama_pelatih()+" ditolak");
		}
    }
	
	private String getWinner(Pelatih pelatih1, Pelatih pelatih2){
		int counterPelatih1 = 0;
		int counterPelatih2 = 0;
		String namaPemenang=null;
		
		for(int i=0; i<3; i++){
			if(pelatih1.getListMonster().get(i).getTipe().equals("tumbuhan")){
				if(pelatih2.getListMonster().get(i).getTipe().equals("air")){
					counterPelatih1++;
				}
				else if(pelatih2.getListMonster().get(i).getTipe().equals("api")){
					counterPelatih2++;
				}
				else{
					counterPelatih1=counterPelatih1;
					counterPelatih2=counterPelatih2;
				}
			}
			
			if(pelatih1.getListMonster().get(i).getTipe().equals("air")){
				if(pelatih2.getListMonster().get(i).getTipe().equals("api")){
					counterPelatih1++;
				}
				else if(pelatih2.getListMonster().get(i).getTipe().equals("tumbuhan")){
					counterPelatih2++;
				}
				else{
					counterPelatih1=counterPelatih1;
					counterPelatih2=counterPelatih2;
				}
			}
			
			if(pelatih1.getListMonster().get(i).getTipe().equals("api")){
				if(pelatih2.getListMonster().get(i).getTipe().equals("tumbuhan")){
					counterPelatih1++;
				}
				else if(pelatih2.getListMonster().get(i).getTipe().equals("air")){
					counterPelatih2++;
				}
				else{
					counterPelatih1=counterPelatih1;
					counterPelatih2=counterPelatih2;
				}
			}
		}
		
		if(counterPelatih1>counterPelatih2){
			namaPemenang = pelatih1.getNama_pelatih();
		}
		
		else{
			namaPemenang = pelatih2.getNama_pelatih();
		}
		return namaPemenang;
	}
	
	private int countWinner(Pelatih pelatih1, Pelatih pelatih2){
		int counterPelatih1 = 0;
		int counterPelatih2 = 0;
		
		String namaPemenang=null;
		
		for(int i=0; i<3; i++){
			if(pelatih1.getListMonster().get(i).getTipe().equals("Tumbuhan")){
				if(pelatih2.getListMonster().get(i).getTipe().equals("Air")){
					counterPelatih1++;
				}
				else if(pelatih2.getListMonster().get(i).getTipe().equals("Api")){
					counterPelatih2++;
				}
				else{
					counterPelatih1=counterPelatih1;
					counterPelatih2=counterPelatih2;
				}
			}
			
			if(pelatih1.getListMonster().get(i).getTipe().equals("Air")){
				if(pelatih2.getListMonster().get(i).getTipe().equals("Api")){
					counterPelatih1++;
				}
				else if(pelatih2.getListMonster().get(i).getTipe().equals("Tumbuhan")){
					counterPelatih2++;
				}
				else{
					counterPelatih1=counterPelatih1;
					counterPelatih2=counterPelatih2;
				}
			}
			
			if(pelatih1.getListMonster().get(i).getTipe().equals("Api")){
				if(pelatih2.getListMonster().get(i).getTipe().equals("Tumbuhan")){
					counterPelatih1++;
				}
				else if(pelatih2.getListMonster().get(i).getTipe().equals("Air")){
					counterPelatih2++;
				}
				else{
					counterPelatih1=counterPelatih1;
					counterPelatih2=counterPelatih2;
				}
			}
		}
		
		if(counterPelatih1>counterPelatih2){
			return counterPelatih1;
		}
		else if(counterPelatih1==counterPelatih2){
			return 0;
		}
		else{
			return counterPelatih2;
		}
	
	}
	
	public void prototypeBatle(Pelatih pelatih1, Pelatih pelatih2){
		
		if(daftarPeserta.contains(pelatih1) && daftarPeserta.contains(pelatih2)){
			System.out.println(pelatih1.getNama_pelatih()+" : "+ pelatih1.listTypeMonsterUsed());
			System.out.println(pelatih2.getNama_pelatih()+" : "+ pelatih2.listTypeMonsterUsed());
			String name= this.getWinner(pelatih1, pelatih2);
			int jlhMenang = this.countWinner(pelatih1, pelatih2);
			if(jlhMenang==0){
				System.out.println("Pertarungan Seri");
			}else{
				System.out.println("Pemenang : "+ name);
				System.out.println(jlhMenang+" monster menang");
			}
		}
		else{
			if(!daftarPeserta.contains(pelatih1)){
				System.out.println("Pertarungan tidak bisa dilakukan");
				System.out.println(pelatih1.getNama_pelatih()+" tidak ada dalam daftar peserta");
			}
			else{
				System.out.println("Pertarungan tidak bisa dilakukan");
				System.out.println(pelatih2.getNama_pelatih()+" tidak ada dalam daftar peserta");
			}
		}
		
		
	}
	

	
	
}
