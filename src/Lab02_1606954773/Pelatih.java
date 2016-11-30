package Lab02_1606954773;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Admin on 17/09/2016.
 */
public class Pelatih {
    private String nama_pelatih;
    private int uang;
    private int level;
    private int banyak_langkah;
    private int maksimal_muatan_tas;
    private ArrayList<Barang> listBarang;
    private ArrayList<Monster> listMonster;

    public Pelatih(String nama_pelatih, int uang, int level, int maksimal_muatan_tas) {
        this.nama_pelatih = nama_pelatih;
        this.uang = uang;
        this.level = level;
        this.banyak_langkah = 0;
        this.maksimal_muatan_tas = maksimal_muatan_tas;
        listBarang = new ArrayList<Barang>();
        listMonster = new ArrayList<Monster>();
    }

    public String getNama_pelatih() {
        return nama_pelatih;
    }

    public void setNama_pelatih(String nama_pelatih) {
        this.nama_pelatih = nama_pelatih;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBanyak_langkah() {
        return banyak_langkah;
    }

    public void setBanyak_langkah(int banyak_langkah) {
        this.banyak_langkah = banyak_langkah;
    }

    public int getMaksimal_muatan_tas() {
        return maksimal_muatan_tas;
    }

    public void setMaksimal_muatan_tas(int maksimal_muatan_tas) {
        this.maksimal_muatan_tas = maksimal_muatan_tas;
    }

    public ArrayList<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    public ArrayList<Monster> getListMonster() {
        return listMonster;
    }
    

    public String listTypeMonsterUsed() {
    	String typesUsed = null;
    	for(int i=0; i<3; i++){
    		if(i==0){
    			typesUsed = listMonster.get(i).getTipe();	
    		}
    		else{
    			typesUsed = typesUsed+" "+listMonster.get(i).getTipe();;
    		}
    	}
    	return typesUsed;
    }

    
    public void setListMonster(ArrayList<Monster> listMonster) {
        this.listMonster = listMonster;
    }
   
    

    public void addBarang(Barang item) {
        if(this.getMaksimal_muatan_tas() > this.listBarang.size()){
            this.listBarang.add(item);
            System.out.println("Item "+item.getNama_barang()+" berhasil didapatkan");
        }
        else{
            System.out.println("Tas sudah penuh");
        }
    }

    public void addMonster(Monster monster) {
    //	System.out.println(this.listMonster.size());
        while(this.listMonster.size()<6){
            this.listMonster.add(monster);
            System.out.println(monster.getNama_monster()+" berhasil didapatkan");
        }
       
        System.out.println("Jumlah monster sudah 6");
   
    }
    
    public void randomStartingMonster(){
		Random randomNo = new Random();
		int jumlah = randomNo.nextInt(4)+3;
		for(int count = 1; count <= jumlah; count++){
			int tipe = randomNo.nextInt(3)+1;
			switch(tipe){
				case 1:{
					Monster monster = new Monster("Tumbuhan");
					this.listMonster.add(monster);
					break;
				}
				case 2:{
					Monster monster = new Monster("Api");
					this.listMonster.add(monster);
					break;
				}
				case 3:{
					Monster monster = new Monster("Air");
					this.listMonster.add(monster);
					break;
				}
				default:
					break;
				
			}
			
		}
	} 
}
