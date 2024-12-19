package org.example;

public class KasirSewaApartemen {
    public static final String PROMPT_NAMA = "Masukkan Nama Penyewa: ";
    private String namaPenyewa;
    private int lamaSewa;
    private static final double HARGA_HARIAN = 250000;

    // Constructor yang menginisialisasi nama penyewa dan lama sewa
    public KasirSewaApartemen(String namaPenyewa, int lamaSewa) {
        ambilInputDariPengguna(namaPenyewa, lamaSewa);
    }

    private void ambilInputDariPengguna(String namaPenyewa, int lamaSewa) {
        this.setNamaPenyewa(namaPenyewa);
        this.setLamaSewa(lamaSewa);
    }

    // Metode untuk menghitung total harga berdasarkan lama sewa
    public double hitungTotalHarga() {
        return getLamaSewa() * HARGA_HARIAN;
    }

    // Metode untuk menampilkan detail sewa
    public void tampilkanDetail() {
        System.out.println("Nama Penyewa: " + getNamaPenyewa());
        System.out.println("Lama Sewa: " + getLamaSewa() + " hari");
        System.out.printf("Total Harga: Rp %.2f%n", hitungTotalHarga());
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
}



