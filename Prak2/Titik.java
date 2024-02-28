/**
 * File      	: Titik.java		01/03/23
 * Nama penulis : Nadiva Aulia Inaya
 * NIM          : 24060122130093
 * Deskripsi 	: Kelas yang berisi main dari Titik
 * 
 */

public class Titik
{
	private double absis, ordinat;

	public Titik(double absis, double ordinat)
	{
		this.absis = absis;
		this.ordinat = ordinat;
	}

	public Titik()
	{
		this(0,0);
	}

	public void setAbsis(double absis)
	{
		this.absis = absis;
	}

	public double getAbsis()
	{
		return this.absis;
	}
	
	public void setOrdinat(double ordinat)
	{
		this.ordinat = ordinat;
	}

	public double getOrdinat()
	{
		return this.ordinat;
	}

//	static double getCounterTitik()
//	{
//		return counterTitik;
//	}

	public double getJarakPusat(Titik t)
	{
		return Math.sqrt(getAbsis(t)*getAbsis(t) + getOrdinat(t)*getOrdinat(t));
	}
	public void refleksiX(Titik t)
	{
		double ordinat = t.getOrdinat();
		ordinat *= -1;
		t.setOrdinat(ordinat);
	}

	public void refleksiY(Titik t)
	{
		double absis = t.getAbsis();
		absis *= -1;
		t.setAbsis(absis);
	}

	public double getRefleksiX()
	{
		refleksiX((this));
		return this.getOrdinat();
	}

	public double getRefleksiY()
	{
		refleksiY((this));
		return this.getAbsis();
	}

}