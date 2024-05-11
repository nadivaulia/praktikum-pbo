package latihanVeryEasy;
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }
    public int getPeluru() {
        return peluru;
    }
    public void menembak() {
        if (this.getPeluru() > 0) {
            System.out.println(this.getBunyi());
            this.setPeluru(this.getPeluru() - 1);
            System.out.println("Sisa Peluru: " + this.getPeluru());
        }
    }
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}

