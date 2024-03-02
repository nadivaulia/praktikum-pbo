package TugasTambahan.Soal1.org.bangundatar;
import TugasTambahan.Soal1.org.poligon.Poligon;

public class SegiEmpat extends Poligon {
    private double panjangSisi;

    public SegiEmpat(double panjangSisi)
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
