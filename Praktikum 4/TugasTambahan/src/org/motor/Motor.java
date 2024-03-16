package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    // Atribut khusus Motor
    private int cc;

    // Konstruktor
    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    // Method get dan set untuk atribut cc
    public int getCC() {
        return cc;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    // Method untuk mencetak informasi motor
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Kendaraan: Motor");
        System.out.println("Kapasitas CC: " + cc);
    }

    // Method untuk menghitung horsepower motor
    public double hitungHorsepower(int angka) {
        return (double) getCC() / angka;
    }


    @Override
    public void klakson() {
        super.klakson();
        System.out.println(" berbunyi Womp Womp!");
    }
}