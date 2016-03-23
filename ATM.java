/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class ATM {
    private int firstsaldo = 10000000;
    private String nama;
    private int pasword, pointa = 0;
    int userinput1;
    int userinput2;
    int penarikan;
    int nomtransfer;
    double rek;
    public int stop = 0;
    String namaBank;
    Scanner input = new Scanner(System.in);

    public ATM(){
    String nm = "BCA";
    int pswd = 139714;
    pasword = pswd;
    nama = nm;
    }

    void cekPasword(){

    int i = 0;
    do{
    System.out.print("masukan pasword anda : ");
    userinput1 = input.nextInt();
        if (i > 1){
            System.out.println("Maaf, transaksi anda dibatalkan");
            System.exit(0);
        }
    i++;
    }
    while (userinput1 != pasword);
    }

    void infoSaldo(){
    System.out.println("Saldo anda sekarang adalah : "+firstsaldo);
    }

    int penarikan(){
    do{
    System.out.print("Masukan nominal penarikan    : ");
    penarikan = input.nextInt();
    if (penarikan > firstsaldo){
        System.out.println("maaf, saldo anda tidak mencukupi");
        System.out.println("silahkan masukan nominal yang lebih kecil");
    }
    
    if (penarikan < 0){
        System.out.println("Maaf anda tidak memasukkan nominal yang benar");
        System.out.println("Silahkan masukkan nominal yang benar");
        penarikan();
    }
    else {
        System.out.println("penarikan berhasil, sebanyak : " +penarikan);
        System.out.println("terima kasih^^, silahkan ambil uang anda ...");
        firstsaldo = firstsaldo - penarikan;
    }
    }
    while (penarikan > firstsaldo);
    return firstsaldo;
    }

    public void transfer(int norek, int money){                 
    rek = norek;
    nomtransfer = money;
    do{
    System.out.print("masukan nomer rekening     : ");
    rek = input.nextDouble();
    System.out.print("masukan nominal transfer   : ");
    nomtransfer = input.nextInt();
        if (nomtransfer > firstsaldo){
            System.out.println("maaf, saldo anda tidak mencukupi");
            System.out.println("silahkan masukan nominal yang lebih kecil");
        }
        else {
            System.out.println("transfer berhasil, sebesar : "+ nomtransfer);
            firstsaldo -= nomtransfer;      
        }
    }
    while (nomtransfer > firstsaldo);
    }
    public void transfer(int norek, int money, String bankname){     
    rek = norek;
    nomtransfer = money;
    namaBank = bankname;

    do{
    System.out.print("masukan nomer rekening     : ");
    rek = input.nextDouble();
    System.out.print("masukan nama bank          : ");
    bankname = input.next();
    System.out.print("masukan nominal transfer   : ");
    nomtransfer = input.nextInt();
        if (nomtransfer > firstsaldo){
            System.out.println("maaf, saldo anda tidak mencukupi");
            System.out.println("silahkan masukan nominal yang lebih kecil");
        }
        else {
            System.out.println("transfer berhasil, sebesar : "+ nomtransfer);
            firstsaldo = firstsaldo - nomtransfer;
        }
    }
    while (nomtransfer > firstsaldo);
    }
    public void Point(){
        if (nomtransfer > 250000){
            pointa += 10;
            System.out.println("Jumlah point Anda sekarang : "+pointa);
        }else{
            pointa+=0;
            System.out.println("Jumlah point Anda sekarang : "+pointa);
        }
    }
    
}
