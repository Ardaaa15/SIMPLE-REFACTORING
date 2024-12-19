package org.example;

import java.util.Scanner;

public class KasirSewaApartemenUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(KasirSewaApartemen.PROMPT_NAMA);
        String nama = input.nextLine();
        System.out.print("Masukkan Lama Sewa (dalam hari): ");
        int lama = input.nextInt();

        KasirSewaApartemen sewa = new KasirSewaApartemen(nama, lama);
        sewa.tampilkanDetail();
    }
}