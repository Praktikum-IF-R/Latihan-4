package atm2;
import java.util.Scanner;
public class MainAtm2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = 0; int pilihan;
        for(int a = 0; a <= 2; a++){
        System.out.print("Masukkan pin : ");
        int pin = in.nextInt();
        if(pin == 123456){
            a = 3;
            x = a;
        }
        else{
            System.out.println("Pin Salah");
            x = a;
        }
        }
        Atm2 a = new Atm2(1000000);
        switch(x){
            case 3:
                do{
                a.menu();
                pilihan = in.nextInt();
                switch(pilihan){
                    case 1:
                        a.tampil();
                        break;
                    case 2:
                        System.out.print("Jumlah uang yang ingin ditarik : ");
                        int tarik = in.nextInt();
                        a.tarik(tarik);
                        break;
                    case 3:
                        System.out.println("Transfer");
                        System.out.println("========");
                        System.out.println("1.Bri");
                        System.out.println("2.Bank Lain");
                        System.out.print("Input : ");
                        int input = in.nextInt();
                        if(input == 1){
                        System.out.print("Masukkan no rek : ");
                        long norek = in.nextLong();
                        System.out.print("Masukkan jumlah uang : ");
                        int uang = in.nextInt();
                        a.transfer(norek, uang);
                        if(uang >= 250000){
                            System.out.println("Selamat anda mendapatkan 10 poin");
                            a.setpoin(10);
                        }
                        else
                            System.out.println("Poin tidak bertambah");
                        }
                        else if(input == 2){
                            System.out.println("Masukkan kode bank : ");
                            int kode = in.nextInt();
                            System.out.println("Masukkan no rek : ");
                            long norek2 = in.nextLong();
                            System.out.println("Masukkan jumlah uang : ");
                            int uang2 = in.nextInt();
                            a.transfer2(norek2, uang2, kode);
                        }
                        break;
                    case 4:
                        int poli = a.poin;
                        System.out.println("Poin Anda : "+poli);
                        break;
                    case 5:
                        System.out.println("Terimakasih Telah Memakai Atm Bri");
                        break;
                    default:
                        System.out.println("Inputan salah");
                        break;
                }
                }while(pilihan != 5);
                break;
            case 2:
                System.out.println("Atm anda diblokir");
                break;
        }
    }
}