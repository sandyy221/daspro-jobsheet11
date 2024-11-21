import java.util.Scanner;

public class hitungTotalHarga27 {

    public static int hitungTotalHarga27 (int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Berikan diskon 50%");
            hargaTotal = hargaTotal - (hargaTotal / 2);
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Berikan diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100); 
        } else {
            System.out.println("Kode promo invalid.");
        }

        return hargaTotal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("\nMasukan nomor menu yang ingin anda pesan: ");
       int pilihanMenu = sc.nextInt();
       System.out.print("Masukan jumlah item yang ingin dipesan: ");
       int banyakItems = sc.nextInt();
       System.out.print("Masukan kode promo: ");
       String kodePromo = sc.next();
       int totalHarga = hitungTotalHarga27(pilihanMenu, banyakItems, kodePromo);
       System.out.println("Total harga untuk pesanan saya: Rp" + totalHarga);

        
    }
}  