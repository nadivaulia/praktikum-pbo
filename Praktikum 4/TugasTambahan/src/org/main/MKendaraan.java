package org.main;
import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.truk.Truk;
import org.motor.Motor;

public class MKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor = new Motor("Ducati Panigale V4 R", 1000);
        Truk truk = new Truk("Mercedes-Benz Actros", 2000);

        // KENDARAAN
        kendaraan.cetakInfo();
        kendaraan.klakson();
        System.out.println();
        kendaraan.gas(50, 2);
        System.out.println("Gas Kendaraan Nathan dengan kecepatan 50 dengan durasi 2 sehingga kecepatannya menjadi " + kendaraan.getKecepatan());
        kendaraan.berhenti(); // Berhenti kendaraan
        System.out.println("Menghentikan Kendaraan Nathan sehingga kecepatannya menjadi " + kendaraan.getKecepatan());

        System.out.println();

        // MOBIL
        mobil.cetakInfo();
        mobil.bukaPintu(1); // Membuka pintu nomor 1 mobil
        mobil.bukaPintu(2); // Membuka pintu nomor 2 mobil
        mobil.klakson(); // output: Bugatti Chiron berbunyi Vroom Vroom!

        System.out.println();

        // MOTOR
        motor.cetakInfo();
        double horsepower1 = motor.hitungHorsepower(15);
        double horsepower2 = motor.hitungHorsepower(16);
        double horsepower3 = motor.hitungHorsepower(17);
        System.out.println("Motor " + motor.getNama() + " diperkirakan memiliki tenaga " + horsepower2 + " HP dengan " + horsepower3 + " sebagai batas bawah dan " + horsepower1 + " sebagai batas atas interval");
        motor.klakson();

        System.out.println();

        // TRUK
        truk.cetakInfo();
        truk.muatBarang(500);
        System.out.println("Memuat barang seberat 500 sehingga beratnya menjadi " + truk.getBeratMuatan());
        System.out.println("Memuat barang seberat 1600");
        truk.muatBarang(1600);

        truk.klakson();
    }
}
