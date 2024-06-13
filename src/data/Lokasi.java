package data;

public class Lokasi {
    private final String id_lokasi;
    private final String Latitude;
    private final String Longitude;
    private final String Kecamatan;
    private final String Nama_jalan;
    private final String No_kantor;
    private final String Deskripsi;

    public Lokasi(String id_lokasi, String Nama_wisata, String Latitude, String Longitude, String Kecamatan, String Nama_jalan, String No_kantor, String Deskripsi) {
        this.id_lokasi = id_lokasi;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Kecamatan = Kecamatan;
        this.Nama_jalan = Nama_jalan;
        this.No_kantor = No_kantor;
        this.Deskripsi = Deskripsi;
    }

    public String getid_lokasi() {
        return id_lokasi;
    }

    public String getLatitude() {
        return Latitude;
    }
    public String getLongitude(){
        return Longitude;
    }
    public String getKecamatan(){
        return Kecamatan;
    }
    public String getNama_jalan(){
        return Nama_jalan;
    }
    public String getNo_kantor(){
        return No_kantor;
    }
    public String getDeskripsi(){
        return Deskripsi;
    }

    public void setLokasi(String Lokasi) {
        // Implementasi setter jika diperlukan
    }
}
