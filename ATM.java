package mainatm;
public class ATM {
    private int pin;
    private int saldo;
    private int poin;
    public ATM(){
        pin = 0;
        saldo = 0;
        poin = 0;
    }
    public void setPIN(int p){
        pin = p;
    }
    public void setSaldo(int s){
        saldo = s;
    }
    public int getPIN(){
        return pin;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setPoin(int a){
        poin+=10*a;
    }
    public int getPoin(){
        return poin;
    }
}