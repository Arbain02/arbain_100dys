package day31_alas.kali.sisi;
import java.util.Scanner;
public class Day31_alasKaliSisi {

    public static void main(String[] args) {
        
        // Deklarasi variabel
        int alas;
        int sisi;
        int luas;

        // Membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai alas: ");
        alas = input.nextInt();
        System.out.print("Masukkan nilai sisi: ");
        sisi = input.nextInt();

        // Menghitung luas
        luas = alas * sisi;

        // Menampilkan hasil
        System.out.println("Luas = " + luas);
    }
}

    
