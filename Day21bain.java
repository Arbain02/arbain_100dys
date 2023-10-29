import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


        // Definisikan konstanta
        int NILAI_PRESENSI_BOBOT = 30;
        int NILAI_TUGAS_BOBOT = 30;
        int NILAI_UAS_BOBOT = 40;

        // Input data
        Scanner input = new Scanner(System.in);
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Matakuliah: ");
        String matakuliah = input.nextLine();
        System.out.print("Nilai presensi: ");
        int nilaiPresensi = input.nextInt();
        System.out.print("Nilai tugas: ");
        int nilaiTugas = input.nextInt();
        System.out.print("Nilai UAS: ");
        int nilaiUas = input.nextInt();

        // Hitung nilai akhir
        int nilaiAkhir = (nilaiPresensi * NILAI_PRESENSI_BOBOT) + (nilaiTugas * NILAI_TUGAS_BOBOT) + (nilaiUas * NILAI_UAS_BOBOT);

        // Hitung rata-rata
        float rataRata = (float) nilaiAkhir / (NILAI_PRESENSI_BOBOT + NILAI_TUGAS_BOBOT + NILAI_UAS_BOBOT);

        // Tampilkan hasil
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Matakuliah: " + matakuliah);
        System.out.println("Nilai presensi: " + nilaiPresensi);
        System.out.println("Nilai tugas: " + nilaiTugas);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Rata-rata: " + rataRata);
    }
}
	
