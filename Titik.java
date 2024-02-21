/**
 * File      	: Titik.java		01/03/23
 * Nama penulis : Nadiva Aulia Inaya
 * NIM          : 24060122130093
 * Deskripsi 	: Kelas yang berisi main dari Titik
 * 
 */

class Titik
{
	double absis, ordinat;
	static double counterTitik;
	
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

   	Titik(double a, double b)
	{
		absis = a;
        	ordinat = b;
        	counterTitik++;
    	}

	void setAbsis(double abs)
	{
		absis = abs;
	}

	double getAbsis()
	{
		return absis;
	}
	
	void setOrdinat(double ord)
	{
		ordinat = ord;
	}

	double getOrdinat()
	{
		return ordinat;
	}

	static double getCounterTitik()
	{
		return counterTitik;
	}
}