/**
 * PencarianMhs14
 */
public class PencarianMhs14 {

    Mahasiswa_14 listMhs[] = new Mahasiswa_14[5];
    int idx;

    void tambah(Mahasiswa_14 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for(Mahasiswa_14 m : listMhs) {
            if (m != null) { 
                m.tampil();
                System.out.println("=====================");
            }
        }
    }

    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi (int x, int pos) {
        if (pos!= -1 ) {
            System.out.println("Data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }

    public void TampilData (int x, int pos) {
        if (pos!= -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan ");
        }
    }

    public int FindBinarySearch (String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (listMhs[mid].nama.equalsIgnoreCase(cari)) {
                return mid;
            }

            if (listMhs[mid].nama.compareToIgnoreCase(cari) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            }

            return FindBinarySearch(cari, mid + 1, right);
        }

        return -1;
    }

    void sortDataByNama() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].nama.compareToIgnoreCase(listMhs[j + 1].nama) > 0) {
                    Mahasiswa_14 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }
}