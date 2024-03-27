public class MainHotel12 {
     public static void main(String[] args) {
        HotelService12 list = new HotelService12();
        Hotel12 m1 = new Hotel12("RedDors", "Malang", 25000, (byte)5);
        Hotel12 m5 = new Hotel12("WhiteDors", "Batu", 26000, (byte)3);
        Hotel12 m2 = new Hotel12("BlakDors", "Surabaya", 19000, (byte)4);
        Hotel12 m3 = new Hotel12("BlueDors", "Kediri", 20000, (byte)1);
        Hotel12 m4 = new Hotel12("GreyDors", "Malang", 22000, (byte)2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel = ");
        list.tampilAll();

        System.out.println("Data hotel dengan filter harga termurah = ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel dengan filter bintang tertinggi");
        list.selectionSort();
        list. tampilAll();

    }
}