package Lab07_1606954773;

/**
 * Created by Admin on 13/11/2016.
 */
public class PerlengkapanBertani extends Item {

    private String namaAlat;

    public PerlengkapanBertani(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    @Override
    void makan() {

    }

    @Override
    void menghasilkan_product() {

    }
}
