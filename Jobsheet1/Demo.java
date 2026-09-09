public class Demo {
    public static void main(String[] args) {
        SepedaPancal sepeda = new SepedaPancal("Polygon", "Biru", 21, "Cakram");
        Motor motor = new Motor("Honda", "Hitam", 150, "Pertamax");
        Laptop laptop = new Laptop("Intel Core i7", 16);
        Cermin cermin = new Cermin("Lingkaran", "Sedang");

        // Memanggil method khusus masing-masing tanpa Override
        sepeda.cetakInformasiSepeda();
        sepeda.kayuh();
        sepeda.gantiGear(3);
        sepeda.berhenti();
        System.out.println();

        motor.cetakInformasiMotor();
        motor.nyalakanMesin();
        motor.klakson();
        motor.maju();
        System.out.println();

        laptop.cetakInformasi();
        laptop.nyalakan();
        laptop.bukaAplikasi("VS Code");
        System.out.println();

        cermin.cetakInformasi();
        cermin.pantulkanBayangan();
        cermin.bersihkan();
    }
}