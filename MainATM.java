/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        String pilihan1;
        Scanner input = new Scanner(System.in);    
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di ATM BANK KITA");
        System.out.println("ATMMU ATMKU ATM KITA BERSAMA YEEEEEEE ");   
        ATM ATM1 = new ATM();  
        do{
            System.out.println("=============== Selamat Datang ===============");
            do {
                System.out.print("Masukkan Pin : ");
                ATM1.setPIN(input.next());
                if (ATM1.getPIN().equalsIgnoreCase("123456")) {
                    System.out.println("Pin Benar");
                } else {
                    System.out.println("Pin Anda Salah!");
                }

            } while (!(ATM1.getPIN().equalsIgnoreCase("123456")));
        System.out.println("1. Cek Saldo");
        System.out.println("2. Penarikan Tunai");
        System.out.println("3. Transfer Tunai");
        System.out.println("4. Saldo Bonus Poin");
        System.out.println("Masukkan Pilihan anda :");
        int pilihan=input.nextInt();
        switch(pilihan){
            case 1 : System.out.println(ATM1.checksaldo());break;
            case 2 : 
                System.out.println("Masukkan Uang yang akan anda tarik :");
                System.out.println(ATM1.Tariktunai(input.nextInt()));break;
            case 3 :
                System.out.println("Masukkan no rekening yang akan anda tuju :");
                String rek=in.nextLine();
                ATM1.setrekening(rek);
                System.out.println("Masukkan Jumlah Uang yang akan anda transfer :");
                int uang=input.nextInt();
                ATM1.TransferTunai(uang);
                ATM1.bonuspoint(uang);break;
            case 4: ATM1.pointsekarang();
        }
        System.out.println("==============================================");
            System.out.print("Apakah Anda Ingin Melakukan Transaksi Lagi? (YA/TIDAK) : ");
            pilihan1 = in.nextLine();
    } while(pilihan1.equalsIgnoreCase("YA"));
    }
}

    
        
    