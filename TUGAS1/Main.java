package TUGAS1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String in;
        int n, input;
        boolean transaksi;
        Scanner scan = new Scanner(System.in);
        MesinATM acc = new MesinATM(123456,1500000);
        MesinATM BRI = new MesinATM(123456,100000);
        MesinATM another = new MesinATM(123456,50000);
        System.out.println("PT BANK RAKYAT INDONESIA");
        System.out.print("PIN : ");
        input = scan.nextInt();
        transaksi = acc.Password(input);
        while (transaksi) {
            System.out.println("Pilihan Menu\n1.cek saldo\n2.tarik uang\n3.transfer\n4.cek poin");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Saldo Anda Saat ini\nRp. " + acc.getSaldo());
                    break;
                case 2:
                    System.out.print("Masukkan Nominal : ");
                    input = scan.nextInt();
                    acc.Transaksi(input);
                    System.out.println("Transaksi Berhasil");
                    break;
                case 3 :
                    System.out.println("Bank yang dituju :");
                    in=scan.nextLine();
                    in=scan.nextLine();
                    System.out.print("Rekening : ");
                    input = scan.nextInt();
                    System.out.print("Masukkan jumlah uang yang akan ditransfer : ");
                    input = scan.nextInt();
                    acc.Transaksi(input);
                    if(in.equalsIgnoreCase("bri")&&input>250000){
                        acc.setPoin();
                        BRI.Transfer(input);
                    }
                    else
                        another.Transfer(input);
                    System.out.println("Transfer Berhasil Dilakukan");
                    break;
                case 4 :
                    System.out.println("Poin anda saat ini : "+acc.getPoin());
            }
            System.out.println("\nTransaksi lagi? 1.Ya 2.Tidak");
            input = scan.nextInt();
            transaksi = (input==1)? true : false;
            System.out.println("");
        }
    }
}
