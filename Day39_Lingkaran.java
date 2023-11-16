package day39_lingkaran;

import java.util.Scanner;

public class Day39_Lingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double keliling = hitungKeliling(jariJari);      
        double luas = hitungLuas(jariJari);  
        System.out.println("Keliling lingkaran: " + keliling);
        System.out.println("Luas lingkaran: " + luas);
        input.close();
    }  
    public static double hitungKeliling(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
    public static double hitungLuas(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }
}
