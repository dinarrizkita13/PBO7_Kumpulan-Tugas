
package tugaspertemuan8;


class PersegiPanjang {
    int panjang, lebar;

    PersegiPanjang(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    int luas() {
        return panjang * lebar;
    }
}

public class no5HitamArea {
    public static int hitungLuasHitam(PersegiPanjang luar, PersegiPanjang dalam) {
        return luar.luas() - dalam.luas();
    }

    public static void main(String[] args) {
        PersegiPanjang luar = new PersegiPanjang(10, 8);
        PersegiPanjang dalam = new PersegiPanjang(7, 5);

        int luasHitam = hitungLuasHitam(luar, dalam);

        System.out.println("Luas bagian hitam = " + luasHitam);
    }
}
