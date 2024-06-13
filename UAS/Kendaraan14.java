public class Kendaraan14 {
    private String noTNKB;
    private String nama;
    private String jenis;
    private int cc;
    private int tahun;
    private int bulanHarusBayar;
    private TransaksiPajak14 transaksiPajak; 

    public Kendaraan14(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
        this.transaksiPajak = null; 
    }

    public void setTransaksiPajak(TransaksiPajak14 transaksiPajak) {
        this.transaksiPajak = transaksiPajak;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getCc() {
        return cc;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }

    public TransaksiPajak14 getTransaksiPajak() {
        return transaksiPajak;
    }
}
