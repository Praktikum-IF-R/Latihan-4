package machine;
public class Machine {
    private int PIN;
    private String nama;
    private int balance;
    private int rek,z;
    private int point;
    public Machine(){
        PIN=0;
        nama="";
        balance=0;
        rek=0;
    }
    public Machine(int p, String n, int b, int r){
        PIN = p;
        nama =n;
        balance =b;
        rek=r;
    }
    public boolean cekRek(Machine A,int p){
        boolean hasil = false;
        if(A.PIN==p)
            hasil=true;
        else{
            hasil=false;}
        return hasil;
    }
    public void cekSaldo(){
        System.out.println("saldo anda");
        System.out.println("Rp. "+balance);
    }
    public void tarikTunai(int r){
        if(balance>r&&balance>50000){
        balance-=r;
        System.out.println("sisa saldo anda");
        System.out.println("Rp. "+balance);}
        else
        System.out.println("saldo anda kurang untuk memenuhi transaksi ini");
    }
    public void Transfer(Machine A,int r){
        if(balance>r&&balance>50000){
        balance-=r;
        A.balance+=r;
        System.out.printf("%-25s\n%-10d\n%-5s\n%-10s\n%-10s\n%-10d\n","Trasfer ke rekening ",A.rek,"A/N",A.nama,"sejumlah",r);}
        else
        System.out.println("saldo anda kurang untuk memenuhi transaksi ini");
    }
    public void setPoint(int p){
        point+=p;
    }
    public int getPoint(){
        return point;
    }
}