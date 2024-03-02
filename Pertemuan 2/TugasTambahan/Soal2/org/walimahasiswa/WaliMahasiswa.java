package TugasTambahan.Soal2.org.walimahasiswa;

import TugasTambahan.Soal2.org.orang.Orang;

public class WaliMahasiswa {
    private String nomorHp;
    private String alamat;
    WaliMahasiswa(String nik, String nomorHp, String alamat){
        String nik = nik;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }
    public String getNomorHp(){
        return this.nomorHp;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }
    public void setAlamat(String Alamat) {
        this.alamat = alamat;
    }
}
