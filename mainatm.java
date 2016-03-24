package time1;

import java.util.*;

public class mainatm {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        atm[] nasabah = new atm[2];
        nasabah[0] = new atm("Hafiz ", "155150", "201514", 140000000);
        nasabah[1] = new atm("Budi ", "1415510", "201615", 10000000);
        while (true) {
            System.out.println("Pilihan kartu ATM");
            for (int i = 0; i < nasabah.length; i++) {
                System.out.printf("%d. %s %s\n", (i + 1), nasabah[i].getNama(), nasabah[i].getNoRek());
            }
            int input = 0;
            while (true) {
                System.out.print("Pilih ATM yang ingin dimasukkan ke mesin ATM : ");
                input = c.nextInt();
                if (input > 0 && input <= nasabah.length) {
                    break;
                }
            }
            atm nasabahIn = nasabah[input - 1];
            while (true) {
                System.out.printf("Masukkan PIN untuk %s (%s) : ", nasabahIn.getNama(), nasabahIn.getNoRek());
                String inPin = c.next();
                if (inPin.equalsIgnoreCase(nasabahIn.getPin())) {
                    break;
                } else {
                    System.out.println("PIN salah");
                }
            }
            boolean ulang = true;
            do {
                System.out.printf("Selamat datang %s (%s)\nMenu\n", nasabahIn.getNama(), nasabahIn.getNoRek());
                System.out.println("1. Cek saldo\n2. Tarik tunai\n3. Transfer\n4.tampilkan point \n5. Keluar");
                System.out.print("Silahkan pilih menu yang anda pilih : ");
                int inMenu = c.nextInt();
                switch (inMenu) {
                    case 1:
                        nasabahIn.cetakSaldo();
                        break;
                    case 2:
                        System.out.print("Masukkan nilai yang ingin anda tarik : Rp.");
                        double tarik = c.nextDouble();
                        nasabahIn.tarikSaldo(tarik);
                        break;
                    case 3:
                        System.out.print("Masukkan No. Rekening tujuan : ");
                        String noRekIn = c.next();
                        atm found = null;
                        double send;
                        for (int i = 0; i < nasabah.length; i++) {
                            if (nasabah[i].getNoRek().equalsIgnoreCase(noRekIn)) {
                                found = nasabah[i];
                                break;
                            }
                        }
                        if (found != null) {
                            System.out.print("Masukkan jumlah saldo yang ingin ditransfer: Rp. ");
                            send = c.nextDouble();
                            nasabahIn.transferSaldo(found, send);
                        } else {
                            System.out.println("No. Rekening tidak ditemukan!");
                        }
                        break;
                    case 4:
                        nasabahIn.showPoint();
                        break;
                    case 5:
                        ulang();
                }
                
            } while (ulang);
        }
    }

    public static void ulang() {
        System.out.println("===Terima Kasih Telah Melakukan Transaksi===");
        System.exit(0);
    }
}
