/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author A-5
 */
public class per5 {

    public static void main(String[] args) {
        int varInteger;
        sayHello(); //memanggil metode sayHello()
        sayHelloTo("Budi"); //memanggil metode sayHelloTo(String nama)
        String namaMahasiswa = "George";
//di bawah ini memanggil metode sayHelloTo(String nama) dengan
// memberikan data variabel namaMahasiswa sebagai nilai parameter String nama
        sayHelloTo(namaMahasiswa);
        //di bawah ini memanggil metode inputNilaiInteger(String namaVariabel)
//untuk memberikan nilai variabel varInteger melalui input dari user.
        varInteger = inputNilaiInteger("var Integer");
        System.out.println("Nilai varInteger sekarang = " + varInteger);
    }
//Metode bertipe void, tanpa parameter

    static void sayHello() {
        System.out.println("Hello, ini dari metode bertipe void, tanpa parameter");
    }

    static void sayHelloTo(String nama) {
        System.out.println("Hello " + nama + ", Metode bertipe void, dengan parameter");
    }
//

    static int inputNilaiInteger(String namaVariabel) {
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Silakan input nilai untuk variabel " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput;
    }
}
