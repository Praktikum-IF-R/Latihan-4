package tugas.encapsulation.praktikum;

import java.util.Scanner;

public class mainATMprak {

    public static void main(String args[]) {
        Scanner inputI = new Scanner(System.in);
        ATMprak atm1 = new ATMprak();
        System.out.println("SELAMAT DATANG DI ATM BRI");
        System.out.println("Masukkan kartu ATM anda! ");
        System.out.print("Masukkan Password anda: ");
        int pas = inputI.nextInt();
        atm1.cekpassword(pas);
        if (atm1.getPassword() != pas) {
            for (int a = 1; a <= 3; a++) {
                System.out.print("Masukkan ulang password anda: ");
                int pasing = inputI.nextInt();
                atm1.cekpassword(pasing);
                if (atm1.getPassword() == pasing) {
                    break;
                } else if (a == 3 && atm1.password != pasing) {
                    System.out.println("TERBLOKIR!");
                    System.exit(0);
                }
            }
        } else {
            atm1.getSaldo();
        }
        System.out.println("===============================");
        Scanner inI = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);
        System.out.println("TAMPILAN MENU:  ");
        int q;
        do {
            System.out.println("");
            System.out.println("1. TARIK UANG");
            System.out.println("2. TRANSFER UANG");
            System.out.println("3. LIHAT SALDO dan POINT");
            System.out.println("4. EXIT");
            System.out.print("Masukkan Pilihan anda: ");
            int pil = inI.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("");
                    System.out.println("PILIH JUMLAH UANG YANG DITARIK: ");
                    System.out.println("1. Rp. 50.000");
                    System.out.println("2. Rp. 100.000");
                    System.out.println("3. Rp. 300.000");
                    System.out.println("4. Rp. 500.000");
                    System.out.println("5. Rp. 1.000.000");
                    System.out.println("6. Rp. 1.500.000");
                    System.out.println("7. Rp. 2.000.000");
                    System.out.println("8. Rp. 3.000.000");
                    System.out.print("Masukkan nominal uang ambil anda: ");
                    int u = inI.nextInt();

                    atm1.tarikuang(u);
                    break;
                case 2:
                    System.out.println("");
                    System.out.println(" TRANSFER UANG ");
                    System.out.print("Masukan nama bank yang akan dituju: ");
                    String nb = inS.nextLine();
                    System.out.print("pilih No Rekening tujuan: ");
                    int norek = inI.nextInt();
                    atm1.setNorek(norek);
                    System.out.print("Masukkan nominal uang: ");
                    int uangtransfer = inI.nextInt();
                    atm1.transfer(uangtransfer);
                    atm1.HitungPoint (nb);
                    atm1.displayTransfer();
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("SALDO ANDA SEBESAR: " + atm1.getSaldo());
                    System.out.println("JUMLAH BONUS POINT ANDA SEKARANG ADALAH: "+atm1.getJumlahPoint());
                    break;

                case 4:
                    System.out.println("AMBIL KARTU ATM ANDA! TERIMAKASIH! :) ");
                    System.exit(0);
                    
                
            }
            System.out.println("");
            System.out.println("APAKAH ANDA INGIN MELAKUKAN TRANSAKSI LAGI?");
            System.out.println("");
            System.out.println("1. IYA ");
            System.out.println("2. TIDAK ");
            System.out.print("Masukkan pilihan: ");

            q = inI.nextInt();
        } while (q == 1);

        System.out.println("TERIMAKASIH :) ");

    }

}
