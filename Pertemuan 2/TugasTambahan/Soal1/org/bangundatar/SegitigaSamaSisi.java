package TugasTambahan.Soal1.org.bangundatar;
import TugasTambahan.Soal1.org.poligon.Poligon;
import static java.lang.Math.sqrt;

public class SegitigaSamaSisi extends Poligon {
    private double panjangSisi;
    private double tinggiSegitiga;
    public SegitigaSamaSisi(double panjangSisi)
    {
        this.jumlahSisi = 3;
        this.panjangSisi = panjangSisi;
    }
    public double getPanjangSisi()
    {
        return this.panjangSisi;
    }
    public double hitungLuas()
    {
        double panjangSisi = getPanjangSisi();
        double tinggi = sqrt((panjangSisi*panjangSisi) - ((0.5 * panjangSisi)*(0.5 * panjangSisi)));
        return 0.5 * panjangSisi * tinggi;
    }
}
