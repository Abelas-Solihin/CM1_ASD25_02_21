public class Transaksi {
    String kodeTransaksi, tanggalTransaksi, type;
    double saldo, inOutSaldo, finalSaldo;
    Bank bankAcc;

    public Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo,
        String tanggalTransaksi, String type, Bank bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }

    public void tampilDataTransaksi() {
        System.out.println("Kode Transaksi: " + kodeTransaksi);
        System.out.println("Tanggal: " + tanggalTransaksi);
        System.out.println("Type " + type);
        System.out.println("Saldo: " + saldo);
        System.out.println("Debit/Kredit: " + inOutSaldo);
        System.out.println("Final Saldo: " + finalSaldo);
        bankAcc.tampilDataNorek();
        System.out.println("-----------------------------");
    }
}