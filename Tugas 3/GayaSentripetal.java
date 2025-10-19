/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class GayaSentripetal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan massa benda (kg): ");
        double m = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (m): ");
        double r = input.nextDouble();

        double Fc = (m * v * v) / r;

        System.out.println("Gaya Sentripetal = " + Fc + " N");
    }
}
