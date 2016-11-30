package Lab04_1606954773.SoalA;

/**
 * 
 * @author charly.micolas
 *
 */
public class CalonManajer implements Pelamar{

    private String nama;
    private  int nilaiEsai;
    private int nilaiSikap;
    private int nilaiBahasa;
    public static final double BOBOT_SIKAP = 0.6;
    public static final double BOBOT_BAHASA = 0.4;

    public CalonManajer(String nama, int nilaiEsai, int nilaiSikap, int nilaiBahasa) {
        this.nama = nama;
        this.nilaiEsai = nilaiEsai;
        this.nilaiSikap = nilaiSikap;
        this.nilaiBahasa = nilaiBahasa;
    }

    @Override
    public double getNilaiTertulis() {
        return this.nilaiEsai;
    }

    @Override
    public double getNilaiWawancara() {
        return (this.BOBOT_SIKAP*this.nilaiSikap)+(this.BOBOT_BAHASA*this.nilaiBahasa);
    }

    @Override
    public double getNilaiKepribadian() {
        return this.nilaiSikap;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String getStatus() {
    	String status = "";
    	if(this.getNilaiTertulis()>60 && this.getNilaiWawancara()>60 && this.getNilaiKepribadian()>60){
    		status = "diterima menjadi calon manajer";
    	}
    	else{
    		status="tidak diterima menjadi calon manajer";
    	}
        return status;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public int getNilaiBahasa() {
        return nilaiBahasa;
    }

    public void setNilaiBahasa(int nilaiBahasa) {
        this.nilaiBahasa = nilaiBahasa;
    }





}
