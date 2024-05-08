public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama : " + super.getNama() +", "+ "Gaji Pokok: " + super.getGajiPokok());
        System.out.println("Tunjangan : " + tunjangan);
    }
}