package RESPONSI;

public class Main {
    public static void main(String[] args) {

        Mobil avanza = new Mobil("R 1234 AB", "Avanza");
        avanza.info();
        avanza.sewa(3);
        System.out.println("Biaya 5 hari: Rp" + avanza.hitungBiaya(5));

        System.out.println();
        System.out.println("HARGA_DEFAULT = Rp" + Kendaraan.HARGA_DEFAULT);
        System.out.println("Plat = " + avanza.getPlat());

        System.out.println();
        Motor beat = new Motor("R 5678 CD", "Beat");
        Mobil innova = new Mobil("R 9999 EF", "Innova", 350000);
        System.out.println("Harga Beat   : Rp" + beat.getHargaPerHari());
        System.out.println("Harga Innova : Rp" + innova.getHargaPerHari());
        innova.setMerek("Innova Reborn");
        System.out.println("Merek Innova : " + innova.getMerek());

        System.out.println();
        beat.info();
        innova.info();

        System.out.println();
        Kendaraan k1 = innova;
        Kendaraan k2 = beat;
        System.out.println("Mobil sewa 7 hari: Rp" + k1.hitungBiaya(7));
        System.out.println("Motor sewa 7 hari: Rp" + k2.hitungBiaya(7));

        System.out.println();

        beat.sewa(2);
        beat.sewa(1);
        beat.info();

        System.out.println();
        BisaDikembalikan b1 = avanza;
        BisaDikembalikan b2 = beat;
        b1.kembalikan();
        b2.kembalikan();
        b2.kembalikan();

        System.out.println();
        Mobil xpander = new Mobil("R 3333 KL", "Xpander", 200000);
        BisaDiasuransi asuransi = xpander;
        BisaDikembalikan pengembalian = xpander;
        asuransi.pasangAsuransi();
        xpander.sewa(2);
        pengembalian.kembalikan();
        xpander.info();
    }
}