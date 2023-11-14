package day37.polasegitiga;

import java.util.Scanner;

public class Day37PolaSegitiga {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi A: ");
        double sisiA = input.nextDouble();
        System.out.print("Masukkan panjang sisi B: ");
        double sisiB = input.nextDouble();
        System.out.print("Masukkan panjang sisi C: ");
        double sisiC = input.nextDouble();

        Triangle segitiga = new Triangle(sisiA, sisiB, sisiC);

        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());

        input.close();
    }
}

class Triangle {

    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Triangle(double a, double b, double c) {
        sisiA = a;
        sisiB = b;
        sisiC = c;
    }

    public double luas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
