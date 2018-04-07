package praktek3;

public class MotorAksi3 {
    public static void main(String[] args) {
        Motor3 m = new Motor3();
        m.setMerk("Baja");
        m.setWarna("hitam");
        m.setHarga(200.0);
        
        m.mengisiBensin();
        
        System.out.print("merk \t: ");
        System.out.println(m.getMerk());
        System.out.print("warna \t: ");
        System.out.println(m.getWarna());
        System.out.print("harga \t: ");
        System.out.println(m.getHarga());
    }
}
