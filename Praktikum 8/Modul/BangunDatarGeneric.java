public class BangunDatarGeneric <T2 extends BangunDatar>{
    private T2 bangunDatar;

    public void set(T2 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T2 get(){
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

// Setelah mengganti T menjadi T2, tidak terjadi perubahan
// fungsionalitas dari kode tersebut, karena T adalah nama
// placeholder atau parameter tipe generik dalam Java
// yang bisa diganti dengan nama apapun. Tipe datanya tetap
// berupa BangunDatar.
