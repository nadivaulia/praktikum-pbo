package TugasTambahan.Soal1.org.bangundatar;
import TugasTambahan.Soal1.org.poligon.Poligon;

public class BujurSangkar extends Poligon 
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {
        return this.panjangSisi;
    }
}
