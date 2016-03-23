package Constructor;

import java.util.Scanner;

public class ATMAction {
public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int menu, trk, pin2, trans=0;String pin;
        System.out.print("Masukan PIN Anda : ");
        pin =in.nextLine();
        ATM n1 = new ATM ("987654321",5000000,0);
        do {
        System.out.println("======Menu ATM BNI======");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Transfer");
        System.out.println("4. Cek Bonus");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu :");
        menu = in.nextInt();
            System.out.println("");
        switch (menu){
            case 1 :
                System.out.println("Jumlah Saldo Anda       \t:Rp."+n1.saldo);
                System.out.println("----------------------------------------");
                break;
            case 2 :
                System.out.print("Masukan jumlah Penarikan  \t:Rp.");
                trk = in.nextInt();
                if (trk <= n1.saldo){
                n1.tarik(trk);
                System.out.println("Sisa saldo anda         \t:Rp."+n1.saldo);
                    System.out.println("-----------------------------------");
          } else {
          System.out.println("Penarikan gagal!!!");
          System.out.println("Saldo anda kurang dari Rp."+trk);
                    System.out.println("-----------------------------------");
          }
                break;
            case 3 :
                System.out.print("Transfer Ke Bank          \t:");
                String c = in.next();
                System.out.print("Transfer ke Rekening      \t:");
                pin2 = in.nextInt();
                System.out.print("Jumlah yang di Transfer   \t:Rp.");
                trans = in.nextInt();
                if (trans <= n1.saldo){
                n1.transfer(trans,c);
                System.out.println("Sisa Saldo Anda         \t:Rp."+n1.saldo);
                    System.out.println("-----------------------------------");
                } else {
                System.out.println("Transfer Gagal!!!");
                System.out.println("Saldo anda tidak mencukupi");
                    System.out.println("-----------------------------------");
                }
                break;
            case 4 :
                n1.BonusNow();
                break;
            case 0 :
                System.out.println("Keluar Program, Terimakasih");
                break;
        default :
        System.out.println("Menu salah, masukan ulang pilihan");
        }
        }while (menu != 0);   
    }   
}
    

