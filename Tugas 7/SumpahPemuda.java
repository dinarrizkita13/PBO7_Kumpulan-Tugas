public class SumpahPemuda {
    public SumpahPemuda() {
        // constructor menampilkan kalimat utama
        System.out.println("Kami putra dan putri Indonesia");
    }

    // method menampilkan tiga kelanjutan sumpah
    public void lanjutkanSumpah() {
        System.out.println("Pertama: Kami menjaga persatuan bangsa.");
        System.out.println("Kedua: Kami memajukan kebudayaan Indonesia.");
        System.out.println("Ketiga: Kami berbakti kepada tanah air.");
    }

    public static void main(String[] args) {
        SumpahPemuda s = new SumpahPemuda();
        s.lanjutkanSumpah();
    }
}
