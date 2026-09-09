public class Cermin {
    // Dua atribut
    private String bentuk;
    private String ukuran;

    // Konstruktor
    public Cermin(String bentuk, String ukuran) {
        this.bentuk = bentuk;
        this.ukuran = ukuran;
    }

    // Tiga method
    public void pantulkanBayangan() {
        System.out.println("Cermin berbentuk " + bentuk + " memantulkan bayangan dengan jelas.");
    }

    public void bersihkan() {
        System.out.println("Cermin berukuran " + ukuran + " sedang dibersihkan.");
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Cermin ---");
        System.out.println("Bentuk: " + bentuk);
        System.out.println("Ukuran: " + ukuran);
    }
}