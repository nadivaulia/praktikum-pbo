import javax.sound.sampled.SourceDataLine;

/**
 * File      	: MTitik.java		01/03/23
 * Nama penulis : Nadiva Aulia Inaya
 * NIM          : 24060122130093
 * Deskripsi 	: Kelas yang berisi main dari Titik
 * 
 */

public class MTitik
{
	public static void main(String[] args)
	{
		Titik t1, t2, t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5,6);

		t1.setAbsis(1);
		t1.setOrdinat(2);
		t2.setAbsis(3);
		t2.setOrdinat(4);

//		System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
		System.out.println("T1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		System.out.println("T2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
		System.out.println("T3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
		System.out.println("Jarak T1 dari titik pusat (0,0) adalah" + t1.getJarakPusat(t1));
		t1.refleksiX(t1);
		System.out.println("Hasil refleksi X T1: " + "(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		t1.refleksiY(t1);
		System.out.println("Hasil refleksi Y T1: " + "(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		t1.getRefleksiX();
		System.out.println("T1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
		t1.getRefleksiY();
		System.out.println("T1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
	}
}

public class MGaris {
	public static void main(String[] args) {
		Titik awal = new Titik(1, 2);
		Titik akhir = new Titik(5, 4);

		Garis g = new Garis(awal, akhir);

		System.out.println("Titik awal: (" + g.getAwal().getAbsis() + ", " + g.getAwal().getOrdinat() + ")");
		System.out.println("Titik akhir: (" + g.getAkhir().getAbsis() + ", " + g.getAkhir().getOrdinat() + ")");

		System.out.println("Panjang garis: " + g.getPanjang());

		System.out.println("Gradien garis: " + g.getGradien());
	}
}