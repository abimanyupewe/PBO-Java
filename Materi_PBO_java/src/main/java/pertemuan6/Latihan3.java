/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author A-11
 */
public class Latihan3 {

    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        System.out.println("Nilai people adalah " + people);
        System.out.println("Nilai cars adalah " + cars);
        System.out.println("Nilai buses adalah " + buses);
        
        System.out.println("--------------------------------------------------");

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Silakan input nilai baru untuk people ");
        people = inputScanner.nextInt();
        System.out.println("Silakan input nilai baru untuk cars ");
        cars = inputScanner.nextInt();
        System.out.println("Silakan input nilai baru untuk buses ");
        buses = inputScanner.nextInt();
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Nilai baru people adalah " + people);
        System.out.println("Nilai baru cars adalah " + cars);
        System.out.println("Nilai baru buses adalah " + buses);
        
        System.out.println("--------------------------------------------------");
        
        if (cars > people) {
            System.out.println("\n\tKita sebaiknya mengambil mobil.");
        } else if (cars < people) {
            System.out.println("\tKita sebaiknya tidak mengambil mobil.");
        } else {
            System.out.println("\tKita tidak bisa memutuskan.");
        }
        if (buses > cars) {
            System.out.println("\tItu terlalu banyak bis.");
        } else if (buses < cars) {
            System.out.println("\tMungkin kita bisa mengambil bis.");
        } else {
             System.out.println("\tKita masih belum bisa memutuskan.");
        }
        if (people > buses) {
            System.out.println("\tBaiklah, mari kita ambil bis saja.");
        } else {
            System.out.println("\tBaiklah, kita tinggal di rumah saja.");
        }
    }
}
