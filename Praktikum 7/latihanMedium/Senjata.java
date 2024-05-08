package latihanMedium;

public class Senjata {

    private String bunyi; // Sound of the gun
    private boolean menusuk; // Can be used for stabbing
    private int peluru; // Number of bullets

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false; // Default: cannot be used for stabbing
        this.peluru = 0; // Default: no bullets
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}

