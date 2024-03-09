package TugasTambahan.Exception;

public class BukuTidakTersediaException extends Exception{
    public BukuTidakTersediaException()
    {
        super("Buku tidak tersedia untuk dipinjam.");
    }
}
