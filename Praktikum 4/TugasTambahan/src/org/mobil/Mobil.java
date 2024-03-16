package org.mobil;
import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    // Atribut khusus Mobil
    private int jumlahPintu;

    // Konstruktor
    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    // Method get dan set untuk atribut jumlahPintu
    public int getJumlahPintu() {
        return this.jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    // Method untuk mencetak informasi mobil
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Kendaraan: Mobil");
        System.out.println("Jumlah Pintu: " + getJumlahPintu());
    }

    // Method untuk membuka pintu mobil
    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu nomor " + nomorPintu + " terbuka");
    }

    // Method untuk menyalakan klakson mobil
    @Override
    public void klakson() {
        super.klakson();
        System.out.println(" berbunyi Vroom Vroom!");
    }
}