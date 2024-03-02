package TugasTambahan.Soal2.org.walimahasiswa;

public class WaliMahasiswa {
    private String nama;
    private String nik;
    private String nomorHp;
    private String alamat;
    public WaliMahasiswa(String nik, String nama, String nomorHp, String alamat){
        this.nik = nik;
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }
    public String getNamaWali(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }
    public String getNomorHp(){
        return this.nomorHp;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }
    public void setAlamat(String Alamat) {
        this.alamat = alamat;
    }
}
