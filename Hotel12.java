public class Hotel12 {
    String nama;
    String kota;
    int harga;
    byte bintang;

    Hotel12(String n, String k, int h, byte b){
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;
    }

    void TampilAll(){
        System.out.println("Nama = " + nama);
        System.out.println("Kota = " + kota);
        System.out.println("Harga = " + harga);
        System.out.println("Bintang = " + bintang);
    }
    
}