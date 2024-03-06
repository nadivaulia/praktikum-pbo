/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 *                pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Excption"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**
 * PERTANYAAN:
 * 1. Ketika eksepsi terjadi, apakah baris 12 dieksekusi?
 *    JAWAB:
 *    Pada saat mengeksekusi as.cobaAngka(10) maka baris 12 akan
 *    dieksekusi, karena belum terjadi eksepsi. Sedangkan setelah
 *    program mengeksekusi as.cobaAngka(13) maka akan terjadi eksepsi
 *    shg baris 12 tidak dieksekusi dan program langsung berhenti.
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 *    JAWAB:
 *    Ya, baris 21 akan dieksekusi pada saat menjalankan as.cobaAngka(13).
 */

/**
 * CATT.
 * Klausa throws digunakan pada method yang di dalamnya dimungkinan
 * ada kesalahan (eksepsi) yang terjadi. Sedangkan klausa throw
 * digunakan ketika program akan melemparkan kesalahan ke kelas
 * exception.
 */
