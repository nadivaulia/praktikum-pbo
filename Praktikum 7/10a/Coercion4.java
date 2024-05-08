public class Coercion4 {
    public static void main(String[] args) {
        int z = 78;
        char output = (char) z;
        System.out.println(output);
    }
}

/**
 * Berhasil dieksekusi dengan mengembalikan output 'N'
 * karena 'N' memiliki nilai ASCII 78. Coercion dari
 * int ke char akan mengubah suatu bilangan menjadi
 * huruf ASCII sesuai dengan kodenya
 */