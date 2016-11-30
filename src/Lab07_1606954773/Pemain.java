package Lab07_1606954773;

/**
 * Created by Admin on 12/11/2016.
 */
public class Pemain {

    private String nama;
    private String email;
    private String password;
    private String gambar;
    private boolean isLogin;
    private Lahan lahan;
    private double uang;
    private int level;
    private Dangau dangau;
    private Gudang gudang;


    public Pemain(String email, String password) {
        this.email = email;
        this.password = password;
        this.nama = "";
        this.gambar = "";
        this.isLogin = false;
        this.level = 1;
        this.lahan = new Lahan();
        this.dangau = new Dangau();
        this.gudang = new Gudang();
    }

    public Pemain(String nama, String email, String password, String gambar) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.gambar = gambar;
        this.isLogin = false;
        this.level = 1;
        this.lahan = new Lahan();
        this.dangau = new Dangau();
        this.gudang = new Gudang();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public Lahan getLahan() {
        return lahan;
    }

    public void setLahan(Lahan lahan) {
        this.lahan = lahan;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Dangau getDangau() {
        return dangau;
    }

    public void setDangau(Dangau dangau) {
        this.dangau = dangau;
    }

    public Gudang getGudang() {
        return gudang;
    }

    public void setGudang(Gudang gudang) {
        this.gudang = gudang;
    }

    public void login(String email, String pass){
        if((this.email.equals(email))&&(this.password.equals(pass))){
            System.out.println("Login is successful.");
            this.isLogin = true;
        }
        else{
            System.out.println("Email & Password is not match.");
            this.isLogin = false;
        }
    }

    public void beliLahan(String ukuran){
        System.out.println("Pemain membeli lahan ukuran "+ukuran);
        this.lahan.perluasLahan(ukuran);
    }

    public void lihatDaftarItem(){

    }

    public void belanja(ItemPertanian item, int jumlah){

    }

    public void menjual(ItemPertanian item){

    }

    public void memanen(){

    }
}
