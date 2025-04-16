public class ServiceTransaksi {
    Transaksi[] trs;
    int idx;

    public ServiceTransaksi(int kapasitas) {
        trs = new Transaksi[kapasitas];
        idx = 0;
    }

    public void tambah(Transaksi t) {
        if (idx < trs.length) {
            trs[idx++] = t;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampilDataTransaksi() {
        for (int i = 0; i < idx; i++) {
            trs[i].tampilDataTransaksi();
        }
    }

    public void tampilDataNorek() {
        for (int i = 0; i < idx; i++) {
            trs[i].bankAcc.tampilDataNorek();
        }
    }

  
    public void searchByNama(String nama) {
        System.out.println("Nama :" + nama);
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (trs[i].bankAcc.nama.equalsIgnoreCase(nama)) {
                trs[i].tampilDataTransaksi();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan!");
        }
    }

   
    public void findMinInOutSaldo() {
        if (idx == 0) {
            System.out.println("Data kosong");
            return;
        }
        Transaksi min = trs[0];
        for (int i = 1; i < idx; i++) {
            if (trs[i].inOutSaldo < min.inOutSaldo) {
                min = trs[i];
            }
        }
        System.out.println("Transaksi dengan debit/kredit terkecil:");
        min.tampilDataTransaksi();
    }

    
    public void sortByNoRekeningAsc() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (trs[j].bankAcc.noRekening.compareTo(trs[j + 1].bankAcc.noRekening) > 0) {
                    Transaksi temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
                }
            }
        }
        System.out.println("Menampilkan Saldo Terendah: ");
    }

    void hitungFinalSaldo() {
        for (int i = 0; i < idx; i++) {
            if (trs[i].tipe.equalsIgnoreCase("Kredit")) {
                trs[i].finalSaldo = trs[i].saldo + trs[i].inOutSaldo;
            } else if (trs[i].tipe.equalsIgnoreCase("Debit")) {
                trs[i].finalSaldo = trs[i].saldo - trs[i].inOutSaldo;
            }
        }
    }
}