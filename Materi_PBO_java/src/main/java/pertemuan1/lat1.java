/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author A-5
 */
public class lat1 {
    public static void main(String[] args) {
    int nilaiA = 10;
    int nilaiB = 20;

    double nilaiC = 5.5;
    double nilaiD = 2.3;
    
    boolean isPlus = true;
    
    
    String nama = "masih kosong!";
          
        System.out.println("Nilai A adalah " + nilaiA);
        System.out.println("Nilai B adalah " + nilaiB);
        System.out.println("Nilai C adalah " + nilaiC);
        System.out.println("Nilai D adalah " + nilaiD);
        System.out.println("isPlus adalah " + isPlus);
        
        System.out.println("====================================================================================");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai A (Int) : ");
        nilaiA = input.nextInt();
        System.out.println("Nilai yang baru anda masukkan adalah : " + nilaiA);
        
        System.out.println("Masukkan nilai B (Int) : ");
        nilaiB = input.nextInt();
        System.out.println("Nilai yang baru anda masukkan adalah : " + nilaiB);
        
        System.out.println("Masukkan nilai C (Double) : ");
        nilaiC = input.nextDouble();
        System.out.println("Nilai yang baru anda masukkan adalah : " + nilaiC);
        
        System.out.println("Masukkan nilai D (Double) : ");
        nilaiD = input.nextDouble();
        System.out.println("Nilai yang baru anda masukkan adalah : " + nilaiD);
        
        System.out.println("====================================================================================");
        
        System.out.println("Masukkan nilai Boolean (True/False) : ");
        isPlus = input.nextBoolean();
        System.out.println("Nilai Boolean yang baru anda masukkan adalah : " + isPlus);
        
        System.out.println("====================================================================================");
        
        System.out.println("Nama anda "+ nama);
        System.out.println("Masukkan Nama Anda :");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("Nama Anda adalah " + nama);
        
        System.out.println("=========================================== Terima Kasih =========================================");
        
        
    }
}
