public class Coercion3 {
    public static void main(String[] args) {
        int y = 25;
        double output = y;
        System.out.println(output);
    }
}

/**
 * Berhasil dieksekusi dan menghasilkan output 25.0,
 * karena pengubahan tipe int ke double tidak mempengaruhi
 * presisi value. Dalam hal ini 25 = 25.0
 */