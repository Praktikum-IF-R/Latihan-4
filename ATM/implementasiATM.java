package ATM;
public class implementasiATM {
    private int pin;
    private int saldo;
    private int poin;
    public implementasiATM(){
        pin = 0;
        saldo = 0;
    }
    public void setPw(int p){
        pin = p;
    }
    public void setSaldo(int s){
        saldo = s;
    }
    public int getPw(){
        return pin;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setPoin(int p){
        this.poin += p;
    }
    public int getPoin(){
        return poin;
    }
}