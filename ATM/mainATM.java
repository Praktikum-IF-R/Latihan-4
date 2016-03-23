package ATM;
import java.util.Scanner;
public class mainATM {
public static void main(String[] args) {
    int pilihan;
    String trans = "";
    Scanner in = new Scanner(System.in);
    
    ATM data = new ATM();
    long b = in.nextLong();
    data.setPin(b);
    data.pilihan();
    do{
    System.out.print("Masukkan pilihan anda : ");
    pilihan = in.nextInt();
    switch(pilihan){
        case 1 : data.ceksaldo(); 
                 System.out.println("Ingin melakukan transaksi lagi? (Y/N)");
                 trans = in.next();
                 System.out.println("Jumlah poin anda : "+data.poin());
                 break;
        case 2 : data.transfersaldo();
                 String bnk = in.next();
                 data.setBank(bnk);
                 data.transfersaldo1();
                 long n = in.nextLong();
                 data.setNorek(n);
                 data.transfersaldo2();
                 int j = in.nextInt();
                 data.setJumlahTransfer(j);
                 data.transfersaldo3(); 
                 System.out.println("Ingin melakukan transaksi lagi? (Y/N)");
                 trans = in.next();
                 System.out.println("Jumlah poin anda : "+data.poin());
                 break;
        case 3 : data.tarikSaldo();
                 int t = in.nextInt();
                 data.setTarikSaldo(t);
                 data.tarikSaldo2(); 
                 System.out.println("Ingin melakukan transaksi lagi? (Y/N)");
                 trans = in.next();
                 System.out.println("Jumlah poin anda : "+data.poin());
                 break;
        }
    }while(trans.equalsIgnoreCase("Y"));
    data.Akhir();
    }
}
