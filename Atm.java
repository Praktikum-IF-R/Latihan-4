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

public class Atm {

    private int pin = 0;
    int saldoAwal = 1000000;
    int ambilSaldo;
    public int point = 0;
    public int noRek = 123123;
    public int transferSaldo;

    public Atm(int pin) {
        this.pin = pin;
    }

    public int setPin(int pin) {
        this.pin = pin;
        return pin;
    }

    public int setNorek(int f) {
        f = noRek;
        return noRek;
    }

    public int getnoRek() {
        return noRek;
    }

    public int setPoin() {
        //noRek di beri variabel di awal
        if (gettransferSaldo() >= 250000 && getnoRek() == noRek) {
            point+=10;
        } else {
            point = 0;
        }
        return point;
    }

    public int getPoin() {
        return point;
    }

    public int getPin() {
        return pin;
    }

    public void tampilkanJudul() {
        System.out.println("0============================================0");
        System.out.println("----------------BANK KRUT ID------------------");
        System.out.println("0============================================0");
        System.out.println("");
    }

    public void tampilkanLogin() {
        System.out.println("Selamat Datang, Silahkan Pilih Menu Anda...");
        System.out.println("...........................................");
        System.out.println("1. Tarik Tunai");
        System.out.println("2. Cek Saldo");
        System.out.println("3. Transfer Saldo");
        System.out.println("4. Cek Poin");
        System.out.println("5. Keluar");
    }

    public void cekSaldo() {
        System.out.println("Sisa Saldo anda saat ini : Rp." + (this.saldoAwal) + ",-");
        System.out.println("");
    }

    public void ambilSaldo() {
        System.out.println("Pilih Jumlah Uang yang ingin diambil dari saldo anda : ");
        System.out.println("1. Rp.100.000,-");
        System.out.println("2. Rp.200.000,-");
        System.out.println("3. Rp.300.000,-");
        System.out.println("4. Batalkan. ");
        System.out.println("");

    }

    public void transferSaldo(int z) {
        this.transferSaldo = z;

    }

    int gettransferSaldo() {
        return transferSaldo;
    }

    public void tampilkanExit() {
        System.out.println("Terimakasih Telah Menggunakan ATM Kami");
        System.out.println("Silahkan Ambil Kartu ATM Anda");
    }

}
