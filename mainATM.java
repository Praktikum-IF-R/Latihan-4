package atm;

import java.util.Scanner;

public class mainATM {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner a = new Scanner (System.in);
        int pil;
        String pil2 = "Y";
            ATM atm1 = new ATM();
            do{
                System.out.print("Masukkan pin Anda : ");
                atm1.setpin(in.next());
                atm1.cekpin();
                System.out.println("");
                    System.out.println("SELAMAT DATANG DI BANK MANDIRI");
                    System.out.println("Menu ATM : ");
                    System.out.println("1. Melihat Saldo ");
                    System.out.println("2. Menarik Uang ");
                    System.out.println("3. Transfer Uang ");
                    System.out.print("Pilihan Anda : ");
                    pil = in.nextInt();
                    switch (pil){
                        case 1 :
                            System.out.println("Jumlah Saldo Anda : "+atm1.ceksaldo());
                            System.out.println("");
                            System.out.println("Apakah Anda ingin melakukan transaksi lagi ? ");
                            pil2 = a.nextLine();continue;
                        case 2 : {
                            System.out.print("Masukkan nominal Uang : ");
                            atm1.setpenarikan(in.nextInt());
                            if (atm1.getpenarikan() <= atm1.ceksaldo()){
                                System.out.println("Silahkan ambil uang Anda ");
                                System.out.println("");
                            }
                            else{
                                System.out.println("Saldo Anda tidak mencukupi ");
                            }
                            System.out.println("Apakan Anda ingin melakukan transaksi lagi ? ");
                            pil2 = a.nextLine();continue;}
                        case 3 :{
                            System.out.print("BANK tujuan Anda : ");
                            atm1.setnama(a.nextLine());
                            System.out.print("Masukkan rekening tujuan Anda :  ");
                            atm1.settransfer(a.nextLine());
                            System.out.print("Masukkan nominal : ");
                            atm1.setpenarikan(in.nextInt());
                            if (atm1.getpenarikan() <= atm1.ceksaldo()){
                                atm1.display();
                                System.out.println("jumlah poin anda adalah : "+atm1.getpoin());
                            }
                            else{
                                System.out.println("Saldo Anda tidak mencukupi untuk melakukan transfer");
                            }
                            
                            System.out.println("");
                            System.out.println("Apakan Anda ingin melakukan transaksi lagi ? ");
                            pil2 = a.nextLine();continue;}  
                    }
            } while (pil2.equalsIgnoreCase("Y"));
            }
  }
    

