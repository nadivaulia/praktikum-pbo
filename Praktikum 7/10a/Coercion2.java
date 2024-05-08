public class Coercion2 {
    public static void main(String[] args) {
        double x = 15.5;
        int output = (int) x; //casting utk mengubah tipe double mjd int
        System.out.println(output);
    }
}

/**
 * Jika tidak dilakukan casting pada variabel output
 * maka eksekusi program akan gagal karena double yang
 * langsung diubah ke int akan menimbulkan nilai yang
 * tidak presisi atau berbeda dengan nilai aslinya
 */
