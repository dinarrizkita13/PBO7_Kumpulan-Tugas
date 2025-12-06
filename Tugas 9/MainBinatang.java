public class MainBinatang {
    public static void main(String[] args) {

        KucingRumahan k = new KucingRumahan("Oyen");

        k.makan(); // method dari superclass Binatang

        System.out.println(k.display()); // method dari subclass
    }
}
