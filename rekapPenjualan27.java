import java.util.Scanner;

public class rekapPenjualan27 {
    static int[][] dataPenjualan = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data penjualan (baris: menu, kolom: hari):");
        for (int i = 0; i < dataPenjualan.length; i++) {
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                dataPenjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanSemuaData() {
        System.out.println("Data Penjualan:");
        System.out.print("\t");
        for (int i = 1; i <= dataPenjualan[0].length; i++) {
            System.out.print("Hari ke " + i + "\t");
        }
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTerlaris() {
        int maxPenjualan = 0, indexMenu = 0;
        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                indexMenu = i;
            }
        }
        System.out.println("Menu terlaris: " + menu[indexMenu] + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        System.out.println("Rata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / dataPenjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        tampilkanSemuaData();
        menuTerlaris();
        rataRataPenjualan();
    }
}