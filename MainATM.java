package mainatm;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        String pass, rek;
        String jwb = null;
        int pil, jml, point = 0;
        
        Scanner in = new Scanner(System.in);
        Scanner ins = new Scanner(System.in);
        
        ATM akun = new ATM();
        
        System.out.print("Masukkan saldo awal : Rp ");
        int saldo = ins.nextInt();
        akun.setSaldo(saldo);
        System.out.println("Saldo Anda          : Rp "+akun.getSaldo());
        System.out.println("");
        
        System.out.println("========= SELAMAT DATANG =========");
        System.out.print("Masukkan password anda : ");
        pass = in.nextLine();
        System.out.println("==================================");
        
        do {
            System.out.println("   ***** PILIH MENU *****   ");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Transfer");
            System.out.println("3. Tarik Saldo");
            System.out.println("4. Keluar");
            System.out.print("PILIHAN     : ");
            pil = ins.nextInt();
                switch(pil){
                    case 1 :
                        System.out.println("");
                        System.out.println("--------------- CEK SALDO --------------");
                        akun.cekSaldo();
                        System.out.println("----------------------------------------");
                        System.out.println("");
                        break;
                    case 2 :
                        System.out.println("");
                        System.out.println("--------------- TRANSFER ---------------");
                        System.out.print("Masukkan no. rekening tujuan    : ");
                        rek = in.nextLine();
                        System.out.print("Masukkan jumlah uang            : Rp ");
                        jml = ins.nextInt(); 
                        
                        System.out.println("");
                        System.out.println("No. Rekening Tujuan : "+rek);
                        System.out.println("Jumlah Uang         : Rp "+jml);
                        akun.Transfer(rek,jml);
                        System.out.println("----------------------------------------");
                        System.out.println("");
                        break;
                    case 3 :
                        System.out.println("");
                        System.out.println("-------------- TARIK SALDO -------------");
                        System.out.print("Masukkan uang yang akan ditarik : Rp ");
                        int tarik = ins.nextInt();
                        System.out.println("");
                        System.out.println("Jumlah uang yang di tarik  : Rp "+tarik);
                        akun.tarikTunai(tarik);
                        System.out.println("----------------------------------------");
                        System.out.println("");
                        break;
                    case 4 :
                        System.out.println("");
                        System.out.print("Apakah anda akan mengakhiri transaksi?(y/n) : ");
                        jwb = in.nextLine();
                        if (jwb.equalsIgnoreCase("y")){
                            System.out.println("     ***** TERIMA KASIH *****  ");
                            System.exit(0);
                        }
                        else { 
                            while (pil != 0);
                        }
                }
        } while (pil != 0);
    }
}