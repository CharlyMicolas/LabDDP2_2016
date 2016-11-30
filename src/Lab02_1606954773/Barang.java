package Lab02_1606954773;

/**
 * Created by Admin on 17/09/2016.
 */
public class Barang {

    private String nama_barang;
    private int harga_barang;

    public Barang(String nama_barang, int harga_barang) {
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
}
