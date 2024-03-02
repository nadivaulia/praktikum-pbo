package TugasTambahan.Soal1.org.bangunruang;
import TugasTambahan.Soal1.org.bangundatar.SegiEmpat;
import TugasTambahan.Soal1.org.bangundatar.SegitigaSamaSisi;

import static java.lang.Math.sqrt;

public class LimasSegiEmpat {
    private SegiEmpat alasLimas;
    private SegitigaSamaSisi sisiTegak;

    public LimasSegiEmpat(SegiEmpat alasLimas, SegitigaSamaSisi sisiTegak)
    {
        this.alasLimas = alasLimas;
        this.sisiTegak = sisiTegak;
    }
    public SegiEmpat getAlas()
    {
        return this.alasLimas;
    }
    public SegitigaSamaSisi getSisiTegak()
    {
        return this.sisiTegak;
    }
    public double hitungVolume()
    {
        double panjangSisi = getAlas().getPanjangSisi();
        double tinggiLimas = sqrt(0.5 * panjangSisi * panjangSisi);
        double luasAlas = getAlas().hitungLuas();
        return (luasAlas * tinggiLimas)/3;
    }
    public double hitungLuasPermukaan()
    {
        double luasSisiTegak = getSisiTegak().hitungLuas();
        double luasAlas = getAlas().hitungLuas();
        return 4*luasSisiTegak + luasAlas;
    }
}
