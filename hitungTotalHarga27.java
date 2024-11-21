import java.util.Scanner;

public class hitungTotalHarga27 {

    public static int hitungTotalHarga27 (int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if ("DISKON50".equals(kodePromo)) {
            System.out.println("anda mendapatkan diskon 50%");
            hargaTotal = hargaTotal - (hargaTotal / 2);
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("anda mendapatkan diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100); 
        } else {
            System.out.println("Kode promo invalid.");
        }

        return hargaTotal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaKeseluruan = 0;
        System.out.print("\nMasukan jumlah jenis menu yang ingin anda pesan: ");
        int jumlhMenu = sc.nextInt();

        for (int i = 0; i < jumlhMenu; i++) {
            System.out.println("==========MENU RESTO KAFE==========");
            System.out.println("1. Kopi Hitam - Rp 15000");
            System.out.println("2. Capucino - Rp 20000");
            System.out.println("3. Latte - Rp 22000");
            System.out.println("4. Teh Tarik - Rp 12000");
            System.out.println("5. Roti Bakar - Rp 10000");
            System.out.println("6. Mie Goreng - Rp 18000");
            System.out.println("===================================");
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukan jumlah item yang ingin dipesan: ");
            int banyakItems = sc.nextInt();
            System.out.print("Masukan kode promo: ");
            String kodePromo = sc.next();

            int totalHargaMenu = hitungTotalHarga27(pilihanMenu, banyakItems, kodePromo);
            hargaKeseluruan += totalHargaMenu;

            System.out.println("Total harga untuk menu ini: " + totalHargaMenu);
        }
        System.out.println("\nTotal keseluruhan pesanan: " + hargaKeseluruan);

     
    }
}  