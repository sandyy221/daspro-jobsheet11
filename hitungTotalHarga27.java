import java.util.Scanner;

public class hitungTotalHarga27 {

    public static int hitungTotalHarga27 (int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("\nMasukan nomor menu yang ingin anda pesan: ");
       int pilihanMenu = sc.nextInt();
       System.out.print("Masukan jumlah item yang ingin dipesan: ");
       int banyakItems = sc.nextInt();
       int totalHarga = hitungTotalHarga27(pilihanMenu, banyakItems, "DISKON50");
       System.out.println("Total harga untuk pesanan saya: Rp" + totalHarga);

        
    }
}  