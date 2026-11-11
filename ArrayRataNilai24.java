import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //pertanyaan No.2
        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2;
        int countLulus = 0; //pertanyaan No. 1

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                countLulus++;
            }
        }
            rata2 = (double) total / nilaiMhs.length;
        
            int tertinggi = nilaiMhs[0];
            int terendah = nilaiMhs[0];
            for (int i = 1; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
                if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
            }
            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata: " + rata2);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Banyaknya mahasiswa lulus (>70): " + countLulus);
    }
}