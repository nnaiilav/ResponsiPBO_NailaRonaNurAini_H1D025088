package RESPONSI;

public class Mobil extends Kendaraan implements BisaDikembalikan, BisaDiasuransi {

    private boolean asuransi;

    public Mobil(String plat, String merek) {
        super(plat, merek);
        this.asuransi = false;
    }

    public Mobil(String plat, String merek, int hargaPerHari) {
        super(plat, merek, hargaPerHari);
        this.asuransi = false;
    }

    public boolean isAsuransi() { return asuransi; }
    public void setAsuransi(boolean asuransi) { this.asuransi = asuransi; }

    @Override
    public void info() {
        super.info();
        System.out.println("   Jenis: Mobil | asuransi: " + (asuransi ? "ya" : "tidak"));
    }

    @Override
    public int hitungBiaya(int hari) {
        int normal = super.hitungBiaya(hari);
        if (hari >= 7) {
            return normal * 90 / 100;
        }
        return normal;
    }

    @Override
    public void sewa(int hari) {
        if (isDisewa()) {
            System.out.println(getMerek() + " sedang disewa, tidak bisa disewa lagi.");
        } else {
            int biaya = hitungBiaya(hari);
            if (asuransi) {
                biaya = biaya + 25000 * hari;
            }
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

    @Override
    public void pasangAsuransi() {
        asuransi = true;
        System.out.println("Asuransi dipasang untuk " + getMerek() + " (+Rp25000/hari).");
    }
}