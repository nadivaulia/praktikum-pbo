package latihanMedium;

public class KontrolSenjata {

    private Senjata senjata; // Reference to the gun object

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
    }

    public void menembak(int jumlah) {
        if (!isAdaPeluru()) {
            System.out.println("Tidak ada peluru!");
            return;
        }

        int peluruTerpakai = Math.min(jumlah, senjata.getPeluru());
        senjata.setPeluru(senjata.getPeluru() - peluruTerpakai);
        System.out.println(" menembak " + peluruTerpakai + " kali. Bunyi: " + senjata.getBunyi());
    }

    public void menusuk() {
        if (!senjata.isMenusuk()) {
            System.out.println("Senjata ini tidak bisa digunakan untuk menusuk!");
            return;
        }

        System.out.println("Menusuk dengan " + senjata.getBunyi() + "!"); // Placeholder sound for stabbing
    }

    public String getBunyi() {
        return senjata.getBunyi();
    }

    public void setBunyi(String bunyi) {
        senjata.setBunyi(bunyi);
    }

    public int getPeluru() {
        return senjata.getPeluru();
    }

    public void setPeluru(int peluru) {
        senjata.setPeluru(peluru);
    }
}