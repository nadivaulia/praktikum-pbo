package TugasTambahan.Soal2.org.mahasiswa;

import TugasTambahan.Soal2.org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa {
    private String nama;
    private String nik;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim= nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }
    public String getNim(){
        return this.nim;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public WaliMahasiswa getWali(){
        return this.wali;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }
    public void cetak(){
        nama = getNama();
        nik = getNik();
        nim = getNim();
        jurusan = getJurusan();
        String namaWali = getWali().getNamaWali();

        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + nik);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Wali : " + namaWali);
    }
}
