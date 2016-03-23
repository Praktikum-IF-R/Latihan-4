package TUGAS1;
public class MesinATM {    
    int saldo, password,poin;
    public MesinATM(int P,int S) {
        password = P;
        saldo = S;
        poin = 0;
    }
    public void Transaksi(int T) {
        saldo -= T;
    }
    public void Transfer(int T){
        saldo+=T;
    }
    public int getSaldo(){
        return saldo;
    }
    public boolean Password(int P){
        if(P==password){
            return true;
        }else
            return false;
    }
    void setPoin(){
        poin+=10;
    }
    int getPoin(){
        return poin;
    }
}