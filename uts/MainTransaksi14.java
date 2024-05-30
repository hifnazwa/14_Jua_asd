import java.util.Scanner;

public class MainTransaksi14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        Rekening14 listRek = new Rekening14();

        Rekening14 listRek1 = new Rekening14 ("16030927 3084","Wallace","Chase Castro","1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu");
        Rekening14 listRek2 = new Rekening14("16100617 0573","Darius","Julian Daniel","1-357-843-0547","nec@lectusjusto.org");
        Rekening14 listRek3 = new Rekening14("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org");
        Rekening14 listRek4 = new Rekening14("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca");
        Rekening14 listRek5 = new Rekening14("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening14 listRek6 = new Rekening14("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca");
        Rekening14 listRek7 = new Rekening14("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca");
        Rekening14 listRek8 = new Rekening14("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com");
        Rekening14 listRek9 = new Rekening14("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca");
        Rekening14 listRek10 = new Rekening14("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net");
        Rekening14 listRek11 = new Rekening14("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu");
        Rekening14 listRek12 = new Rekening14("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk");
        Rekening14 listRek13 = new Rekening14("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net");
        Rekening14 listRek14 = new Rekening14("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening14 listRek15 = new Rekening14("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk");
        Rekening14 listRek16 = new Rekening14("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca");
        Rekening14 listRek17 = new Rekening14("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net");
        Rekening14 listRek18 = new Rekening14("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com");
        Rekening14 listRek19 = new Rekening14("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com");


        Transaksi14 listTrans = new Transaksi14();

        Transaksi14 litsTrans1 = new Transaksi14(898214,494048,3587,"2021-03-09", "07:54:42");
        Transaksi14 litsTrans2 = new Transaksi14(205420, 200162, 775880, "2021-06-25", "10:23:00");
        Transaksi14 litsTrans3 = new Transaksi14(838632, 350929, 328316, "2021-09-18", "23:00:04");
        Transaksi14 litsTrans4 = new Transaksi14(230659, 204434, 690503, "2022-02-02", "19:10:34");
        Transaksi14 litsTrans5 = new Transaksi14(770592, 334245, 444267, "2020-08-11", "13:36:56");
        Transaksi14 litsTrans6 = new Transaksi14(685302, 451002, 376442, "2020-05-23", "07:34:53");
        Transaksi14 litsTrans7 = new Transaksi14(816129, 851403, 597842, "2021-07-18", "19:41:20");
        Transaksi14 litsTrans8 = new Transaksi14(989609, 333823, 802752, "2022-02-01", "01:13:11");
        Transaksi14 litsTrans9 = new Transaksi14(297103, 396116, 779589, "2021-07-03", "01:09:49");
        Transaksi14 litsTrans10 = new Transaksi14(66190, 259150, 619774, "2021-09-09", "03:57:30");
        Transaksi14 litsTrans11 = new Transaksi14(234301, 278309, 547922, "2021-08-24", "13:18:39");
        Transaksi14 litsTrans12 = new Transaksi14(243306, 869468, 50283, "2021-03-12", "03:40:16");
        Transaksi14 litsTrans13 = new Transaksi14(371045, 991242, 602034, "2021-08-06", "11:48:59");
        Transaksi14 litsTrans14 = new Transaksi14(395170, 97058, 472273, "2021-05-02", "10:53:31");
        Transaksi14 litsTrans15 = new Transaksi14(862731, 561908, 109431, "2021-07-31", "08:11:00");
        Transaksi14 litsTrans16 = new Transaksi14(556798, 31387, 725426, "2021-03-27", "06:18:20");
        Transaksi14 litsTrans17 = new Transaksi14(873982, 896213, 846142, "2021-07-18", "04:06:30");
        Transaksi14 litsTrans18 = new Transaksi14(774247, 739406, 775848, "2020-10-24", "01:39:00");
        Transaksi14 litsTrans19 = new Transaksi14(66987, 823014, 868772, "2020-12-21", "05:57:59");

        System.out.println("==============UTS=============");
        System.out.println("\nPilih Menu yang di inginkan: ");
        System.out.println("1. Tampil data rekening");
        System.out.println("2. Tampil data transaksi");
        System.out.println("3. Mencari saldo > 500000");
        System.out.println("4. Sorting by name");
        System.out.println("5. keluar");
        System.out.print("Masukkan pilihan anda: ");
        int input = sc14.nextInt();

        switch (input) {
            case 1:
               listRek.tampilRekening();
                break;
            case 2:
                listTrans.tampilTrans14();
                break;
           
            default:
                    System.out.println("Pilihan anda salah harap ulangi lagi");
            }

    }
}
