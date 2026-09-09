public class Motor extends KendaraanRodaDua {
    private int kapasitasMesin;
    private String jenisBahanBakar;

    public Motor(String merek, String warna, int kapasitasMesin, String jenisBahanBakar) {
        super(merek, warna);
        this.kapasitasMesin = kapasitasMesin;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin motor " + merek + " dinyalakan. Vroom!");
    }

    public void klakson() {
        System.out.println("Motor membunyikan klakson: Bip Bip!");
    }

    // Ubah nama method, misalnya jadi cetakInformasiMotor()
    public void cetakInformasiMotor() {
        System.out.println("--- Informasi Motor ---");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
        System.out.println("Bahan Bakar: " + jenisBahanBakar);
    }
}