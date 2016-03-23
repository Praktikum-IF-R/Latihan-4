package mesinatm;
import java.util.Scanner;
public class MesinATM {
private int saldo = 10000000;
    private String nama;
    private int pasword,point;
    int inputan,penarikan,NoTransfer;
    double rek;
    public int stop = 0;
    String namaBank;
    Scanner input = new Scanner(System.in);

    public MesinATM(){
    String nm = "BRI";
    int pswd = 140814;
    pasword = pswd;
    nama = nm;
    }
    void cekPasword(){
    int a = 0;
    do{
    System.out.print("Masukan Pasword Anda : ");
    inputan = input.nextInt();
        if (a > 1){
            System.out.println("Maaf, Transaksi Anda Di Batalkan");
            System.exit(0);
        } a++;
    }
    while (inputan != pasword);
    }
    void infoSaldo(){
    System.out.println("Saldo Anda Sekarang Adalah : Rp."+saldo);
    }
    int penarikan(){
    int a = 0;
    do{
       System.out.print("Masukan Nominal Penarikan    : ");
       penarikan = input.nextInt();
       if (penarikan > saldo){
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("Silahkan Masukan Nominal Kembali");
    }
    if (penarikan < 0){
        System.out.println("Maaf Anda Tidak Memasukkan Nominal Yang Benar");
        System.out.println("Silahkan Masukkan Nominal Yang Benar");
        penarikan();
    }else {
        System.out.println("Penarikan Anda Berhasil Di Lakukan, Sebanyak : Rp." +penarikan);
        System.out.println("Terima kasih, Silahkan Ambil Uang Anda ...");
        saldo = saldo - penarikan;
    } a++;
    }
    while (penarikan > saldo);
    return saldo;
    }
    public void transfer(int norek, int jumlah){
    rek = norek;
    NoTransfer = jumlah;
    int a = 0;
    do{
    System.out.print("Masukan Nomor Rekening     : ");
    rek = input.nextDouble();
    System.out.print("Masukan Nominal Transfer   : ");
    NoTransfer = input.nextInt();
        if (NoTransfer > saldo){
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("Silahkan Masukan Nominal Yang Lebih Kecil");
        }else {
            System.out.println("Transfer Berhasil, Sebesar : Rp."+ NoTransfer);
            saldo = saldo - NoTransfer;
               
        if( NoTransfer > 250000){
        point +=10;
        System.out.println("Point Anda Bertambah "+point);
        }else{
        System.out.println("Point Anda Tidak Bertambah ");
         }
        } a++;   
    }while (NoTransfer > saldo);
}
    public void transfer(int norek, int jumlah, String nama){
    rek = norek;
    NoTransfer = jumlah;
    namaBank = nama;
    int a = 0;
    do{
    System.out.print("Masukan Nomor Rekening     : ");
    rek = input.nextDouble();
    System.out.print("Masukan Nama Bank          : ");
    nama = input.next();
    System.out.print("Masukan Nominal Transfer   : ");
    NoTransfer = input.nextInt();
        if (NoTransfer > saldo){
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("Silahkan Masukan Nominal Yang Lebih Kecil");
        }
        else {
            System.out.println("Transfer Berhasil, Sebesar : "+ NoTransfer);
            saldo = saldo - NoTransfer;
        }a++; 
    }while (NoTransfer > saldo);  
}
    public void point(int p){
        point=p;
    }
    public int getpoint(){
        System.out.println("Jumlah bonus point anda :"+point);
        return point;
}
}