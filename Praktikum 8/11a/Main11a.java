class Kupu {
    void gerak() {
        // Implementasi gerakan kupu-kupu
    }
}

class Ulat extends Kupu {
    @Override
    void gerak() {
        System.out.println("ulat merayap");
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

class Main11a {
    public static void main(String[] args) {
        //kamus
        Ulat K;
        Data<Ulat> anu;
        //algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}