import java.util.Scanner;

public class Tugas2Kafe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("SELAMAT DATANG DI KAFE KAMPUS");
        System.out.print("Berapa jumlah item yang ingin dipesan? ");
        int jmlItem = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlItem];
        int[] hargaPesanan = new int[jmlItem];
        int totalBiaya = 0;

        for (int i = 0; i < jmlItem; i++) {
            boolean validMenu = false;
            while (!validMenu) {
                System.out.print("Masukan nama menu pesanan ke-" + (i + 1) + ": ");
                String inputMenu = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        System.out.println("-> " + menu[j] + " ditambahkan (Rp" + harga[j] + ")");
                        validMenu = true;
                        break;
                    }
                }

                if (!validMenu) {
                    System.out.println("Maaf, menu '" + inputMenu + "' tidak tersedia. Silahkan masukkan menu lain.");
                }
            }

        }

        System.out.println("DAFTAR PESANAN ANDA");
        for (int i = 0; i <pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + "Rp " + hargaPesanan[i]);
        }
        System.out.println("---------------------------------");
        System.out.println("TOTAL BIAYA KESELURUHAN: Rp " + totalBiaya);
    }
    
}
