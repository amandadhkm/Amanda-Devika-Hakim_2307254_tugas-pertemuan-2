/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2307254_amandadevikahakim_soalno1;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author amandadhkm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        
        System.out.print("Masukan bilangan pertama: ");
        double a = input.nextDouble();
        
        System.out.print("Masukan bilangan kedua: ");
        double b = input.nextDouble();
        
        System.out.print("Masukan bilangan ketiga: ");
        double c = input.nextDouble();
        
        double penjumlahan = a + b + c;
        double pengurangan = a - b - c;
        double perkalian = a * b * c;
        double pembagian = (b != 0 && c != 0) ? (a/b/c): Double.NaN;
        
        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);
        System.out.println("Hasil Perkalian: " + perkalian);
        System.out.println("Hasil Pembagian: " + (Double.isNaN(pembagian)? "Tidak dapat dibagi oleh nol" : pembagian));
    }
    
}
