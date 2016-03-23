package mesinatm;
import java.util.Scanner;
public class MainATM {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    int pilih,pilihBank,numb = 0,fulus = 0;
    String NmBank = "";
    String kembali;

    System.out.println("-- Selamat Datang DI Bank BRI --");
    MesinATM M2 = new MesinATM();    //instansiasi objek class MesinATM
    M2.cekPasword();
    
    int a = 0;
    do{
    System.out.println("=============================================");
    System.out.println("--- Pilihan Menu ---");
    System.out.println("1. Informasi Saldo");
    System.out.println("2. Penarikan");
    System.out.println("3. Transfer");
    System.out.println("4. Lihat Bonus point");
    System.out.println("5. Keluar");
    System.out.print("Masukan Pilihan Anda         : ");
    pilih = input.nextInt();

    if (pilih == 1)
        M2.infoSaldo();
    else if (pilih == 2)
        M2.penarikan();
    else if (pilih == 3){
        System.out.println("--- Pilih Bank ---");
        System.out.println("1. Bank BRI");
        System.out.println("2. Bank Lain");
        System.out.print("Masukan Pilihan Anda      : ");
        pilihBank = input.nextInt();
            if (pilihBank == 1){
                M2.transfer(numb, fulus);
            }if (pilihBank == 2){
                M2.transfer(numb, fulus, NmBank);
            }else{
               System.out.println("Transaksi Berhasil");
            }    
    }else if(pilih == 4){
    M2.getpoint();
    }else if (pilih == 5){
        System.out.println("Trimakasih atas kunjungan anda");
        break;
    }else{
        System.out.println("Maaf Menu Tidak Tersedia");
    }
    System.out.print("Apakah Anda Ingin Bertransaksi Lagi [y/n] : ");
    kembali = input.next();
    a++;
    }
    while (kembali.equals("y") || kembali.equals("Y"));
    System.out.println("---Terimakasih Telah Menggunakan ATM BRI---");
    }
    }
