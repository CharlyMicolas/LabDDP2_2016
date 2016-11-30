package Lab02_1606954773;

/**
 * Created by Admin on 17/09/2016.
 */
public class Monster {

    private String nama_monster;
    private int level_monster;
    private String tipe;
    private int helth_point;

    public Monster(String nama_monster, int level_monster, String tipe, int helth_point) {
        this.nama_monster = nama_monster;
        this.level_monster = level_monster;
        this.tipe = tipe;
        this.helth_point = helth_point;
    }

    public Monster(String tipe) {
    	this.nama_monster="monster";
    	this.level_monster=0;
		this.tipe = tipe;
		this.helth_point=0;
	}

	public String getNama_monster() {
        return nama_monster;
    }

    public void setNama_monster(String nama_monster) {
        this.nama_monster = nama_monster;
    }

    public int getLevel_monster() {
        return level_monster;
    }

    public void setLevel_monster(int level_monster) {
        this.level_monster = level_monster;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHelth_point() {
        return helth_point;
    }

    public void setHelth_point(int helth_point) {
        this.helth_point = helth_point;
    }
}
