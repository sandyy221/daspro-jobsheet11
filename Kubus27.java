public class Kubus27 {
    private double sisi;
    public Kubus27 (double sisi) {
        this.sisi = sisi;
    }
    public double hitungVolume() {
        return Math.pow (sisi,3);
    }
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public static void main(String[] args) {
        Kubus27 kubus = new Kubus27(5);

        System.out.println("Sisi kubus: " + kubus.getSisi());
        System.out.println("Volume kubus: " + kubus.hitungVolume());
        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
    }

}

