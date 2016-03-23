package constructor2;
public class ATM {
    private String PIN;
    private int tarik = 0;
    private int trfs = 0;
    private int trfa = 0;
    private int point;
    public int saldo = 1000000;
    public ATM(){
        PIN = "123456";
    }
    public String getPin(){
        return PIN;
    }
    public int Saldo(){
        return saldo;
    }
    public void setTrfs(int trf){
        if(saldo>trf){
            saldo = saldo - trf;
            System.out.println("Transfer berhasil.");
        }else{
            System.out.println("Saldo anda tidak mencukupi.");
        }
    }
    public void setTrfa(int trf){
        if(saldo>trf){
            saldo = saldo - (trf+5000);
            System.out.println("Transfer berhasil.");
        }else{
            System.out.println("Saldo anda tidak mencukupi.");
        }
    }
    public void setTarik(int t){
        if(saldo>t){
            saldo = saldo - t;
            System.out.println("Penarikan berhasil dilakukan.");
        }else{
            System.out.println("Saldo anda tidak mencukupi.");
        }
        tarik = t;
    }
    public int getTarik(){
        return tarik;
    }
    public void setPoint(int p){
        this.point += p; 
    }
    public int getPoint(){
        return point;
    }
}