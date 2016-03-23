
package atm;import java.util.Scanner;
public class MainAtm {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);   
        Atm B = new Atm ();
        System.out.print("Masukan pin anda (6 digit) : ");
        B.setPin(input.next());
        B.cekpin(); 
        
        int pilihan=0,opsi;
        String p,s,d="y" ;
        int saldo,y,b = 0,point;  
        do{
   System.out.println("===============================================");
   System.out.println("Masukkan pilihan anda: ");
   System.out.println("1.Cek saldo ");
   System.out.println("2.Penarikan uang ");
   System.out.println("3.Transfer ");
   System.out.println("4.Cek Point");
   System.out.println("5.Keluar");
   System.out.println("===============================================");
   pilihan = input.nextInt();
   switch(pilihan) {
   case 1 : B.ceksaldo();break;
   case 2 : System.out.print("Masukkan jumlah penarikan : ");
            b = input.nextInt();
            int c = B.transfer(b) - b; break;
   case 3 : System.out.print("Masukkan No Rekening Tujuan Anda : ");
            s = input.next();
            System.out.print("Masukkan besar Saldo : ");
            y = input.nextInt();
            B.setNorek(s);
            B.transfer(y);
            if(y>=250000){
            B.setPoint(10); break;
                }
   case 4 : System.out.println("Jumlah point anda saat ini adalah : "+B.getPoint()); break;
       
   case 5 : System.out.println("===============================================");
            System.out.println("\t\tTERIMAKASIH");
            System.out.println("\tJANGAN LUPA AMBIL KARTU ANDA");
            System.out.println("===============================================");
            System.exit(0);
   }
            System.out.println("===============================================");
            System.out.println();
        }while (pilihan!=5);  
}
}

