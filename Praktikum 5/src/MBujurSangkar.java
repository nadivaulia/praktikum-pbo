import java.util.Scanner;
class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}

/**
 * QUESTION :
 * Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang
 * ada pada kelas BangunDatar? Jelaskan
 *
 * ANSWER :
 * Terjadi Error, karena menggunakan variabel "luas" yang merupakan atribut di kelas BangunDatar.
 * Jika digunakan di BujurSangkar tanpa memanggil BangunDatar, maka tidak bisa. BujurSangkar tidak
 * memiliki atribut tersebut.
 */