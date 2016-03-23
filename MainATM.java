package Laporan2Revisi;

/**
 *
 * @author wahyu
 */
import java.util.Scanner;

public class MainATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean status = true;
        MesinATM atm = new MesinATM("155150200111232", 1234, 1000000);
        int i = 0;

        do {
            System.out.println("==============ATM WR-Bank==============");
            System.out.println("No Rekening Anda : " + atm.myrek);
            System.out.print("Masukkan PIN Anda : ");
            int a = in.nextInt();
            if (a == atm.setPIN()) {
                status = true;
            } else {
                System.out.println("PIN Yang Anda Masukan Salah");
                System.out.println("Silahkan Masukan PIN Anda Dengan Benar");
                status = false;
            }
            System.out.println("------------------------------------------------");
            if (i > 1) {
                System.out.println("Maaf, Anda Telah 3-Kali Salah Memasukan PIN");
                System.out.println("Kartu Anda Otomatis Terblokir");
                System.out.println("------------------------------------------------");
                System.out.println("Silahkan Hubungi Hotline Kami: 14045");
                System.out.println("================================================");
                System.exit(0);
            }
            i++;
        } while (status == false);
        System.out.println("Selamat Anda Berhasil Login");
        int pilihan;
        do {
            System.out.println("MENU : ");
            System.out.println("1. CEK SALDO");
            System.out.println("2. TARIK TUNAI");
            System.out.println("3. TRANSFER");
            System.out.println("4. CEK POINT");
            System.out.println("4. EXIT");
            System.out.println("========================================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    atm.cekSaldo();
                    break;
                case 2:
                    System.out.print("Nominal Yang Diambil : ");
                    atm.tarikTunai(in.nextInt());
                    break;
                case 3:
                    System.out.println("1. WR-BANK");
                    System.out.println("2. Bank Lain");
                    System.out.println("Input Pilihan Anda : ");
                    int banktf = in.nextInt();
                    if (banktf == 1) {
                        System.out.print("Nominal Yang Ditransfer : ");
                        int mainjumlah = in.nextInt();
                        System.out.print("No. Rekening Tujuan : ");
                        int mainrek = in.nextInt();
                        atm.transfer(mainjumlah, mainrek);
                        if (mainjumlah >= 250000) {
                            int inipoin = 10;
                            atm.poin(inipoin);
                        }
                        break;
                    } else if (banktf == 2) {
                        System.out.print("Input Kode Bank : ");
                        int kodebank = in.nextInt();
                        System.out.print("Nominal Yang Ditransfer : ");
                        int mainjumlah = in.nextInt();
                        System.out.print("No. Rekening Tujuan : ");
                        int mainrek = in.nextInt();
                        atm.transfer(mainjumlah, mainrek);
                        break;
                    } else {
                        System.out.println("Kode Yang Anda Inputkan Salah");
                    }
                case 4:
                    System.out.println("Point Anda : "+atm.getPoin());
                    break;
                case 5:
                    System.out.println("Terima Kasih Telah Menggunakan Layanan Kami");
                    break;
                default:
            }
        } while (pilihan != 5);
    }
}
