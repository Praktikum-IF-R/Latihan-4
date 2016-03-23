package praktikum2;
import java.util.Scanner;
public class mainATM {
    public static void main(String[] args) {
        ATM ardia = new ATM();
        Scanner input = new Scanner (System.in);
        int n,c;
        System.out.println("Masukkan PIN anda ");
        ardia.setPin(input.next());
        ardia.cekpin();
        System.out.println("==================================================");
        System.out.println("\tSELAMAT DATANG DI BANK BLABLABLA");
        System.out.println("==================================================");
        System.out.println("1. Cek Saldo\t\t\t 2. Transfer Uang");
        System.out.println("3. Tarik Tunai\t\t\t 4. Cek Point");
        System.out.println("5. Akhiri Transaksi");
        do {
        System.out.print("Pilihan anda: ");
        n = input.nextInt();
        switch (n){
            case 1:
                ardia.ceksaldo();
                break;
            case 2:
                input.nextLine();
                System.out.print("Bank Tujuan \t ");
                ardia.setbank(input.nextLine());
                System.out.print("Nomer Rekening Tujuan \t ");
                ardia.setnorektujuan(input.nextLine());
                System.out.print("Nominal yang akan di transfer \t ");
                ardia.setTransfer(input.nextInt());
                break;
            case 3:
                System.out.println("1. 50000\t\t\t 2. 100000");
                System.out.println("3. 150000\t\t\t 4. 200000");
                System.out.println("5. Jumlah lain\t\t\t 6.Batal");
                System.out.print("Pilih: ");
                c = input.nextInt();
                switch (c){
                    case 1:
                    ardia.penarikansaldo(50000);
                        break;
                    case 2:
                        ardia.penarikansaldo(100000);
                        break;
                    case 3:
                        ardia.penarikansaldo(150000);
                        break;
                    case 4:
                        ardia.penarikansaldo(200000);
                        break;
                    case 5:
                        System.out.print("Nominal yang akan anda ambil \t ");
                        ardia.penarikansaldo(input.nextInt());
                        break;
                    default:
                }
                break;
            case 4:
                System.out.println("Point anda " + ardia.getPoint());
                break;
            case 5:
                System.out.println("TERIMA KASIH TELAH MENGGUNAKAN JASA KAMI");
                break;
            default:
                System.out.println("Input Salah!");
                break;
        }
        } while (n != 5);
    }
}