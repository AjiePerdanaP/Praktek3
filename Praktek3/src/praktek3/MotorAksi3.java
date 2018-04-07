package praktek3;

public class MotorAksi3 {
    public static void main(String[] args) {
        Motor3 m = new Motor3();
        m.setMerk("Baja");
        m.setWarna("hitam");
        m.setHarga(200.0);
        // Gak Bisa m.setJenismotor();
        
        m.mengisiBensin();
        
        System.out.print("merk \t: ");
        System.out.println(m.getMerk());
        System.out.print("warna \t: ");
        System.out.println(m.getWarna());
        System.out.print("harga \t: ");
        System.out.println(m.getHarga());
        
        MotorListrik ml = new MotorListrik();
        ml.setMerk("Katon");
        ml.setWarna("Biru");
        ml.setHarga(2000.0);
        ml.setJenismotor("Matic");
        ml.mengisiBensin();
        System.out.println("Jenis \t :"+ml.getJenismotor());
        ml.throttle();
    }
}
