package data;

public class user {

    public static void inputuNama(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void inputUser_name(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final String id_user;
    private final String user_name;
    private final String password;
    private final String nama_lengkap;
    private final String jk;
    private final String alamat;
    private final String no_telp;
    private final String tgl_lahir;
    private String arsip;

    /**
     *
     * @param id_user
     * @param user_name
     * @param password
     * @param nama_lengkap
     * @param jk
     * @param alamat
     * @param no_telp
     * @param tgl_lahir
     */
    public user(String id_user, String user_name, String password, String nama_lengkap, String jk, String alamat, String no_telp, String tgl_lahir) {
        this.id_user = id_user;
        this.user_name = user_name;
        this.password = password;
        this.nama_lengkap = nama_lengkap;
        this.jk = jk;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.tgl_lahir = tgl_lahir;
    }

    public user() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getid_user() {
        return id_user;
    }

    public String getuser_name() {
        return user_name;
    }
    public String getpassword(){
        return password;
    }
    public String getnama_lengkap(){
        return nama_lengkap;
    }
    public String getjk(){
        return jk;
    }
    public String getalamat(){
        return alamat;
    }
    public String getno_telp(){
        return no_telp;
    }
    public String gettgl_lahir(){
        return tgl_lahir;
    }

    public void setuser(String user) {
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String kd_arsip = null;
        return "user{" +
                "kd_arsip='" + kd_arsip + '\'' +
                ", arsip='" + arsip + '\'' +
                '}';
    }

    public void inputId_user(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputPassword(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputNama_lengkap(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputjk(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputAlamat(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputTelp(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputtgl_lahir(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputJumlahAnak(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inputMasaKerja(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String gajiTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}