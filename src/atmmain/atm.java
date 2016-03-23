package atmmain;
public class atm {
    private String password;
    private int saldo, transfer, tarik;
    protected int bonus=0;
    public atm( String password){
        this.password=password;     
    }
    public String getPassword(){
        
        return password;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setTransfer(int transfer) {
        this.transfer = transfer;
        if (transfer>=250000)
            bonus+=10;
    }
    public void setTarik(int tarik) {
        this.tarik = tarik;
    }
    public int getTransfer(){
        this.saldo=saldo-transfer;
        
        return saldo;
    }
    public int getTarik(){
        this.saldo=saldo-tarik;
        
        return saldo;
    }
     public int getSaldo() {
        return saldo;
    }
    public void displayMessage(){
    System.out.println("Saldo anda "+saldo);
    }
    
}
