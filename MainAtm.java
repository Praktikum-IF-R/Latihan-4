/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM3;
import java.util.Scanner;
/**
 *
 * @author Deltaviyahya
 */

    
 public class MainAtm {
     public static void main(String[] args) {
         Scanner C = new Scanner (System.in);
         System.out.print("Set Saldo Anda : ");
         double b = C.nextDouble();
         System.out.print("Set Pin Anda   : ");
         String c = C.next();
         System.out.print("Set Poin Anda  : ");
         int d = C.nextInt();
         atm baru = new atm();
         baru.setData(c,b,d);
         System.out.println("==================== ======= ====================");
         System.out.println("==================== ATM BNY ====================");
         System.out.println("==================== ======= ====================");
         boolean loop = true;
         boolean loop1 = true;
         int input;
         String input1;
         while(loop1){
         System.out.print("Masukkan PIN Anda : ");
         input1 = C.next();
         if (input1.equals(baru.getPin())){
             loop1 = false;
             while(loop){
                 System.out.println("============================");
                 System.out.println("1. Lihat Saldo");
                 System.out.println("2. Penarikan Tunai");
                 System.out.println("3. Tranfer");
                 System.out.println("4. Lihat Poin Bonus");
                 System.out.println("5. Selesai");
                 System.out.println("============================");
                 System.out.print("Input Pilihan Anda: ");
                 input = C.nextInt();
                 switch(input){
                     case 1: 
                         System.out.println("Saldo anda saat ini adalah:\nRp "+baru.getSaldo());
                             break;
                     case 2: 
                         System.out.print("Jumlah uang yang ingin anda ambil: ");
                             int h = C.nextInt();
                             baru.Tarik(h);
                             break;
                     case 3: 
                         System.out.print("Bank tujuan :  ");
                             String f = C.next();
                             System.out.print("Nominal yang ingin ditransfer: ");
                             int g = C.nextInt();
                             baru.Transfer(g, f);
                             break;
                     case 4: 
                         System.out.println("Poin yang anda saat ini adalah: "+baru.getPoin()+" Poin");
                             break;
                     case 5: 
                         loop = false;
                             break;
                     default:
                         System.out.println("Pilihan tidak ditemukan...");
                             }
                         }
         }
         else{
             System.out.println("PIN yang anda masukkan salah");
         }
     }
}
 }