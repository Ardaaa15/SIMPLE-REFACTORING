package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data penumpang
        System.out.print("Masukkan Nama Penumpang: ");
        String nm = scanner.nextLine();

        System.out.print("Masukkan Kota Asal: ");
        String asal = scanner.nextLine();

        System.out.print("Masukkan Kota Tujuan: ");
        String dst = scanner.nextLine();

        System.out.print("Masukkan Harga Tiket: ");
        double Tiket = scanner.nextDouble();

        System.out.print("Masukkan Diskon (dalam persen): ");
        double disk = scanner.nextDouble();

        // Membuat objek TiketPesawat
        TiketPesawat tiketPesawat = new TiketPesawat(nm, asal, dst, Tiket, disk);

        // Menampilkan informasi tiket
        System.out.println("\nInformasi Tiket:");
        tiketPesawat.t();

        scanner.close();
    }
}