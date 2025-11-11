// OperasiArray.java
// Program untuk masukkan elemen array, cari max/min, jumlah, rata-rata, jumlah indeks ganjil/genap, dan urutkan
import java.util.Scanner;

public class OperasiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = Math.max(0, sc.nextInt());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Array kosong.");
            sc.close();
            return;
        }

        int max = arr[0], min = arr[0];
        int sum = 0;
        for (int v : arr) {
            if (v > max) max = v;
            if (v < min) min = v;
            sum += v;
        }

        double avg = (double) sum / n;
        System.out.println("Nilai terbesar: " + max + ", indeks: " + indexOf(arr, max));
        System.out.println("Nilai terkecil: " + min + ", indeks: " + indexOf(arr, min));
        System.out.println("Jumlah semua elemen: " + sum + ", rata-rata: " + avg);

        int jumlahBerIndeksGanjil = 0, jumlahBerIndeksGenap = 0;
        for (int i = 0; i < n; i++) {
            if ((i % 2) == 0) jumlahBerIndeksGenap += arr[i];
            else jumlahBerIndeksGanjil += arr[i];
        }

        System.out.println("Jumlah elemen berindeks ganjil: " + jumlahBerIndeksGanjil);
        System.out.println("Jumlah elemen berindeks genap: " + jumlahBerIndeksGenap);

        int checkSum = jumlahBerIndeksGanjil + jumlahBerIndeksGenap;
        System.out.println("Check total (ganjil+genap) = " + checkSum +
                           " => " + (checkSum % 2 == 0 ? "Genap" : "Ganjil"));

        java.util.Arrays.sort(arr);
        System.out.println("Array terurut: " + java.util.Arrays.toString(arr));
        sc.close();
    }

    private static int indexOf(int[] a, int val) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == val) return i;
        return -1;
    }
}
