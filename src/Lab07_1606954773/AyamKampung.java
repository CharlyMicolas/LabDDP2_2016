package Lab07_1606954773;

/**
 * Created by Admin on 13/11/2016.
 */
public class AyamKampung extends ItemPertanian {


    public AyamKampung() {
        super("", null);
    }

    @Override
    void makan() {
        System.out.println("Ayam Kampung diberi makan 15 menit sekali");
    }

    @Override
    void menghasilkan_product() {
        System.out.println("Ayam Kampung menghasilkan product 2 butir telur");
    }

    public void bertelur(){

    }
}
