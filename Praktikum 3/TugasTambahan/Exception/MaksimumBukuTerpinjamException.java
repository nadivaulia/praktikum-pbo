package TugasTambahan.Exception;

public class MaksimumBukuTerpinjamException extends Exception{
    public MaksimumBukuTerpinjamException()
    {
        super("Anggota sudah mencapai batas maksimum peminjaman buku.");
    }
}
