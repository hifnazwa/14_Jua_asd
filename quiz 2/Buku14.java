public class Buku14 {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku14() {
    }

    public Buku14(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return String.format("Judul: %s\nPengarang: %s\nTahun Terbit: %d\n", judul, pengarang, tahunTerbit);
    }
}
