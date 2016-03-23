package Encapsulation;
public class SoalATM {
    String user;
    int pass, PIN;
    int depo, tarik, transfer, i;
    private static int saldo = 0;
    private int point = 0;
    String rekening;
    public SoalATM(String use ,int pas,int pin) {
        user = use;
        pass = pas;
        PIN = pin;
    }
    public void Deposit(int dep) {
        depo = dep;
        saldo += depo;
    }
    public void Tarik(int tar) {
        tarik = tar;
        if (tarik > saldo) {
            System.out.println("Saldo anda tidak mencukupi");
        } else {
            saldo -= tarik;
            System.out.println("anda telah menarik uang sebesar " + tarik);
            System.out.println("sisa saldo anda " + saldo);
        }
    }
    public void Transfer(String rek, int tran) {
        rekening = rek;
        transfer = tran;
        if (transfer > saldo) {
            System.out.println("saldo anda tidak mencukupi untuk transfer");
        } else {
            System.out.println("Anda telah mentranfer ke rek " + rekening + " sebesar " + transfer);
            saldo -= transfer; 
        }
    }
    public void getPoint(int tran){
        if(tran>=250000&&tran<=saldo+tran){
            point+=10;
            System.out.println("Anda mendapatkan point 10");
            System.out.println("point anda sekarang "+point);
        }else {
            System.out.println("Anda tidak mendapat point");
        }
    }
    public void ceksaldo() {
        System.out.println("Saldo anda sekarang : " + saldo);
    }
    public void cekpoin(){
        System.out.println("Total point         : " + point);
    }
    public void menu() {
        System.out.println("1. Deposit");
        System.out.println("2. Cek Saldo");
        System.out.println("3. Cek Point");
        System.out.println("4. Ambil Uang");
        System.out.println("5. Transfer uang");
        System.out.println("6. Keluar");
    }
}