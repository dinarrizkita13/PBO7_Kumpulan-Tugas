public class Games extends Produk {

    private int ukuranGB;
    private String platform;

    public Games(String judul, String penulis, int ukuranGB, String platform) {
        super(judul, penulis);
        this.ukuranGB = ukuranGB;
        this.platform = platform;
    }

    Games(String mobile_Legends, String moonton, String _jam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInfoProduk() {
        return "Game: " + judul +
               " | Developer: " + penulis +
               " | Ukuran: " + ukuranGB + "GB" +
               " | Platform: " + platform;
    }
}
