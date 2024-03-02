package TugasTambahan.Soal1.org.bangunruang;
import TugasTambahan.Soal1.org.bangundatar.BujurSangkar;

public class Kubus
{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan)
    {
        this.permukaan = permukaan;
    }

    public double hitungVolume()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
