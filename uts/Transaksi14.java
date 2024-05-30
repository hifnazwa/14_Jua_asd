public class Transaksi14 {
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;

    public Transaksi14(int i, int j, int k, String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public Transaksi14() {
        //TODO Auto-generated constructor stub
    }

    void Transaksi14(double a, double b, double c, String d, String e ) {
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }

    Transaksi14 listTrans14[] = new Transaksi14[19];
    int idx;

    void tambahTrans14 (Transaksi14 Trans) {
        if (idx < listTrans14.length) {
            listTrans14[idx] = Trans;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilTrans14() {
        System.out.println("Saldo \t" + "Saldo Awal \t" + "Saldo Akhir \t" + "Tanggal Transaksi");
        System.out.println(saldo+ "\t" + saldoAwal + "\t" + saldoAkhir + "\t" + tanggalTransaksi);
    }
}
