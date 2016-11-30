package Lab04_1606954773.SoalA;

/**
 * 
 * @author charly.micolas
 *
 */
public class CalonMekanik implements Pelamar {

    private String nama;
    private int nilaiPG;
    private int nilaiEsai;
    private int nilaiSikap;
    public static final double BOBOT_PG = 0.4;
    public static final double BOBOT_ESAI = 0.6;

    public CalonMekanik(String nama, int nilaiPG, int nilaiEsai, int nilaiSikap) {
        this.nama = nama;
        this.nilaiPG = nilaiPG;
        this.nilaiEsai = nilaiEsai;
        this.nilaiSikap = nilaiSikap;
    }

    @Override
    public double getNilaiTertulis() {
        return (this.BOBOT_PG*this.nilaiPG)+(this.BOBOT_ESAI*this.nilaiEsai);
    }

    @Override
    public double getNilaiWawancara() {
        return this.nilaiSikap;
    }

    @Override
    public double getNilaiKepribadian() {
        return 0;
    }

    public String getNama() {
        return this.nama;
    }

    @Override
    public String getStatus() {
    	String status = "";
    	if(this.getNilaiTertulis()>60 && this.getNilaiWawancara()>60){
    		status = "diterima menjadi calon mekanik";
    	}
    	else{
    		status="tidak diterima menjadi calon mekanik";
    	}
        return status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilaiPG() {
        return nilaiPG;
    }

    public void setNilaiPG(int nilaiPG) {
        this.nilaiPG = nilaiPG;
    }

    public int getNilaiEsai() {
        return nilaiEsai;
    }

    public void setNilaiEsai(int nilaiEsai) {
        this.nilaiEsai = nilaiEsai;
    }

    public int getNilaiSikap() {
        return nilaiSikap;
    }

    public void setNilaiSikap(int nilaiSikap) {
        this.nilaiSikap = nilaiSikap;
    }


}
