package Praktik04;
import java.util.Scanner;
public class MainAtm {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Set Saldo: ");
        double b = in.nextDouble();
        System.out.print("Set Pin: ");
        String c = in.next();
        System.out.print("Set Poin: ");
        int d = in.nextInt();
        atm baru = new atm();
        baru.setData(c,b,d);
        System.out.println("====================ATM BRI====================");
        boolean loop = true;
        boolean loop1 = true;
        int input;
        String input1;
        while(loop1){
        System.out.print("Masukkan PIN anda: ");
        input1 = in.next();
        if (input1.equals(baru.getPin())){
            loop1 = false;
            while(loop){
                System.out.println("--------------------------");
                System.out.println("1. Lihat Saldo");
                System.out.println("2. Tranfer");
                System.out.println("3. Penarikan Tunai");
                System.out.println("4. Lihat Poin Bonus");
                System.out.println("5. Selesai");
                System.out.println("--------------------------");
                System.out.print("Input Pilihan: ");
                input = in.nextInt();
                switch(input){
                    case 1: System.out.println("Saldo anda saat ini adalah:\nRp "+baru.getSaldo());
                            break;
                    case 2: System.out.print("Ingin melakukan transfer ke bank mana: ");
                            String f = in.next();
                            System.out.print("Nominal yang ingin ditransfer: ");
                            int g = in.nextInt();
                            baru.Transfer(g, f);
                            break;
                    case 3: System.out.print("Nominal uang yang ingin anda ambil: ");
                            int h = in.nextInt();
                            baru.Tarik(h);
                            break;
                    case 4: System.out.println("Poin yang anda miliki saat ini adalah: "+baru.getPoin()+" Poin");
                            break;
                    case 5: loop = false;
                            break;
                    default:System.out.println("Pilihan tidak ditemukan...");
                            }
                        }
        }
        else{
            System.out.println("PIN salah");
        }
    }
    }
}