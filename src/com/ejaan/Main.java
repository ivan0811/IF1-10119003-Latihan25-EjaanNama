package com.ejaan;
import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk mengubah nama menjadi ejaan
 */

public class Main {
    static final Scanner scan = new Scanner(System.in);
    String nama;

    private void masukkanNamaDepan(){
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
    }

    private void tampilEjaanNama(){
        System.out.println("\nEjaan untuk \""+nama+"\" adalah : ");
        int num = 1;
        for (char ejaan : nama.toCharArray()){
            System.out.println("Huruf ke-"+(num++)+" : "+ejaan);
        }
    }

    public static void main(String[] args) {
        Main data = new Main();
        data.masukkanNamaDepan();
        data.tampilEjaanNama();
    }
}
