/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk menaampilkan Tunjangan
 */
public class PBOIF210119051Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
            String status;
            int gajipokok;
            double tunjangan, totalgaji;
    
        System.out.println("============ Program Tunjangan ============");
        System.out.print("Berapa Gajipokok anda perbulan? : Rp.");
        gajipokok = input.nextInt();
        System.out.print("Status Anda ? (Menikah/Belum):");
        status = input.next();
        
        if ("Menikah".equals(status)){
            tunjangan = 0.35 * gajipokok;
          
        } else {
            tunjangan = 0;
        }
        totalgaji = gajipokok + tunjangan;   
        
        System.out.println("");
        System.out.println("========== Hasil Perhitungan Gaji =========");
        System.out.println("Gaji Pokok :Rp. " + gajipokok);
        System.out.println("Tunjangan  :Rp. " + tunjangan);
        System.out.println("Total Gaji :Rp. " + totalgaji);
       
        
        
    }
    
}
