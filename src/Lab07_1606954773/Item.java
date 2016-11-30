package Lab07_1606954773;

/**
 * Created by Admin on 12/11/2016.
 */
public abstract class Item {
    private String nama;
    private String gambar;
    private String harga_satuan;

    abstract void makan();
    abstract void menghasilkan_product();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(String harga_satuan) {
        this.harga_satuan = harga_satuan;
    }
}
