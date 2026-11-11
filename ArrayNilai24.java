import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        System.out.println("Daftar Mahasiswa Lulus");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }
        
        System.out.println("Jumlah Mahasiswa Lulus: " + jmlLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jmlTidakLulus);
    }
}