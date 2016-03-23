package mesinatm;

import java.util.Scanner;

public class MesinATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        atm x = new atm(121212, 10000000, 0);
        int pilihan;

        System.out.println("Selamat Datang di ATM MANDIRI");
        System.out.print("Silahkan Masukkan Password Anda : ");
        int pass = in.nextInt();

        if (pass == x.getPass()) {
            do {
                System.out.println("====================");
                System.out.println("    ATM MANDIRI");
                System.out.println("====================");
                System.out.println("Pilihan : ");
                System.out.println("1. Tarik Tunai");
                System.out.println("2. Cek Saldo");
                System.out.println("3. Transfer");
                System.out.println("4. Keluar");
                System.out.println("====================");
                System.out.print("Masukkan Pilihan Anda : ");
                pilihan = in.nextInt();
                System.out.println();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Tunai Uang yang Akan Diambil : " + "\n" + "Rp. ");
                        int tunai = in.nextInt();
                        System.out.println("Saldo Terakhir Anda");
                        int saldo = x.getSaldo() - tunai;
                        System.out.println("Rp. " + saldo);
                        break;
                    case 2:
                        System.out.println("Saldo Anda Sekarang");
                        System.out.println("Rp. " + x.getSaldo());
                        break;
                    case 3:
                        System.out.println("1. Transfer ke sesama Bank Mandiri");
                        System.out.println("2. Transfer ke Bank lain");
                        System.out.print("Masukkan pilihan Anda : ");
                        int trans = in.nextInt();
                        if (trans == 1) {
                            System.out.print("Masukkan Tunai Uang yang Akan Ditransfer : " + "\n" + "Rp. ");
                            int transfer = in.nextInt();
                            System.out.println("Masukkan Nomor Rekening Penerima Transfer");
                            int penerima = in.nextInt();
                            System.out.println("Saldo Terakhir Anda");
                            int total = x.getSaldo() - transfer;
                            System.out.println("Rp. " + total);
                            if (transfer >= 250000) {
                                x.setPoin();
                                System.out.println("Poin Anda saat ini : " + x.getPoin());
                            }
                        } else if (trans == 2) {
                            System.out.print("Masukkan Tunai Uang yang Akan Ditransfer : " + "\n" + "Rp. ");
                            int transfer = in.nextInt();
                            System.out.println("Masukkan Nomor Rekening Penerima Transfer");
                            int penerima = in.nextInt();
                            System.out.println("Saldo Terakhir Anda");
                            int total = x.getSaldo() - transfer;
                            System.out.println("Rp. " + total);
                        }
                        break;
                }
            } while (pilihan <= 3);
        } else {
            System.out.println("Maaf, Password yang Anda Masukkan Salah");
        }
    }
}
