public class PengunjungCafe27 {
    public static void daftarPengunjung (String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjungn: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }

}
