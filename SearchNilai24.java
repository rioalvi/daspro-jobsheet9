import java.util.Scanner;
public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pertanyaan no 2
        System.out.print("Masukan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke- " + i);
                ditemukan = true;
                break;
            }
        }
        //pertanyaan no 3
        if (!ditemukan) {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan dalam data.");
        }
    }
}