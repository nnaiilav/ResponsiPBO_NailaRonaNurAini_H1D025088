package RESPONSI;

public abstract class Kendaraan {

    public static final int HARGA_DEFAULT = 100000;

    private final String plat;

    private String merek;
    private int hargaPerHari;
    private boolean disewa;
    private int pendapatan;

    public Kendaraan(String plat, String merek) {
        this(plat, merek, HARGA_DEFAULT);
    }

    public Kendaraan(String plat, String merek, int hargaPerHari) {
        this.plat = plat;
        this.merek = merek;
        this.hargaPerHari = hargaPerHari;
        this.disewa = false;
        this.pendapatan = 0;
    }

    public String getPlat() { return plat; }

    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public int getHargaPerHari() { return hargaPerHari; }
    public void setHargaPerHari(int hargaPerHari) { this.hargaPerHari = hargaPerHari; }

    public boolean isDisewa() { return disewa; }
    public void setDisewa(boolean disewa) { this.disewa = disewa; }

    public int getPendapatan() { return pendapatan; }
    public void setPendapatan(int pendapatan) { this.pendapatan = pendapatan; }

    public void info() {
        String status = disewa ? "DISEWA" : "TERSEDIA";
        System.out.println(merek + " (" + plat + ") | Rp" + hargaPerHari
                + "/hari | " + status + " | pendapatan: Rp" + pendapatan);
    }

    public int hitungBiaya(int hari) {
        return hargaPerHari * hari;
    }

    public abstract void sewa(int hari);
}