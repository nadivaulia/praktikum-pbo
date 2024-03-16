package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    // Atribut khusus Truk
    private int kapasitasMuatan;
    private int beratMuatan;

    // Konstruktor
    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
//        this.beratMuatan = 0; // Awalnya muatan kosong
    }

    // Method get dan set untuk atribut kapasitasMuatan
    public int getKapasitasMuatan() {
        return this.kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    // Method get dan set untuk atribut beratMuatan
    public int getBeratMuatan() {
        return this.beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }

    // Method untuk mencetak informasi truk
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Kendaraan: Truk");
        System.out.println("Kapasitas Muatan: " + getKapasitasMuatan());
        System.out.println("Berat Muatan: " + getBeratMuatan());
    }

    // Method untuk memuat barang ke dalam truk
    public void muatBarang(int berat) {
        if (beratMuatan + berat <= kapasitasMuatan) {
            beratMuatan += berat;
        }
        else {
            System.out.println("Kapasitas muatan sudah penuh");
        }
    }

    @Override
    public void klakson() {
        super.klakson();
        System.out.println(" berbunyi Honk Honk!");
    }
}