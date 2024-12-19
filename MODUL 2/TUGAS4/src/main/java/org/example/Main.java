package org.example;

import java.util.Scanner;

class MaxFinder {

    // Fungsi untuk menemukan nilai maksimum dari tiga bilangan
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // Fungsi untuk menguji skenario-skenario yang diberikan
    public static void runTests() {
        // Pengujian angka 3 dari nilai a, b, dan c yang bernilai 1, 2, dan 3
        System.out.println("Test 1: findMax(1, 2, 3)");
        int result1 = findMax(1, 2, 3);
        if (result1 == 3) {
            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed: Expected 3, got " + result1);
        }

        // Pengujian angka -1 dari nilai a, b, dan c yang bernilai -1, -2, dan -3
        System.out.println("Test 2: findMax(-1, -2, -3)");
        int result2 = findMax(-1, -2, -3);
        if (result2 == -1) {
            System.out.println("Test 2 Passed");
        } else {
            System.out.println("Test 2 Failed: Expected -1, got " + result2);
        }

        // Pengujian angka 1 dari nilai a, b, dan c yang bernilai 0, 0, dan 1
        System.out.println("Test 3: findMax(0, 0, 1)");
        int result3 = findMax(0, 0, 1);
        if (result3 == 1) {
            System.out.println("Test 3 Passed");
        } else {
            System.out.println("Test 3 Failed: Expected 1, got " + result3);
        }

        // Tambahkan pengujian lain jika perlu
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println("Masukkan tiga bilangan bulat:");
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();

        // Menampilkan hasil findMax
        int max = findMax(a, b, c);
        System.out.println("Nilai maksimum dari " + a + ", " + b + ", " + c + " adalah: " + max);

        // Menjalankan pengujian otomatis
        System.out.println("\nMenjalankan pengujian otomatis:");
        runTests();

        scanner.close();
    }
}