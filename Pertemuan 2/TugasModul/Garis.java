public class Garis {
    private Titik awal, akhir;

    public Garis(Titik awal, Titik akhir)
    {
        this.awal = awal;
        this.akhir = akhir;
    }

    public void setAwal(Titik awal)
    {
        this.awal = awal;
    }

    public Titik getAwal()
    {
        return this.awal;
    }

    public void setAkhir(Titik akhir)
    {
        this.akhir = akhir;
    }

    public Titik getAkhir()
    {
        return this.akhir;
    }

    public double getPanjang(Garis g)
    {
        double deltaX = akhir.getAbsis(g) - awal.getAbsis(g);
        double deltaY = akhir.getOrdinat(g) - awal.getOrdinat(g);
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
    public double getGradien(Garis g)
    {
        double deltaX = akhir.getAbsis(g) - awal.getAbsis(g);
        double deltaY = akhir.getOrdinat(g) - awal.getOrdinat(g);
        return deltaX/deltaY;
    }
}
