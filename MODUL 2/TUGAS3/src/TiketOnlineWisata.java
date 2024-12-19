import java.util.Scanner;

public class TiketOnlineWisata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data pengunjung
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan hari: ");
        String hari = scanner.nextLine();
        System.out.print("Masukkan tanggal: ");
        String tanggal = scanner.nextLine();

        // Validasi data input
        if (nama.isEmpty() || hari.isEmpty() || tanggal.isEmpty()) {
            System.out.println("Data harus diisi!");
            return;
        }

        // Hitung harga tiket berdasarkan jenis dan hari
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. Reguler");
        System.out.println("2. Terusan");
        int pilihanTiket = scanner.nextInt();

        int hargaDewasa, hargaAnak;
        double faktorHarga = 1.0; // Faktor harga untuk hari Sabtu dan Minggu
        if (pilihanTiket == 1) {
            hargaDewasa = 75000;
            hargaAnak = 60000;
        } else if (pilihanTiket == 2) {
            hargaDewasa = 100000;
            hargaAnak = 85000;
        } else {
            System.out.println("Pilihan tiket tidak valid!");
            return;
        }

        if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
            faktorHarga = 1.2;
        }

        // Input jumlah dewasa dan anak
        System.out.print("Jumlah dewasa: ");
        int jumlahDewasa = scanner.nextInt();
        System.out.print("Jumlah anak: ");
        int jumlahAnak = scanner.nextInt();

        // Hitung total harga
        int totalHarga = (int) ((jumlahDewasa * hargaDewasa + jumlahAnak * hargaAnak) * faktorHarga);

        // Tampilkan hasil
        System.out.println("\nRincian Pembelian:");
        System.out.println("Nama: " + nama);
        System.out.println("Hari: " + hari);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jenis Tiket: " + (pilihanTiket == 1 ? "Reguler" : "Terusan"));
        System.out.println("Jumlah Dewasa: " + jumlahDewasa);
        System.out.println("Jumlah Anak: " + jumlahAnak);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}