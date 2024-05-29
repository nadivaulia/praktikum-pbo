import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan key berupa NIM dan value berupa nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122120123", "Adi");
        mahasiswaMap.put("24060123140098", "Bambang");
        mahasiswaMap.put("24060121130067", "Cici");
        mahasiswaMap.put("24060122130093", "Didi");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}