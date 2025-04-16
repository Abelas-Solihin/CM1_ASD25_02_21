public class Bank {
    String noRekening, nama, namaIbu, noHp, email;

    public Bank() {
    }

    public Bank(String noRekening, String nama, String namaIbu, String noHp, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    public void tampilDataNorek() {
        System.out.printf("%-15s %-10s %-10s %-17s %-20s\n",  noRekening, nama, namaIbu, noHp, email);
        // System.out.println("No Rekening: " + noRekening);
        // System.out.println("Nama: " + nama);
        // System.out.println("Nama Ibu: " + namaIbu);
        // System.out.println("No HP: " + noHp);
        // System.out.println("Email: " + email);
    }

}