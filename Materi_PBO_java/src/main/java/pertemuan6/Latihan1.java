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
public class Latihan1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        System.out.println("You are: ");
        if (age < 13) {
            System.out.println("\tTerlalu Mudah untuk membuat Facebook");
        }
        if (age < 16) {
            System.out.println("\tTerlalu mudah untuk mendapatkan sim");
        }
        if (age <= 18) {
            System.out.println("\tTerlalu mudah untuk menikah");
        }

        if (age < 35) {
            System.out.println("\tTerlalu mudah untuk menikah");
        }
        
        if (age >= 50) {
            System.out.println("\"Anda sudah setengah baya, hati-hati dengan kulineran");
        }
    }
}
