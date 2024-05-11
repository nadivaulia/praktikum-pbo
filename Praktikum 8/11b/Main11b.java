class Kupu {
    void gerak() {}
}

class Ulat extends Kupu {
    @Override
    void gerak() {
        System.out.println("ulat merayap");
    }
}

class Kepompong extends Kupu {
    @Override
    void gerak() {
        System.out.println("kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    @Override
    void gerak() {
        System.out.println("kupu terbang");
    }
}

class Data<T> {
    private T isi;
    T getIsi() {
        return this.isi;
    }
    void setIsi(T x) {
        this.isi = x;
    }
}

class Main11b {
    public static void main(String[] args) {
        //kamus
        Ulat K;
        Data<Kupu> anu;
        //algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
