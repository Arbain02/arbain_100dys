package day40;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();

        for (int i = 1; i <= jumlahBaris; i++) {

            for (int j = 1; j <= jumlahBaris - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
