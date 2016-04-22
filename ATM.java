package praktikum2;

public class ATM {

    private int pin, poin = 0, codebank;
    private long saldo, tarik, transfer;
    private boolean password = false;

    public ATM(int i, long l) {
        pin = i;
        saldo = l;
        System.out.println("||||||||||||||||||||||||||||");
    }

    public void cekSaldo() {
        System.out.println("saldo anda sebesar : " + saldo);
        System.out.println("||||||||||||||||||||||||||||");
    }

    public void cekPass(int l) {
        if (l != pin) {
            System.out.println("Pin anda salah");
        } else {
            password = true;
        }
    }

    public boolean getPass() {
        return password;
    }

    public void transfer(int r, long t, int y){
    codebank = y;
        transfer = t;
        if (transfer < saldo) {
            saldo = saldo - transfer;
            System.out.println("Transaksi berhasil.");
            System.out.println("|||||||||||||||||||");
            poin();

        } else {
            System.out.println("Saldo tidak cukup");
            System.out.println("|||||||||||||||||");
        }

    }
    private int getcodebank(){
        return codebank;
    }
    private long getTransfer(){
        return transfer;
    }
    public void tarik(long t){
        if(tarik<saldo){
            saldo=saldo-tarik;
            System.out.println("transaksi berhasil");
            System.out.println("||||||||||||||||||");
        }
        else{
            System.out.println("saldo tidak mencukupi");
            System.out.println("|||||||||||||||||||||");
        }
}
    private void poin(){
        int a=(int)(transfer/250000);
        if(codebank==17&&a!=0){
            poin=poin+(10*a);
        }
        protected int getpoin(){
            return poin;
        }
    }
    
    
    
    
    
    
