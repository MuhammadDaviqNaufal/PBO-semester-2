public class KendaraanRodaDua {
    // Dua atribut
    protected String merek;
    protected String warna;

    // Konstruktor
    public KendaraanRodaDua(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    // Tiga method (termasuk cetakInformasi)
    public void maju() {
        System.out.println(merek + " bergerak maju.");
    }

    public void berhenti() {
        System.out.println(merek + " mengeram dan berhenti.");
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
    }
}