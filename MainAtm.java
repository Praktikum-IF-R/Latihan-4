/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesinAtm;

/**
 *
 * @author nuel
 */
import java.util.Scanner;

public class MainAtm {

    public static void main(String[] args) {
        Scanner nuel = new Scanner(System.in);
        int pilihan;
        int pin;
        String chose;
        Atm atm = new Atm(112233);
        atm.tampilkanJudul();

        do {
            System.out.print("Masukkan Pin ATM Anda : ");
            pin = nuel.nextInt();
            if (pin != atm.getPin()) {
                System.out.println("Password salah masukkan Kembali");
            }
        } while (pin != atm.getPin());

        System.out.println("");

        do {
            atm.tampilkanLogin();
            System.out.print("Masukkan Pilihan Menu Anda: ");
            pilihan = nuel.nextInt();
            switch (pilihan) {
                case 1:
                    atm.ambilSaldo();
                    int menu;
                    System.out.print("Masukkan pilihan anda : ");
                    menu = nuel.nextInt();
                    switch (menu) {
                        case 1:
                            atm.saldoAwal -= 100000;
                            atm.ambilSaldo = 100000;
                            if (atm.saldoAwal < atm.ambilSaldo) {
                                System.out.println("Saldo tidak cukup");
                                System.out.println("Sisa Saldo : Rp. " + atm.saldoAwal + ",-");
                                break;
                            }
                            System.out.println("Anda Menarik uang sebesar : Rp." + atm.ambilSaldo + ",-");
                            System.out.println("Sisa Saldo Saat ini : Rp." + (atm.saldoAwal));
                            System.out.println("");
                            break;
                        case 2:
                            atm.saldoAwal -= 200000;
                            atm.ambilSaldo = 200000;
                            if (atm.saldoAwal < atm.ambilSaldo) {
                                System.out.println("Saldo tidak cukup");
                                System.out.println("Sisa Saldo : Rp. " + (atm.saldoAwal) + ",-");
                                System.out.println("");
                                break;
                            }
                            System.out.println("Anda Menarik uang sebesar : Rp." + atm.ambilSaldo + ",-");
                            System.out.println("Sisa Saldo Saat ini : Rp." + (atm.saldoAwal));
                            System.out.println("");
                            break;
                        case 3:
                            atm.saldoAwal -= 300000;

                            atm.ambilSaldo = 300000;
                            if (atm.saldoAwal < atm.ambilSaldo) {
                                System.out.println("Saldo tidak cukup");
                                System.out.println("Sisa Saldo : Rp. " + atm.saldoAwal + ",-");
                                System.out.println("");
                                break;
                            }
                            System.out.println("Anda Menarik uang sebesar : Rp." + atm.ambilSaldo + ",-");
                            System.out.println("Sisa Saldo Saat ini : Rp." + (atm.saldoAwal));
                            System.out.println("");
                            break;
                        default:
                            System.out.println("");
                            System.out.println("Pilihan anda tidak terdapat dalam menu !");
                            System.out.println("");
                            break;
                    }

                    break;
                case 2:
                    atm.cekSaldo();
                    break;
                case 3:
                    System.out.println("====Transfer Bank Lokal====");
                    System.out.print("Pilihan anda :");
                    System.out.println("Transfer Bank Lokal");
                    System.out.print("Masukkan Nomor Rekening : ");
                    int no = nuel.nextInt();
                    atm.setNorek(no);

                    System.out.print("Jumlah Saldo yang ingin di Transfer : ");
                    int jlhTransfer = nuel.nextInt();
                    atm.transferSaldo(jlhTransfer);
                    if (jlhTransfer >= 250000) {

                        atm.setPoin();
                    }
                    System.out.println("Anda akan mentransfer Saldo Sebesar : Rp." + jlhTransfer + ",- ? :");
                    System.out.print("Pilihan Anda : (Y/N)");
                    String quest = nuel.next();
                    if (quest.equalsIgnoreCase("Y")) {
                        atm.saldoAwal -= jlhTransfer;
                        System.out.println("Transfer Berhasil");
                        System.out.println("Sisa saldo saat ini : Rp." + (atm.saldoAwal) + ",-");
                        System.out.println("");

                    } else {
                        System.out.println("Transfer dibatalkan");
                        System.out.println("");
                    }

                    break;
                case 4:

                    System.out.println("Jumlah Point : " + atm.getPoin());
                    break;
                case 5:
                    System.exit(0);
            }
        } while (pilihan != 5);

    }

}
