public class SepedaPancal extends KendaraanRodaDua {
    private int jumlahGear;
    private String jenisRem;

    public SepedaPancal(String merek, String warna, int jumlahGear, String jenisRem) {
        super(merek, warna);
        this.jumlahGear = jumlahGear;
        this.jenisRem = jenisRem;
    }

    public void kayuh() {
        System.out.println("Sepeda " + merek + " sedang dikayuh.");
    }

    public void gantiGear(int gearBaru) {
        System.out.println("Gears diganti ke-" + gearBaru);
    }

    // Ubah nama method, misalnya jadi cetakInformasiSepeda()
    public void cetakInformasiSepeda() {
        System.out.println("--- Informasi Sepeda Pancal ---");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Gear: " + jumlahGear);
        System.out.println("Jenis Rem: " + jenisRem);
    }
}