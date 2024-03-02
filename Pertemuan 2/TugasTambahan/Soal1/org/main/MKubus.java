package TugasTambahan.Soal1.org.main;
import TugasTambahan.Soal1.org.bangundatar.*;
import TugasTambahan.Soal1.org.bangunruang.*;

public class MKubus
{
    public static void main(String[] args)
    {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}
