/**
 * File         : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan asersi
 */
public class Asersi1 {
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x < 0) : "ada kesalahan kode";
            //asersi hanya muncul jika di enable di terminal (pakai -enableassrtions)
            //asersi dijalankan ketika kondisinya tidak memenuhi syarat asersi
            //misal jari-jarinya 0 makan tidak memenuhi syarat jari-jari > 0
            //sehingga asersi dijalankan dan mengeluarkan output
            //"jari jari tidak boleh nol"
            System.out.println("x bilangan negatif");
        }
    }
}
