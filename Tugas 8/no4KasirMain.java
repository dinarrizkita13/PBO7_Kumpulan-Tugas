
package tugaspertemuan8;

class Kasir {
    int harga, jumlah;
    double diskon;

    // harga
    Kasir(int harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    // harga + jumlah
    Kasir(int harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    // harga + jumlah + diskon
    Kasir(int harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    double total() {
        double subtotal = harga * jumlah;
        return subtotal - (subtotal * diskon);
    }
}

public class no4KasirMain {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        Kasir k2 = new Kasir(10000, 3);
        Kasir k3 = new Kasir(10000, 3, 0.1);

        System.out.println("Total 1 = " + k1.total());
        System.out.println("Total 2 = " + k2.total());
        System.out.println("Total 3 = " + k3.total());
    }
}
