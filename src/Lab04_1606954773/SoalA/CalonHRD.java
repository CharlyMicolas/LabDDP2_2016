package Lab04_1606954773.SoalA;

/**
 * 
 * @author charly.micolas
 *
 */
public class CalonHRD extends CalonManajer {
    private int nilaiPsikologi;

    public CalonHRD(String nama, int nilaiEsai, int nilaiSikap, int nilaiBahasa, int nilaiPsikologi) {
        super(nama, nilaiEsai, nilaiSikap, nilaiBahasa);
        this.nilaiPsikologi = nilaiPsikologi;
    }

    public int getNilaiPsikologi() {
        return nilaiPsikologi;
    }

    public void setNilaiPsikologi(int nilaiPsikologi) {
        this.nilaiPsikologi = nilaiPsikologi;
    }

    @Override
    public double getNilaiKepribadian() {
        return (this.getNilaiSikap()+this.getNilaiPsikologi()/2);
    }
    
    /**
     * Standard nilai yang lulus di atas 60
     */
    @Override
    public String getStatus() {
    	String status = "";
    	if(this.getNilaiTertulis()>60 && this.getNilaiWawancara()>60){
    		status = "diterima menjadi calon manajer HRD";
    	}
    	else{
    		status="tidak diterima menjadi calon manajer HRD";
    	}
        return status;
    }



}
