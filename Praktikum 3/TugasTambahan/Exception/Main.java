package TugasTambahan.Exception;

public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("John Doe");
        Buku buku1 = new Buku("Harry Potter");
        Buku buku2 = new Buku("Lord of the Rings");
        Buku buku3 = new Buku("Game of Thrones");
        Buku buku4 = new Buku("The Hobbit");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);

            System.out.println("Peminjaman buku berhasil.");
        } catch (MaksimumBukuTerpinjamException maks) {
            System.out.println("Gagal melakukan peminjaman buku: " + maks.getMessage());
        } catch (BukuTidakTersediaException avail) {
            System.out.println("Gagal melakukan peminjaman buku: " + avail.getMessage());
        }
    }
}
