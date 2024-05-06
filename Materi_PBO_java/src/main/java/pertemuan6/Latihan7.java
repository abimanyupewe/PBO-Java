/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A-11
 */
import java.util.Scanner;
import java.util.Random;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Tuliskan pesan di sini, saya akan tampilkan berulang.");
        System.out.print("Tuliskan Pesan anda paduka : ");
        String message = keyboard.nextLine();

        // Menggunakan kelas Random untuk menghasilkan bilangan acak
        Random mesinRandom = new Random();
        int jumlahPengulangan = mesinRandom.nextInt(20) + 1; // Menghasilkan bilangan dari 1 sampai 20
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\nJumlah pengulangan yang didapatkan = " + jumlahPengulangan);

        if (jumlahPengulangan >= 10) { // jika sama dengan lebih dari 10
            System.out.println("\n\tBilangan random yang didapat terlalu besar, pesan akan diulang 5 kali.");
            jumlahPengulangan = 5; // maka akan di cetak sebanyak 5 kali
        }

        System.out.println("\nPesan diulang sebnyak : " + jumlahPengulangan + " kali\n");
        System.out.println("-----------------------------------------------------------------------------");

        for (int n = 0; n < jumlahPengulangan; n++) { // di mulai dari index ke 0
            System.out.println(n + ". " + message);
        }
    }
}
