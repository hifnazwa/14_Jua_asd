/**
 * Rekening14
 */
public class Rekening14 {

    String noRekening, nama, namaIbu, email, phone;

    public Rekening14() {
        //TODO Auto-generated constructor stub
    }

    public Rekening14 (String a, String b, String c, String d, String e) {
        noRekening = a;
        nama = b;
        namaIbu = c;
        email = d;
        phone = e;
    }

    Rekening14 listRek[] = new Rekening14[19];
    int idx;
    public int saldoAkhir;

    void tambahRek14 (Rekening14 Rek) {
        if (idx < listRek.length) {
            listRek[idx] = Rek;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilRekening() {
        System.out.println("No Rekening \t" + "Nama \t" + "Nama Ibu \t" + "Phone \t" + "Email \t" + "Saldo Akhir");
        for (Rekening14 Rek : listRek) {
            if (Rek != null) {
                System.out.println(Rek.noRekening  + "\t" + Rek.nama + "\t" + Rek.namaIbu + "\t" + Rek.phone + "\t" + Rek.email + "\t" + Rek.saldoAkhir);
            }
        }
    }

}
