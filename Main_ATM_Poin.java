package student;

import java.util.Scanner;
public class Main_ATM_Poin {
public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int menu; 
        ATM siswa = new ATM(1503, 1000000);
        System.out.println("WELCOME TO ATM");
         System.out.print("INPUT YOUR PIN HERE : ");
         int pw = a.nextInt();

         if (pw == siswa.getPassword()) {
             do {
                 System.out.println("--------ATM PERANTAUAN-------");
                 System.out.println("1. Penarikan uang");
                 System.out.println("2. Cek Saldo");
                 System.out.println("3. Transfer");
                 System.out.println("4. Keluar");
                 System.out.println("------------------------------");
 
                 System.out.print("Menu :");
                 menu = a.nextInt();
                 System.out.println("");
                 switch (menu) {
                     case 1:
                         System.out.println("Masukkan jumlah uang yang akan diambil"  + "Rp ");
                         int uang = a.nextInt();
                         System.out.println("saldo anda adalah");
                         int total = siswa.getSaldo() - uang;
                         System.out.println("Rp" + total);
                         break;
                     case 2:
                         System.out.println("Sisa Saldo anda saat ini adala" + "\n" + "Rp " + siswa.getSaldo());
                         break;
                     case 3:
                         System.out.print("Masukkan jumlah uang yang akan anda transfer" + "\n" + "Rp ");
                         int transfer = a.nextInt();
                         System.out.print("Masukkan No.Rekening Tujuan : " );
                         int norek = a.nextInt();
                         System.out.println("1. ATM PERANTAUAN");
                         System.out.println("2. ATM PERKOTAAN");
                         System.out.println("Masukkan pilihan anda :");
                        int bank = a.nextInt();
                         if (bank == 1) {
                             System.out.println("Saldo anda sekarang");
                             int tot = siswa.getSaldo() - transfer;
                             System.out.println("Rp " + tot);
                             if (transfer >= 250000) {
                                 siswa.Poin();
                                 System.out.println("Point anda saat ini : " + siswa.getPoin());
                             }
                             break;
                         }
                 }
             } while (menu <= 3);
         } else {
             System.out.println("PIN ANDA SALAH ");
         }
     }
 }
    
    

