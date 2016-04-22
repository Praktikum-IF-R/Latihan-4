
package tugas4;

import java.util.Scanner;


public class TamuMain {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Jumlah Tamu : ");
        int j=in.nextInt();
        Tamu a[]=new Tamu[j];
        int c=0;
        do{
            System.out.print("Masukan Nama : ");
            String n=in.next();
            System.out.print("Masukan Nomor HP : ");
            String b=in.next();
            System.out.println("Masukan Alamat : ");
            String f=in.next();
            System.out.println("Masukan Kewarganegaraan : ");
            String k=in.next();
            a[c]=new Tamu(n,b,f,k);
            c++;
            System.out.println("nomor id anda: "+Tamu.getcount());     
        } while (c<j);
        System.out.println("               +               +                 +");
        for(int i=0;i<j;i++){
            a[i].display();
        }
        System.out.println("total tamu adalah: "+Tamu.getcount());
    }
    
}
