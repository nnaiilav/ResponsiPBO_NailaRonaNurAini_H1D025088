
package RESPONSI;

public class Motor extends Kendaraan implements BisaDikembalikan {

    public Motor(String plat, String merek) {
        super(plat, merek, 60000);
    }

    public Motor(String plat, String merek, int hargaPerHari) {
        super(plat, merek, hargaPerHari);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("   Jenis: Motor");
    }

    @Override
    public void sewa(int hari) {
        if (isDisewa()) {
            System.out.println(getMerek() + " sedang disewa, tidak bisa disewa lagi.");
        } else {
            int biaya = hitungBiaya(hari);
            setDisewa(true);
            setPendapatan(getPendapatan() + biaya);
            System.out.println(getMerek() + " disewa " + hari + " hari. Biaya Rp" + biaya);
        }
    }

    @Override
    public void kembalikan() {
        if (isDisewa()) {
            setDisewa(false);
            System.out.println(getMerek() + " sudah dikembalikan.");
        } else {
            System.out.println(getMerek() + " tidak sedang disewa.");
        }
    }
}
