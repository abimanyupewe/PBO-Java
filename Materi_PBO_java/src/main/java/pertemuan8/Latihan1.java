/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

import java.util.Scanner;

/**
 *
 * @author A-10
 */
public class Latihan1 {

    static void sayHello() {
        System.out.println("Hello, ini fungsi void");
        System.out.println("Fungsi void tidak ada return");
        System.out.println("Fungsi ini tanpa parameter,"
                + " ditandai dengan tanda kurung "
                + "yaitu () tanpa deklarasi "
                + "variabel didalamnya, "
                + "yang berarti fungsi ini tidak "
                + "menerima data ketika dipanggil "
                + " dari luar");
    }

    static void sayHelloTo(String nama) {
        System.out.println("Hello " + nama);
        System.out.println("Fungsi void tidak ada return");
        System.out.println("Dengan parameter String nama, \n"
                + "Berarti mendapat data bertipe "
                + "String ketika dipanggil");
    }

    static int inputNilaiInteger(String namaVariabel) {
        Scanner inputScanner = new Scanner(System.in);
        int nilaiInput;
        System.out.println("Deklarasi fungsi ini tanpa "
                + "keyword void, \n jadi tapi "
                + "menggunakan tipe int, \n"
                + "sehingga ada return nilai "
                + "int");

        System.out.println("Silakan input " + namaVariabel);
        nilaiInput = inputScanner.nextInt();
        return nilaiInput; //nilaiInput bertipe int sebagai
//nilai return
    }

    public static void main(String[] args) {
        int varInteger;
        sayHello(); //memanggil metode sayHello()
// Perintah berikut memanggil
// metode sayHelloTo(String nama), dengan
// memberi nilai "Budi" untuk variabel nama
        sayHelloTo("Budi");
//Berikut ini, nilai variabel nama
//Adalah "George"
        String namaMahasiswa = "George";
        sayHelloTo(namaMahasiswa);
// di bawah ini memanggil metode
// inputNilaiInteger(String namaVariabel)
// untuk memberikan nilai variabel varInteger
// melalui input dari user, di metode tersebut
        varInteger = inputNilaiInteger("var Integer");
        System.out.println("Nilai varInteger sekarang = " + varInteger);
    }
}
