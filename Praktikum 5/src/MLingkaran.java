import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran : ");
        double r = scan.nextDouble(); // Menyimpan hasil scan jd nilai double
        Lingkaran L1 = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan jejari "+r+" satuan adalah "+L1.hitungLuas());
    }
}
/**
 * Perbedaan Pewarisan, Abstrak, dan Interface
 * Abstraksi : Menyembunyikan detail implementeasi yg tidak penting untuk diketahui user
 * Tujuan abstract class : agar tdk mengulang2 membuat implementasi
 * Interface bisa diimplementasikan lebih dari satu
 * Penyederhanaan
 */