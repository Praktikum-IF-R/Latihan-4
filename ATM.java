package ATM3;

import java.util.*;

class ATM {

    String nama;
    String pass;
    double saldo;
    double nomorRek;
    private int poin = 0;
    boolean t = true;
    Scanner in = new Scanner(System.in);
    mainATM cari = new mainATM();

    public ATM(String nama, String pass, double saldo, double nomorRek) {
        this.nama = nama;
        this.pass = pass;
        this.saldo = saldo;
        this.nomorRek = nomorRek;
    }

    void setPoin() {
        poin += 10;
    }

    public ATM() {
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void setPass(String pass) {
        this.pass = pass;
    }

    void setNomorRek(int i) {
        nomorRek += i;
        nomorRek += 100;
    }

    void screenMenu() {
        System.out.println("================================");
        System.out.println("[[[[======== MENU ==========]]]]");
        System.out.println("1. lihat saldo    4. ambil uang");
        System.out.println("2. transfer       5. keluar");
        System.out.println("3. poin");
        System.out.println("================================");
    }

    boolean pilih(int pilih) {
        switch (pilih) {
            case 1:
                System.out.println("saldo anda adalah : Rp." + saldo);
                break;
            case 2:
                System.out.println("masukkan nomor rekening : ");
                int nomor = in.nextInt();
                System.out.println("transfer sessama bank ? (Y/n)");
                String y = in.next();
                cari.cari(nomor);
                if (cari.nominal >= 250000 && y.equalsIgnoreCase("y")) {
                    setPoin();
                    saldo -= cari.transaksi((int) cari.ini);
                } else {
                    saldo -= cari.transaksi((int) cari.ini);
                }
                break;
            case 3:
                System.out.print("ini poin anda : ");
                System.out.println(poin);
                break;
            case 4:
                System.out.println("masukkan nominal yang akan diambil : ");
                double ambil = in.nextInt();
                saldo -= ambil;
                break;
            case 5:
                t = false;
                break;
            default:
                System.out.println("pilih yang benar");
        }
        return t;
    }
}
