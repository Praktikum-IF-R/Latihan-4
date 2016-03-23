package latihan4;
import java.util.Scanner;
public class mainATM {
    public static void main(String[] args) {
        ATM a[]=new ATM[10];
        int c=0,pil,salah=0,z;
        Scanner masuk = new Scanner(System.in);
        do {
            System.out.println("1. Daftar");
            System.out.println("2. login");
            System.out.println("3. keluar");
            System.out.print("Masukkan pilihan anda : ");
            pil = masuk.nextInt();
            switch(pil){
                case 1: System.out.print("Masukkan pin anda : ");
                   int p = masuk.nextInt();
                    System.out.print("Masukkan saldo : ");
                    long s = masuk.nextLong();
                    a[c]=new ATM(p,s);
                    System.out.println("Selamat Datang di BANK BERSAMA. Kode rekening anda "+c);
                    System.out.println("=====================================================");
                    c++;break;
                case 2:System.out.print("Masukkan kode rekening : ");
                    int b = masuk.nextInt();
                    do{
                        System.out.print("Masukkan pin anda : ");
                        int d = masuk.nextInt();
                        System.out.println("===================================");
                        a[b].cekpass(d);
                        salah++;
                        if(salah>3){
                            System.out.println("Rekening anda terblokir. Silahkan hubungi call center");
                            System.exit(0);
                        }
                    }while(a[b].getpass()==false&&salah<=3);
                    do{
                        System.out.println("1. Cek Saldo : ");
                        System.out.println("2. Transfer : ");
                        System.out.println("3. Tarik Tunai : ");
                        System.out.println("4. Cek Point : ");
                        System.out.println("5. Keluar : ");
                        System.out.print("Masukkan pilihan anda : ");
                        p=masuk.nextInt();
                        switch (p){
                            case 1: a[b].ceksaldo();
                                break;
                            case 2:
                                System.out.println("Kode Bank : ");
                                System.out.println("Bank BCD\t21");
                                System.out.println("Bank Bersama\t15");
                                System.out.println("Bank Rakyat\t05");
                                System.out.print("Masukkan kode bank : ");
                                int y=masuk.nextInt();
                                System.out.print("Masukan nomor rekening tujuan anda : ");
                                int r=masuk.nextInt();
                                System.out.print("Masukkan jumlah transfer : ");
                                long t=masuk.nextLong();
                                a[b].transfer(r,t,y);
                                break;
                            case 3: System.out.print("Masukkan jumlah tarik tunai : ");
                                long tar=masuk.nextLong();
                                a[b].tarik(tar);
                                break;
                            case 4:System.out.println("Jumlah point anda saat ini : "+a[b].getpoint());
                                break;
                            case 5: System.exit(0);
                        }
                    }while(p!=5);break;
                case 3: System.exit(0);
            }
        } while (pil!=3);
    }
} 
