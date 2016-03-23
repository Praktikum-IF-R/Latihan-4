package mainatm;

import java.util.Scanner;

public class MainATM {

    public static void main(String[] args) {
        
        User user1 = new User(15515,123,500000);
        
        Scanner in = new Scanner(System.in);
        
        int na,na2, p, pilih, nominal, kb, cekk=0;
        String pi;
        boolean cek = true;
        
        do{
            System.out.println("     LOG IN ATM     ");
            System.out.println("....................");
            System.out.print("Nomor Akun :");
            na = in.nextInt();
            System.out.print("PIN        :");
            p = in.nextInt();
            System.out.println("....................");
    
            if(user1.cekpassword(na, p)==true){
                cek = true;
                
                do{
                System.out.println("\n----------------------");
                System.out.println("   Selamat Datang DI   ");
                System.out.println("      BANK BOKIR       ");
                System.out.println("----------------------");
                System.out.println("MENU :                ");
                System.out.println("1.Lihat Saldo\n2.Tarik Tunai\n3.Transfer\n4.Cek Point\n5.exit");
                System.out.println("----------------------");
                System.out.print("Masukan menu yang dipilih :");
                pilih = in.nextInt();
                
                    System.out.println("==========================");
                switch(pilih){
                    case 1 : 
                        System.out.println("SALDO :\nRp"+user1.liatSaldo());
                        break;
                        
                    case 2 : 
                        if(user1.liatSaldo()>0){
                            System.out.print("Masukan nominal uang yang diambil :\nRp");
                            nominal = in.nextInt();
                            if(nominal<=user1.liatSaldo()){
                                System.out.println("Uang diambil sebesar:\nRp"+user1.ambilUang(nominal));
                                System.out.println("Sisa Saldo:\nRp"+user1.liatSaldo());
                            }
                            else{
                                System.out.println("Saldo anda tidak mencukupi");
                            }
                        }
                        else{
                            System.out.println("Saldo anda tidak ada ");
                        }
                            
                        break;
                        
                    case 3 : 
                        if(user1.liatSaldo()>0){
                            System.out.print("Masukan nominal uang yang ditransfer :\nRp");
                            nominal = in.nextInt();
                            if(nominal<=user1.liatSaldo()){
                                System.out.print("Masukan kode bank tujuan  :");
                                kb = in.nextInt();
                                System.out.print("Masukan nomor akun tujuan :");
                                na2 = in.nextInt();
                                 System.out.println("Uang ditransfer sebesar:\nRp"+user1.transferUang(nominal,kb,na2));
                                 System.out.println("Kepada no rekening :"+kb+"-"+na2);
                            }
                            else{
                                System.out.println("Saldo anda tidak mencukupi");
                            }
                        }
                        else{
                            System.out.println("Saldo anda tidak ada ");
                        }
                            
                        break;
                    case 4 :
                        System.out.println("Point Anda :"+user1.getPoint());
                        break;
                    case 5 : 
                        System.out.println("\nExit");
                        System.exit(0);
                        break;
                        
                    default : 
                        System.out.println("Menu tidak tersedia");
                }
                    System.out.println("==========================");
                
                    System.out.print("Pilih lagi ?(y/n)");
                    pi = in.next();
                    
                    if(pi.equalsIgnoreCase("n"))
                        cek = false;
                    else
                        cek = true;
                
                }while(cek!=false);    
            }
            
            else{
                cekk++;
                if (cekk <3)
                    System.out.println("Nomor Akun & PIN anda SALAH\nSilahkan Coba Lagi\n");
                
                else if (cekk == 3){
                    System.out.println("Nomor Akun & PIN anda SALAH\nAnda sudah 3 kali salah, akun anda di blokir");
                    cek = false;
                }
            }
        }while(cek!=false);
    }
}
