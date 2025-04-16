
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceTransaksi service = new ServiceTransaksi(6); 
        
        Bank b1 = new Bank("160309927 3084", "Wallace", "Mei Mei", "0824582643263", "eallace@gmail.com");
        Bank b2 = new Bank("16100617 0573", "Darius", "Susanti", "0813578430547", "darius@pt.org");
        Bank b3 = new Bank("16240401 2243", "Fuller", "Rosalina", "0855567127062", "fuller@mail.com");
        Bank b4 = new Bank("16270525 0112", "Maria", "Krabela", "0823672230234", "maria@gmail.com");
        Bank b5 = new Bank("16101617 2416", "Gery", "Fatimah", "0836834168323", "gery@gery.com");

        service.tambah(new Transaksi("Tr005", 500000.0, 200000.0, 700000.0, "2025-04-2024", "debit", b1));
        service.tambah(new Transaksi("Tr004", 500000.0, 150000.0, 650000.0, "2025-04-2024", "kredit", b2));
        service.tambah(new Transaksi("Tr003", 500000.0, 300000.0, 200000.0, "2025-04-2024", "kredit", b3));
        service.tambah(new Transaksi("Tr002", 500000.0, 100000.0, 600000.0, "2025-04-2024", "kredit", b4));
        service.tambah(new Transaksi("Tr001", 500000.0, 100000.0, 400000.0, "2025-04-2024", "kredit", b5));
        

        int pilih;
        do {
            System.out.println("==============POLINEMA BANK==============");
            System.out.println("\nMenu:");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data");
            System.out.println("4. Display min Saldo");
            System.out.println("5. Sort Data");
            System.out.println("6. Exit");
            System.out.print("Chose Menu(1-6): ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    service.tampilDataNorek();
                    break;
                case 2:
                    service.tampilDataTransaksi();
                    break;
                case 3:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    service.searchByNama(nama);
                    break;
                case 4:
                    service.findMinInOutSaldo();
                    break;
                case 5:
                    service.sortByNoRekeningAsc();
                    service.tampilDataTransaksi();;
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 6);

        sc.close();
    }
}
