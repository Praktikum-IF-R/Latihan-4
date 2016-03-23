package newATM;

import java.util.Scanner;

public class mainATM {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di ATM Bersama!");
        Scanner s = new Scanner(System.in);
        ATM[] user = new ATM[2];
        user[0] = new ATM("Rey Mysterio", "40045454", "141516", 1750000);
        user[1] = new ATM("John Cena", "19691234", "911123", 4255000);
        while (true) {
            System.out.println("User Login : ");
            for (int i = 0; i < user.length; i++) {
                System.out.printf("%d. Nama : %s\t | No. Rekening : %s\n", (i + 1), user[i].getNama(), user[i].getNoRek());
            }
            int input = 0;
            while (true) {
                System.out.print("Kartu ATM anda terletak di nomor : ");
                input = s.nextInt();
                if (input > 0 && input <= user.length) {
                    break;
                }
            }
            ATM userInput = user[input - 1];
            while (true) {
                System.out.printf("Masukkan PIN untuk %s : ", userInput.getNama());
                String pinInput = s.next();
                if (pinInput.equalsIgnoreCase(userInput.getPin())) {
                    System.out.println("Verifikasi PIN sukses! Menuju menu utama...");
                    break;
                } else {
                    System.out.println("Verifikasi PIN gagal!");
                }
            }
            boolean ulang = true;
            do {
                System.out.println("");
                System.out.printf("Selamat datang %s!\nAnda terdaftar di nomor rekening %s\nMenu : \n", userInput.getNama(), userInput.getNoRek());
                System.out.println("1. Cek Saldo\n2. Penarikan Tunai\n3. Transfer Dana\n4. Jumlah Bonus Poin\n5. Keluar");
                System.out.print("Pilihan : ");
                int menuInput = s.nextInt();
                switch (menuInput) {
                    case 1:
                        userInput.printBalance();
                        repeat();
                        break;
                    case 2:
                        System.out.print("Masukkan nilai yang ingin anda tarik : Rp.");
                        int withdraw = s.nextInt();
                        userInput.withdrawBalance(withdraw);
                        repeat();
                        break;
                    case 3:
                        System.out.print("Masukkan No. Rekening tujuan : ");
                        String noRekIn = s.next();
                        ATM found = null;
                        int send;
                        for (int i = 0; i < user.length; i++) {
                            if (user[i].getNoRek().equalsIgnoreCase(noRekIn)) {
                                found = user[i];
                                break;
                            }
                        }
                        if (found != null) {
                            System.out.print("Masukkan jumlah saldo yang ingin ditransfer: Rp.");
                            send = s.nextInt();
                            userInput.transferBalance(found, send);
                        } else {
                            System.out.println("No. Rekening tidak ditemukan!");
                        }
                        repeat();
                        break;
                    case 4:
                        userInput.showPoint();
                        repeat();
                        break;
                    case 5:
                        exitMsg();
                        break;
                }
            } while (ulang);
        }
    }

    public static void repeat() {
        Scanner s = new Scanner(System.in);
        System.out.print("Apakah anda ingin melanjutkan transaksi? (y/n) : ");
        String kembali = s.next();
        if (kembali.equalsIgnoreCase("y")) {
            boolean ulang = true;
        } else {
            System.out.println("Terima kasih telah menggunakan ATM Bersama!");
            System.exit(0);
        }
    }

    public static void exitMsg() {
        System.out.println("Terima kasih telah menggunakan ATM Bersama!");
        System.exit(0);
    }
}
