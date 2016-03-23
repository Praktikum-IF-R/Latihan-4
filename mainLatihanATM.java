package latihanatm;
import java.util.Scanner;
public class mainLatihanATM {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        LatihanATM atm = new LatihanATM();
        int pilihan = 0;
        System.out.println("          S E L A M A T  D A T A N G            ");
        System.out.println("                      D I                       ");
        System.out.println("                B A N K  X X X                  ");
        System.out.println("Silahkan masukkan kartu anda untuk pelayanan\n\n");
        System.out.print("Silahkan masukkan nomor pin anda : ");
        int pin = in.nextInt();
        if (pin == 210297) {
            do {
                System.out.println("=========================================");
                System.out.println("               MENU UTAMA                ");
                System.out.println("=========================================");
                System.out.println("1. Tarik Tunai : ");
                System.out.println("2. Transfer : ");
                System.out.println("3. Cek Saldo : ");
                System.out.println("4. Cek Bonus Point : ");
                System.out.println("5. Keluar : ");
                System.out.print("Pilihan : ");
                pilihan = in.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan jumlah penarikan : Rp ");
                        atm.tarikTunai(in.nextInt());
                        break;
                    case 2:
                        System.out.println("Masukkan Nama Bank Tujuan : ");
                        String nb = input.nextLine();
                        System.out.print("Masukkan jumlah uang untuk transfer (minimum Rp 50.000) : Rp ");
                        int jmlh = in.nextInt();
                        System.out.print("Masukkan nomor rekening tujuan transfer : ");
                        String norek = in.next();
                        atm.transfer(jmlh, norek);
                        atm.BonusPoint(jmlh, nb);
                        if (jmlh > 250000 && nb.equalsIgnoreCase(atm.bankAsli)){
                            atm.displayBonus();
                        }
                        break;
                    case 3:
                        atm.lihatSaldo();
                        break;
                    case 4:
                        atm.displayBonus();
                        break;
                    case 5:
                        System.out.println("Terima Kasih");
                        System.exit(0);
                }
            } while (pilihan != 5);
        } else {
            System.out.println("Nomor PIN salah.");
        }
    }
}
