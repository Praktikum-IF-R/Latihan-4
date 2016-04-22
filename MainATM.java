
package praktikum2;
import java.util.Scanner;
public class MainATM {

    
    public static void main(String[] args) {
    ATM a[]=new ATM[10];
    int c=0,pil,salah=0,p;
    Scanner in=new Scanner(System.in);
    
    do{
        System.out.println("1. signup");
        System.out.println("2. signin");
        System.out.println("3. out");
        System.out.print("insert : ");
        pil=in.nextInt();
        System.out.println("|||||||||||||||||||||||||||");
        switch(pil){
            case 1:
                System.out.print("Masukan pilihan : ");
                int i=in.nextInt();
                System.out.print("Masukan Saldo : ");
                long l=in.nextLong();
                a[c]=new ATM(i,l);
                System.out.println("Selamat datang di bank kami, nomer rekening anda"+c);
                System.out.println("|||||||||||||||||||||||||||||");
                c++;break;
            case 2:
                System.out.println("Masukan nomer rekening");
                int b=in.nextInt();
                do{
                    System.out.print("Pin : ");
                    int d=in.nextInt();
                    System.out.println("|||||||||||||||||");
                    a[b].cekPass(d);
                    salah++;
                    if(salah>3){
                        System.out.println("rekening anda mati : ");
                        System.exit(0);
                    }
                }while(a[b].getPass()==false&salah<=3);
                do{
                    System.out.println("1. cek saldo");
                         System.out.println("2. transfer");
                        System.out.println("3. tarik tunai");
                      System.out.println("4. cek poin");
                        System.out.println("5. keluar");
                      System.out.print("masukan pilihan anda: ");
                   p=in.nextInt();
                       switch (p){
                           case 1: a[b].cekSaldo();break;
                            case 2:
                               System.out.println("kode bank:");
                              System.out.println("bank bcd\t12");
                               System.out.println("bank kita\t17");
                                System.out.println("bank rut\t99");
                                System.out.print("masukan kode bank:");
                              int y=in.nextInt();
                              System.out.print("masukan no.rekening tujuan: ");
                               int r=in.nextInt();
                               System.out.print("masukan jumlah transfer: ");
                                long t=in.nextLong();
                               a[b].transfer(r,t,y);break;
                           case 3: System.out.print("masukan jumlah tarik tunai: ");
                             long tar=in.nextLong();
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
                
    
    

