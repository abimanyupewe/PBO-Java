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
        System.out.println("Harga " + buku1.harga.getJual());
        buku1.harga.setJual(120000); // untuk mengubah harga buku
        System.out.println("Penerbit " + buku1.penerbit.nama);
        System.out.println(buku1.penerbit.alamat);
        System.out.println("Harga jual buku 1 = " + buku1.harga.getJual());
        System.out.println("========================== Buku 2 ===============================");
        System.out.println("Judul " + buku2.judul);
        System.out.println("Author " + buku2.author.nama);
        System.out.println("Tahun Terbit " + buku2.tahunPenerbitan);
//        System.out.println("Harga " + buku2.harga.jual);
        System.out.println("Harga " + buku2.harga.getBeli());
        System.out.println("Penerbit " + buku1.penerbit.nama);
        System.out.println(buku1.penerbit.alamat);
        System.out.println("Harga jual buku 2 = " + buku2.harga.getJual());
        System.out.println("=================================================================");

//        Harga hargabaru = new Harga()
        buku1.terjual();

    }
}

class Buku {

    String judul;
    Person author = new Person();
    int tahunPenerbitan = 1855;
    Harga harga = new Harga();
    Corporation_book penerbit = new Corporation_book();

    public void terjual() {
        System.out.println("Buku terjual dengan harga " + harga.getBeli());
    }
}

class Harga {

    private double jual = 200000.00;
    private double beli = 10000.00;

    //    menggunakan get dan seter di insert code
    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }

    public double getBeli() {
        return beli;
    }

    public void setBeli(double beli) {
        this.beli = beli;
    }

}
