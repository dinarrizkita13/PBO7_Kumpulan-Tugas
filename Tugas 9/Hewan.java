public class Hewan {
    String jenis;
    String[] daftar;

    public Hewan(String jenis, String[] daftar) {
        this.jenis = jenis;
        this.daftar = daftar;
    }

    public void tampilkan() {
        System.out.println("- " + jenis + ": ");
        for (String h : daftar) {
            System.out.print(h + ", ");
        }
        System.out.println("\n");
    }
}
