public class Komik extends Produk {

    private int jumlahHalaman;
    private String genre;

    public Komik(String judul, String penulis, int jumlahHalaman, String genre) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
        this.genre = genre;
    }

    Komik(String one_Piece, String eichiro_Oda, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInfoProduk() {
        return "Komik: " + judul +
               " | Penulis: " + penulis +
               " | Halaman: " + jumlahHalaman +
               " | Genre: " + genre;
    }
}
