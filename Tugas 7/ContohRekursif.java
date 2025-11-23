public class ContohRekursif {
    // rekursif: cetak n sampai 1
    public static void hitungMundur(int n) {
        if (n <= 0) {
            System.out.println("Selesai!");
            return;
        }
        System.out.println(n);
        hitungMundur(n - 1); // rekursi
    }

    public static void main(String[] args) {
        hitungMundur(5); // contoh: 5 4 3 2 1 Selesai
    }
}
