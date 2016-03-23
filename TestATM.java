/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

import java.util.Scanner;
public class TestATM {
       public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    int pilih;
    int pilihBank;
    int norek = 0;
    int uang = 0;
    String namabank = "";
    String back;

    

    ATM Modul2 = new ATM();  

    Modul2.cekPasword();

    int i = 0;
    do{
    System.out.println("--- pilihan menu ---");
    System.out.println("1. penarikan ");
    System.out.println("2. informasi saldo");
    System.out.println("3. transfer");
    System.out.println("4. cek point");
    System.out.println("5. keluar");

    System.out.print("masukan pilihan anda         : ");
    pilih = input.nextInt();

    if (pilih == 1)
        Modul2.penarikan();
    else if (pilih == 2)
        Modul2.infoSaldo();
    else if (pilih == 3){
        System.out.println("--- pilih bank ---");
        System.out.println("1. bank yang sama");
        System.out.println("2. bank yang berbeda");
        System.out.print("masukan pilihan anda      : ");
        pilihBank = input.nextInt();
            if (pilihBank == 1){
                Modul2.transfer(norek, uang);
            }if (pilihBank == 2){
                Modul2.transfer(norek, uang, namabank);
            }    
    }else if (pilih == 4){
     Modul2.Point();
    }else if (pilih == 5){
        System.out.println("Terimakasih atas kunjungan anda");
        break;
    }else{
        System.out.println("Maaf menu tidak tersedia");
    }
    System.out.print("apakah anda ingin bertransaksi lagi [ya/tidak] : ");
    back = input.next();
    i++;
    }
    while (back.equals("ya") || back.equals("Ya"));
    } 
}
