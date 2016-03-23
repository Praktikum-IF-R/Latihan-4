package Praktik04;
public class atm {
    private double saldo;
    private String pin;
    private int poin;
    
    public atm(){
        saldo = 0;
        pin = "Belum Ditentukan";
        poin = 0;
    }
    public void setData(String a, double b, int c){
        saldo = b;
        pin = a;
        poin = c;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getPin(){
        return pin;
    }
    public int getPoin(){
        return poin;
    }
    public void Transfer(int a, String b){
        if(a<=saldo){
        saldo = saldo-a;
        }
        else{
            System.out.println("Maaf nominal uang yang ingin ditransfer terlalu banyak.");
        }
        poinPoin(a, b);
    }
    public void Tarik(int a){
        if(a<=saldo){
            saldo = saldo-a;
        }
        else{
            System.out.println("Maaf nominal uang yang ingin diambil terlalu banyak.");
        }
    }
    private void poinPoin(int a, String b){
        if(b.equalsIgnoreCase("BRI")){
            if(a>=250000){
            poin += 10;
            }
            else{
            poin = poin;
            }
        }
        else{
            poin = poin;
        }
    }
}