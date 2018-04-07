
package praktek3;


public class Motor3 {
       private String merk;
       private String warna;
       private Double harga;
       
       void mengisiBensin(){
            System.out.println("Merk \t: "+merk+"\n"+
                "warna \t: "+warna+"\n"+
                "harga \t: "+harga);
    
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
       
}
