package TugasTambahan.Soal1.org.main;
import TugasTambahan.Soal1.org.bangundatar.*;
import TugasTambahan.Soal1.org.bangunruang.*;

public class MLimasSegiEmpat
{
    public static void main(String[] args)
    {
        double panjangSisi = 6;
        SegiEmpat alas = new SegiEmpat(panjangSisi);
        SegitigaSamaSisi sisiTegak = new SegitigaSamaSisi(panjangSisi);
        LimasSegiEmpat limas = new LimasSegiEmpat(alas, sisiTegak);

        System.out.println("Luas permukaan limas segi empat dengan panjang sisi 6 satuan : " + limas.hitungLuasPermukaan());
        System.out.println("Volume limas segi empat dengan panjang sisi 6 satuan : " + limas.hitungVolume());
    }
}
