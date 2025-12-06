public class MainProduk {
    public static void main(String[] args) {

        Komik komik = new Komik("Naruto", "Masashi Kishimoto", 250, "Action");
        Games game = new Games("GTA V", "Rockstar Games", 98, "PC");

        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());
    }
}
