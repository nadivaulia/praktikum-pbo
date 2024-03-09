package TugasModul;

/**
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak iput
 *                  jari-jari lingkaran bernilai nol
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol";
        //asersi hanya muncul jika di enable di terminal (pakai -enableassrtions)
        //asersi dijalankan ketika kondisinya tidak memenuhi syarat asersi
        //misal jari-jarinya 0 makan tidak memenuhi syarat jari-jari > 0
        //sehingga asersi dijalankan dan mengeluarkan output
        //"jari jari tidak boleh nol"
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * PERTANYAAN:
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 * JAWAB:
 * Tidak ada. Penggunaan assertion pada program tersebut sudah benar
 */