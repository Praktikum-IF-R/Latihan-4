import java.util.Scanner;
public class mainatm {
    public static void main(String[] args) {
        Scanner ew = new Scanner (System.in);
        int pilihan;
        System.out.print("Masukkan password : ");
        String pass = ew.next();
        atm trans =  new atm(pass);
        trans.setSaldo(5000000);
        int x=2; //insialisasi max. kesalahan input password
        for (int i=0; i<1;i++){ // perulangan inpt password
            if (trans.cekpin()){
        System.out.println("MENU");
        System.out.println("1. Cek Saldo ");
        System.out.println("2. Penarikan Saldo ");
        System.out.println("3. Transfer ");
        System.out.println("4. Cek Point ");
        System.out.println("5. Keluar ");
        do{
           System.out.print("Masukkan pilihan anda: ");
           pilihan = ew.nextInt();
           switch (pilihan){
               case 1: trans.ceksaldo();break;
               case 2: trans.penarikan();
                       trans.getpenarikan();break;
               case 3: trans.transfer(); 
                       trans.gettransfer();break;
               case 4: trans.cekpoint();
                       trans.getcekpoint();break;
               case 5: System.exit(0);
           }
       } while (pilihan!=4);
    }
        
        else  {
            System.out.println("Maaf, anda salah memasukkan password !");    
        }
}
}
}
