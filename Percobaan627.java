import java.util.Scanner;

public class Percobaan627 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukan panjang: ");
        p=input.nextInt();
        System.out.print("Masukan lebar: ");
        l=input.nextInt();
        System.out.print("Masukan tinggi: ");
        t=input.nextInt();

        L=hutangLuas(p, l);
        System.out.println("Luas persegi panjang adalah: " + L);
        vol= hitungVolume(t, p, L);
        System.out.println("Volume balok adalah " + vol);
        
    }
    public static int hutangLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    public static int hitungVolume (int tinggi, int a, int b) {
        int Volume= hutangLuas(a, b) *tinggi;
        return Volume;
    }

}
    

