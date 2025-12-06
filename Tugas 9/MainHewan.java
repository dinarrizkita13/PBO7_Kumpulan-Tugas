public class MainHewan {
    public static void main(String[] args) {

        String[] dua = {"kangguru", "ayam", "bebek", "dll"};
        String[] enam = {"capung", "nyamuk", "kupu-kupu", "dll"};
        String[] empat = {"kucing", "anjing", "kuda", "dll"};
        String[] delapan = {"kepiting", "belalang", "laba-laba", "dll"};

        Hewan h1 = new Hewan("hewan berkaki dua", dua);
        Hewan h2 = new Hewan("hewan berkaki enam", enam);
        Hewan h3 = new Hewan("hewan berkaki empat", empat);
        Hewan h4 = new Hewan("hewan berkaki delapan", delapan);

        System.out.println("Macam-macam hewan:");
        h1.tampilkan();
        h2.tampilkan();
        h3.tampilkan();
        h4.tampilkan();
    }
}