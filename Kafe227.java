import java.util.Scanner;

public class Kafe227 {
    
    public static void menu(String namaPelanggan, boolean isMember) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nama anda: ");
        namaPelanggan = sc.nextLine();
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah Member! dapatkan diskon 10% di setiap pembelian");
            System.out.println();
        }
        System.out.println("==========MENU RESTO KAFE==========");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2.Capucino - Rp 20000 ");
        System.out.println("3. Latte - Rp 22000");
        System.out.println("4.Teh Tarik - Rp 12000 ");
        System.out.println("5. Roti Bakar - Rp 10000");
        System.out.println("6. Mie Goreng - Rp 18000");
        System.out.println("===================================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan");
    }
    public static void main(String[] args) {
        menu("Andi", true);
    }
}
