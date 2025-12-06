public class MainProduk2 {
    public static void main(String[] args) {

        Komik komik = new Komik("One Piece", "Eichiro Oda", 1200);
        Games games = new Games("Mobile Legends", "Moonton", "5 jam");

        System.out.println(komik.getInfoProduk());
        System.out.println(games.getInfoProduk());
    }
}
