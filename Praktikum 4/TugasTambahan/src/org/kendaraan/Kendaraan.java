package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama){
        this.nama = nama;
        this.kecepatan = 0;
    }
//    public Kendaraan(){
//        this.nama = "";
//        this.kecepatan = 0;
//    }

    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getKecepatan(){
        return this.kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    public void cetakInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Kecepatan: " + getKecepatan());
    }
    public void gas(int kecepatan, int durasi){
        this.kecepatan += kecepatan * durasi;
    }
    public void berhenti(){
        this.kecepatan = 0;
    }
    public void klakson(){
        System.out.print(getNama());
    }
}
