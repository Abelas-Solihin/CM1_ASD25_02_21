public class Transaksi {
    String kodeTransaksi, tanggalTransaksi, tipe;
    double saldo, inOutSaldo, finalSaldo;
    Bank bankAcc = new Bank();

    public Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo,
        String tanggalTransaksi, String tipe, Bank bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.tipe = tipe;
        this.bankAcc = bankAcc;
        
    }
    
    public void tampilDataTransaksi() {
        System.out.printf("%-10s %-15s %-10s %-5s%n",kodeTransaksi, bankAcc.noRekening, 
        bankAcc.nama, saldo, inOutSaldo, finalSaldo, tanggalTransaksi,tipe);
        // System.out.println("Kode Transaksi: " + kodeTransaksi);
        // System.out.println("No Rekening: " + bankAcc.noRekening);
        // System.out.println("Saldo: " + saldo);
        // System.out.println("Debit/Kredit: " + inOutSaldo);
        // System.out.println("Final Saldo: " + finalSaldo);
        // System.out.println("Tanggal: " + tanggalTransaksi);
        // System.out.println("Type: " + tipe);
    }

}