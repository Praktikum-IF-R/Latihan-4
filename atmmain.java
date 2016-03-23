package praktikum2;
import java.util.Scanner;
public class atmmain {
    public static void main(String[] args) {
        atm a[]=new atm[10];
        int c=0,pil,salah=0,p;
        Scanner masuk=new Scanner(System.in);
        do {
            System.out.println("1. Daftar");
            System.out.println("2. login");
            System.out.println("3. keluar");
            System.out.print("masukan pilihan: ");
            pil=masuk.nextInt();
            System.out.println("+++++++++++++++++++++++++++++++++");
            switch(pil){
                case 1: System.out.print("masukan pin: ");
                    int n=masuk.nextInt();
                    System.out.print("masukan saldo: ");
                    long i=masuk.nextLong();
                    a[c]=new atm(n,i);
                    System.out.println("selamat bergabung di bank kita. nomer kode rekening anda "+c);
                    System.out.println("===================================");
                    c++;break;
                case 2:System.out.print("masukan kode rekening: ");
                    int b=masuk.nextInt();
                    do{
                        System.out.print("masukan pin: ");
                        int d=masuk.nextInt();
                        System.out.println("===================================");
                        a[b].cekpass(d);
                        salah++;
                        if(salah>3){
                            System.out.println("rekening terblokir. hubungi call center");
                            System.exit(0);
                        }
                    }while(a[b].getpass()==false&&salah<=3);
                    do{
                        System.out.println("1. cek saldo");
                        System.out.println("2. transfer");
                        System.out.println("3. tarik tunai");
                        System.out.println("4. cek poin");
                        System.out.println("5. keluar");
                        System.out.print("masukan pilihan anda: ");
                        p=masuk.nextInt();
                        switch (p){
                            case 1: a[b].ceksaldo();break;
                            case 2:
                                System.out.println("kode bank:");
                                System.out.println("bank bcd\t12");
                                System.out.println("bank kita\t17");
                                System.out.println("bank rut\t99");
                                System.out.print("masukan kode bank:");
                                int y=masuk.nextInt();
                                System.out.print("masukan no.rekening tujuan: ");
                                int r=masuk.nextInt();
                                System.out.print("masukan jumlah transfer: ");
                                long t=masuk.nextLong();
                                a[b].transfer(r,t,y);break;
                            case 3: System.out.print("masukan jumlah tarik tunai: ");
                                long tar=masuk.nextLong();
                                a[b].tarik(tar);break;
                            case 4:System.out.println("jumlah poin anda saat ini: "+a[b].getpoin());break;
                            case 5: System.exit(0);
                        }
                    }while(p!=5);break;
                case 3: System.exit(0);
            }
        } while (pil!=3);
    }
}
