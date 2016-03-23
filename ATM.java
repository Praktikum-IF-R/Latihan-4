package latihan4;
public class ATM {
    private int pin;
    private int point=0;
    private int kodebank;
    private long saldo = 2000000;
    private long tarik;
    private long transfer;
    private boolean password = false;
    public ATM(int p, long s){
        pin = p;
        saldo = s;
        System.out.println("===================================");
    }
    public void ceksaldo(){
        System.out.println("Saldo anda sebesar: "+saldo);
        System.out.println("==========================");
    }
    public void cekpass(int s){
        if(s!=pin){
           System.out.println("Maaf pin anda salah");
        }
       else {
            password = true;
        }   
    }
    public boolean getpass(){
        return password;
    }
    public void transfer(int r, long t,int k){
        kodebank=k;
        transfer=t;
        if (transfer<saldo){
           saldo=saldo-transfer;
           System.out.println("Transaksi anda berhasil.");
           System.out.println("========================");
           point();
        }
        else{
            System.out.println("Saldo anda tidak mencukupi");
            System.out.println("==========================");
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
            System.out.println("Transaksi anda berhasil. Silahkan ambil uang anda");
            System.out.println("=================================================");
        }
        else{
           System.out.println("Saldo anda tidak mencukupi");
            System.out.println("=========================");
        }
   }  
    private void point(){
        int a=(int) (transfer/250000);
        
        if(kodebank==17&&a!=0){
            point = point+(10*a);
        }
    }
    protected int getpoint(){
        return point;
        }
      }
    
    
