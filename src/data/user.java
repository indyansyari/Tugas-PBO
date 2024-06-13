package data;

public class user {
    public String user_name;
    public String id_user;
    public String password;
    public String nama_lengkap;
    public String jk;
    public String alamat;
    public String telp;
    public String tgl_lahir;
    public String status;
    public int jumlahAnak;
    public int masaKerja;

    public user() {
        // Implementasikan konstruktor
    }

    public void inputUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void inputId_user(String id_user) {
        this.id_user = id_user;
    }

    public void inputPassword(String password) {
        this.password = password;
    }

    public void inputNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public void inputjk(String jk) {
        this.jk = jk;
    }

    public void inputAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void inputTelp(String telp) {
        this.telp = telp;
    }

    public void inputtgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getStatus() {
        return status;
    }

    public void inputJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void inputMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public double gajiTotal() {
        // Implementasikan logika perhitungan gaji total
        return 0.0;
    }
}
