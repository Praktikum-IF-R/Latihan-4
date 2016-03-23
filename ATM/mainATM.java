package ATM;

import java.util.Scanner;

/**
 * @author DS
 */
public class mainATM {

    public static void main(String[] args) {
        //menginstansiasi object baru
        ATM RBI = new ATM();
        //memasukkan fungsi scanner bernama in
        Scanner in = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("      SELAMAT DATANG DI ATM BANK RBI ");
        System.out.println("            Melayani Setulus Jiwa");
        System.out.println("***********************************************");
        String PIN = RBI.getPin();//program mendapat pin dari method getPin
        //proses user masukan pin
        System.out.println("Masukkan PIN (6 digit) anda : ");
        String masukanPIN = in.next();
        System.out.println("..............................................");
        int pilih;
        int uang;
        //verifikasi pin
        if (PIN.equals(masukanPIN)) {
            do {
                //menampilkan menu transaksi
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("               MENU TRANSAKSI");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("1. 100.000            5. Nominal Lainnya");
                System.out.println("2. 200.000            6. Transfer ");
                System.out.println("3. 500.000            7. Cek Saldo ");
                System.out.println("4. 1.000.000          8. Cek Poin ");
                System.out.println("                      9. Keluar");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = in.nextInt();
                //switch case berdasar pilihan menu yang ada
                switch (pilih) {
                    case 1: {
                        System.out.println("Tarik Tunai sebesar Rp. 100.000");
                        uang = 100000;
                        RBI.setAmbil(uang);
                        System.out.println("BERHASIL");
                        break;
                    }
                    case 2: {
                        System.out.println("Tarik Tunai sebesar Rp. 200.000");
                        uang = 200000;
                        RBI.setAmbil(uang);
                        System.out.println("BERHASIL");
                        break;
                    }
                    case 3: {
                        System.out.println("Tarik Tunai sebesar Rp. 500.000");
                        uang = 500000;
                        RBI.setAmbil(uang);
                        System.out.println("BERHASIL");
                        break;
                    }
                    case 4: {
                        System.out.println("Tarik Tunai sebesar Rp. 1.000.000");
                        uang = 1000000;
                        RBI.setAmbil(uang);
                        System.out.println("BERHASIL");
                        break;
                    }
                    case 5: {
                        System.out.println(" Nominal Lainnya ");
                        System.out.print("Jumlah Uang yang akan ditarik : ");
                        int ambil = in.nextInt();
                        RBI.setAmbil(ambil);
                        System.out.println("Transaksi Berhasil");
                        break;
                    }
                    case 6: {
                        System.out.println(" Transfer ");
                        System.out.println("1. Transfer ke Bank RBI");
                        System.out.println("2. Transfer ke Bank Lain");
                        System.out.print("Masukkan Pilihan : ");
                        int pilihanTransfer = in.nextInt();
                        switch (pilihanTransfer) {
                            case 1:
                                System.out.println("Transfer ke Bank RBI");
                                System.out.print("Masukkan Nomor rekening ");
                                String reksama = in.next();
                                System.out.print("Jumlah Uang yang akan di Transfer ");
                                int transfersama = in.nextInt();
                                RBI.setTransfersama(transfersama);
                                System.out.println("Transaksi Berhasil");
                                break;
                            case 2:
                                System.out.println("Transfer ke Bank Lain ");
                                System.out.println("Ke Bank : ");
                                String Banklain = in.next();
                                System.out.print("Masukkan Nomor rekening ");
                                String reklain = in.next();
                                System.out.print("Jumlah Uang yang akan di Transfer ");
                                int transferlain = in.nextInt();
                                RBI.setTransferlain(transferlain);
                                System.out.println("Anda dikenakan biaya tambahan sebesar Rp. 5.000");
                                System.out.println("Transaksi Berhasil");
                                break;
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("Saldo Anda sebesar Rp.  " + RBI.Saldo());

                        break;
                    }
                    case 8: {
                        System.out.println("Cek Point");
                        System.out.println("Point anda sebesar : " + RBI.getPoin());
                        break;
                    }
                    case 9: {
                        System.out.println("");
                        RBI.Slip();//memanggil method slip agar dapat melihat apa yang sudah dilakukan
                        break;
                    }
                    default:
                        System.out.println("MAAF, PILIHAN TIDAK TERSEDIA");
                }
            } while (pilih != 9);
        } else {
            System.out.println("PIN yang anda masukan salah");
        }
    }
}
