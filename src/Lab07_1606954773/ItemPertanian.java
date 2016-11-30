package Lab07_1606954773;

/**
 * Created by Admin on 13/11/2016.
 */
public abstract class ItemPertanian extends Item {
    protected String masa_panen;
    protected Product produk;

    public ItemPertanian(String masa_panen, Product produk) {
        this.masa_panen = masa_panen;
        this.produk = produk;
    }

    public String getMasa_panen() {
        return masa_panen;
    }

    public void setMasa_panen(String masa_panen) {
        this.masa_panen = masa_panen;
    }

    public Product getProduk() {
        return produk;
    }

    public void setProduk(Product produk) {
        this.produk = produk;
    }

    abstract void makan();
    abstract void menghasilkan_product();
}


