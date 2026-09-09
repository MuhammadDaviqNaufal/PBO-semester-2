public class Laptop {
    // Dua atribut
    private String prosesor;
    private int kapasitasRam; // dalam GB

    // Konstruktor
    public Laptop(String prosesor, int kapasitasRam) {
        this.prosesor = prosesor;
        this.kapasitasRam = kapasitasRam;
    }

    // Tiga method
    public void nyalakan() {
        System.out.println("Laptop booting dengan prosesor " + prosesor);
    }

    public void bukaAplikasi(String namaAplikasi) {
        System.out.println("Membuka aplikasi " + namaAplikasi + " di RAM " + kapasitasRam + "GB");
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Laptop ---");
        System.out.println("Prosesor: " + prosesor);
        System.out.println("Kapasitas RAM: " + kapasitasRam + " GB");
    }
}