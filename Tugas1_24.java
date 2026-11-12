import java.util.Scanner;

public class Tugas1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyaknya nilai mahasiswa: ");
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];
        int total = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        double rataRata = (double) total / nilaiMhs.length;
        int max = nilaiMhs[0];
        int min = nilaiMhs[0];

        System.err.println("Daftar Nilai Mahasiswa");
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > max) max = nilaiMhs[i];
            if (nilaiMhs[i] < min) min = nilaiMhs[i];

            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Nilai Mhs ke- " + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }

        System.out.println("Ringkasan Statistik");
        System.out.println("Rata-rata Kelas : " + rataRata);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah  : " + min);
    }
}
