/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2307254_amandadevikahakim_soalno02;

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
        
        System.out.print("Masukan ranking: ");
        int ranking = input.nextInt();
        
        System.out.print("Apakah naik kelas? (true / false): ");
        boolean naikKelas = input.nextBoolean();
        
        if (ranking == 1 && naikKelas){
            System.out.println("Selamat! Kamu dapat hadiah!");
        }else{
            System.out.println("Maaf ya, kamu belum memenuhi syarat");
        }
    }
    
}
