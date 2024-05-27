/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

import LatihanClass.Person;

/**
 *
 * @author A-11
 */
public class LatihanKelas { // TokoBuku

    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();

        buku1.judul = "Title1";
        buku2.judul = "Title2";

        buku1.author.nama = "Ojan";
        buku2.author.nama = "Udin";

        System.out.println("========================== Buku 1 ===============================");
        System.out.println("Judul " + buku1.judul);
        buku1.author.sebutNama();
        System.out.println("Tahun Terbit " + buku1.tahunPenerbitan);
        System.out.println("Harga " + buku1.harga.jual);
        System.out.println("Penerbit " + buku1.penerbit.nama);
        System.out.println(buku1.penerbit.alamat);
        System.out.println("========================== Buku 2 ===============================");
        System.out.println("Judul " + buku2.judul);
        System.out.println("Author " + buku2.author.nama);
        System.out.println("Tahun Terbit " + buku2.tahunPenerbitan);
        System.out.println("Harga " + buku2.harga.jual);
        System.out.println("Penerbit " + buku1.penerbit.nama);
        System.out.println(buku1.penerbit.alamat);
        System.out.println("=================================================================");

    }
}

class Buku {

    String judul;
    Person author = new Person();
    int tahunPenerbitan = 1855;
    Harga harga = new Harga();
    Corporation_book penerbit = new Corporation_book();
}

class Harga {

    double jual = 200000.00;
    double beli = 10000.00;
}
