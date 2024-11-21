public class PertanyaanNo3_Percobaan4 {

    public static void dftarPengunjung (String [] nmaPengunjung, int... jumlhPesanan) {
        if (nmaPengunjung.length != jumlhPesanan.length) {
            System.out.println("Jumlah nama dan pesanan tidak sesuai");
            return;
        }
        System.out.println("Daftar pengunjung dan Pesanan");

        for (int i=0; i<nmaPengunjung.length; i++) {
            System.out.println(nmaPengunjung[i] + " memesan " + jumlhPesanan[i] + " item");
        }

    }public static void main(String[] args) {
        String [] nmaPengunjung = {"Ali", "Budi", "Citra"};
        dftarPengunjung(nmaPengunjung, 2,3,1);
    }
}