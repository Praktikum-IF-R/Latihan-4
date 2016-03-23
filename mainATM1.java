/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class mainATM1 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ATM x = new ATM(1234, 2000000);
        int menu;
        System.out.println("Selamat Datang di ATM Mandiri");
        System.out.println("Masukkan password anda  : ");
        int pw = a.nextInt();

        if (pw == x.getPassword()) {
            do {
                System.out.println("======ATM======");
                System.out.println("1. Tarik uang");
                System.out.println("2. Cek Saldo");
                System.out.println("3. Transfer");
                System.out.println("4. Keluar");
                System.out.println("===============");

                System.out.println("Menu :");
                menu = a.nextInt();
                System.out.println("");
                switch (menu) {
                    case 1:
                        System.out.println("Masukkan jumlah uang yang akan diambil" + "\n" + "Rp");
                        int uang = a.nextInt();
                        System.out.println("saldo anda adalah");
                        int total = x.getSaldo() - uang;
                        System.out.println("Rp" + total);
                        break;
                    case 2:
                        System.out.println("Sisa Saldo anda saat ini adala" + "\n" + "Rp" + x.getSaldo());
                        break;
                    case 3:
                        System.out.print("masukkan jumlah uang yang akan anda transfer" + "\n" + "Rp");
                        int transfer = a.nextInt();
                        System.out.print("no rekening yang akan anda transfer" );
                        int norek = a.nextInt();
                        System.out.println("1. Ke sesama bank");
                        System.out.println("2. Ke bank lain");
                        System.out.println("masukkan pilihan anda :");
                        int bank = a.nextInt();
                        if (bank == 1) {
                            System.out.println("saldo anda saat ini");
                            int tot = x.getSaldo() - transfer;
                            System.out.println("Rp " + tot);
                            if (transfer >= 250000) {
                                x.Point();
                                System.out.println("Point anda saat ini : " + x.getPoint());
                            }
                            break;
                        }
                }
            } while (menu <= 3);
        } else {
            System.out.println("password yang anda masukkan salah!!");
        }
    }
}
