package TugasTambahan.Soal2.org.main;

import TugasTambahan.Soal2.org.mahasiswa.Mahasiswa;
import TugasTambahan.Soal2.org.walimahasiswa.WaliMahasiswa;

public class MMahasiswa {

    public static void main(String[] args) {

        String nama = "Nadiva Aulia Inaya";
        String nik = "123456789";
        String nim = "24060122130093";
        String jurusan = "Informatika";
        WaliMahasiswa wali = new WaliMahasiswa("234567890","Adhe Setya","08123456789","Jl.Gondang Raya");
        Mahasiswa mhs = new Mahasiswa(nama, nik, nim, jurusan, wali);
        mhs.cetak();
    }
}
