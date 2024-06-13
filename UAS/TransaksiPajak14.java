class TransaksiPajak14 {
    private long nominalBayar;
    private long denda;
    private int bulanBayar;
    private Kendaraan14 kendaraan;
    private TransaksiPajak14 prev;
    private TransaksiPajak14 next;

    // Constructor
    public TransaksiPajak14(long nominalBayar, long denda, int bulanBayar, Kendaraan14 kendaraan) {
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
        this.prev = null; 
        this.next = null; 
    }

    public long getNominalBayar() {
        return nominalBayar;
    }

    public long getDenda() {
        return denda;
    }

    public int getBulanBayar() {
        return bulanBayar;
    }

    public Kendaraan14 getKendaraan() {
        return kendaraan;
    }

    public TransaksiPajak14 getPrev() {
        return prev;
    }

    public void setPrev(TransaksiPajak14 prev) {
        this.prev = prev;
    }

    public TransaksiPajak14 getNext() {
        return next;
    }

    public void setNext(TransaksiPajak14 next) {
        this.next = next;
    }
}
