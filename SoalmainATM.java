package Encapsulation;
import java.util.Scanner;
public class SoalmainATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("SELAMAT DATANG di BANK BINI");
        String pil,user;
        int i,PIN,pass;
        do {
            i = 0;
            System.out.println("Silahkan buat akun");
            System.out.println("Masukkan Rekening       :");
            user = in.next();
            System.out.println("Masukkan PIN :");
            pass = in.nextInt();
            System.out.println("akun anda telah terdaftar");
            do {
                System.out.println("Masukkan PIN kembali : ");
                PIN = in.nextInt();
                if (PIN != pass) {
                    System.out.println("PIN Anda salah");
                    i++;
                    if (i == 3) {
                        System.out.println("Anda telah mencapai batas memasukkan PIN");
                        System.out.println("PIN anda di blokir");
                    }
                } else {
                    System.out.println("No rek. " + user+"\nSelamat Datang");
                }
            } while (PIN != pass && i < 3);
        } while (i == 3);
     SoalATM acc = new SoalATM(user,pass,PIN);
        do{
     acc.menu();
        System.out.print("Pilih menu nomor :");
     int menu = in.nextInt();
     if(menu==1){
         System.out.println("Masukkan banyak uang :");
         int depo = in.nextInt();
         acc.Deposit(depo);
         System.out.println("anda telah melakukan deposit");
     }else if(menu==2){
         acc.ceksaldo();
     }else if(menu==3){
         acc.cekpoin();
     }else if(menu==4){
         System.out.println("Berapa uang yang ditarik?");
         int tarik = in.nextInt();
         acc.Tarik(tarik);
     }else if(menu==5){
         System.out.println("Masukkan Rekening yang dituju :");
         String rek = in.next();
         System.out.println("Banyak uang yang di tranfer :");
         int tran = in.nextInt();
         acc.Transfer(rek, tran);
         acc.getPoint(tran);
         }
     else if(menu==6){
         System.out.println("Terima kasih telah memilih pelayanan kami");
         break;
     }
            System.out.println("Apakah ingin mengakses lagi(y/n)?");
            pil = in.next();
      }while(pil.equals("y"));
    }    
}