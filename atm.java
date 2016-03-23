package praktikum2;
public class atm {
    private int pin,poin=0,kodebank;
    private long saldo,tarik,transfer;
    private boolean password=false;
    public atm(int n, long i){
        pin=n;
        saldo=i;
        System.out.println("===================================");
    }
    public void ceksaldo(){
        System.out.println("saldo anda sebesar: "+saldo);
        System.out.println("=======================");
    }
    public void cekpass(int i){
        if(i!=pin){
            System.out.println("maaf pin salah");
        }
        else {
            password = true;
        }   
    }
    public boolean getpass(){
        return password;
    }
    public void transfer(int r, long t,int y){
        kodebank=y;
        transfer=t;
        if (transfer<saldo){
            saldo=saldo-transfer;
            System.out.println("transaksi berhasil.");
            System.out.println("=======================");
            poin();
        }
        else{
            System.out.println("saldo tidak mencukupi");
            System.out.println("=======================");
        }
    }
    private int getkodebank(){
        return kodebank;
    }
    private long gettransfer(){
        return transfer;
    }
    public void tarik(long t){
        if (tarik<saldo){
            saldo=saldo-tarik;
            System.out.println("transaksi berhasil. silahkan ambil uang anda");
            System.out.println("======================================");
        }
        else{
            System.out.println("saldo tidak mencukupi");
            System.out.println("=======================");
        }
    }  
    private void poin(){
        int a=(int) (transfer/250000);
        
        if(kodebank==17&&a!=0){
            poin=poin+(10*a);
        }
    }
    protected int getpoin(){
        return poin;
    }
}
