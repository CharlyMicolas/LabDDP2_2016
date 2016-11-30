package Lab04_1606954773.SoalA;

/**
 * 
 * @author charly.micolas
 *
 */
public class CalonPemasaran extends CalonManajer {
    private int nilaiAkutansi;

    public CalonPemasaran(String nama, int nilaiEsai, int nilaiSikap, int nilaiBahasa, int nilaiAkutansi) {
        super(nama, nilaiEsai, nilaiSikap, nilaiBahasa);
        this.nilaiAkutansi = nilaiAkutansi;
    }

    public int getNilaiAkutansi() {
        return nilaiAkutansi;
    }

    public void setNilaiAkutansi(int nilaiAkutansi) {
        this.nilaiAkutansi = nilaiAkutansi;
    }

    @Override
    public double getNilaiKepribadian() {
        return (this.getNilaiEsai()+this.getNilaiAkutansi())/2;
    }
    
    @Override
    public String getStatus() {
    	String status = "";
    	if(this.getNilaiTertulis()>60 && this.getNilaiWawancara()>65 && this.getNilaiKepribadian()>65){
    		status = "diterima menjadi calon manajer Pemasaran";
    	}
    	else{
    		status="tidak diterima menjadi calon manajer Pemasaran";
    	}
        return status;
    }

}
