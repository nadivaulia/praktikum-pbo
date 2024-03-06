/**
 * File         : ExceptionOnArray.java
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 *
 */

// Beda Assertion dan Exception:
//   * Asersi untuk custom error, kondisinya diatur sendiri
//   * Eksepsi untuk error umum yang sudah terdefinisi di class "Exceptions"

public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        // Exception melakukan loop dgn men-try assignment pd blok try
        // dan di-catch sesuai dengan syarat pada blok catch
        // jika syarat terpeuhi maka exception dijalankan
        // dan program langsung dihentikan
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
//            System.out.println(arrayInteger[2]);
//            System.out.println(arrayInteger[4]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("clean up code...");
        }
    }
}
