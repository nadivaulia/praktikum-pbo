public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama : " + super.getNama() + ", "+ "Gaji Pokok: " + super.getGajiPokok());
        System.out.println("Bonus : " + bonus);
    }
}