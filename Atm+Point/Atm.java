
package atm;
public class Atm{
 public Atm(){     
    }
    private String norek, pin;
    private int saldo;
    private int point;
    
    String[] kode = {"654321"};
    int[] jumlahsaldo = {10000000};  
    public void Bank(String n){
        this.norek = n;
        }  
    public void cekpin(){
        for(int i = 0; i < kode.length; i++){
            if(getPin().equalsIgnoreCase(kode[i])){
                saldo = jumlahsaldo[i];
            }
        }
    }    
    public int ceksaldo(){
        System.out.println("Saldo Anda Adalah :     "+saldo);
        return saldo;
    }   
    public int sisasaldo(int jumlahsaldo){
        if (saldo > jumlahsaldo){
            saldo = saldo-jumlahsaldo;
            System.out.println("Penarikan Berhasil  ");
            System.out.println("Sisa Saldo Anda:    "+ saldo);
        }
        else if(saldo < jumlahsaldo){
            System.out.println("Saldo Anda tidak mencukupi ");
            }
        return saldo;
        }
    public int transfer (int uang){
        if (saldo>uang){
            saldo-=uang;
            System.out.println("Transnfer berhasil ");
            System.out.println("Sisa saldo "+saldo);
        }else if (saldo<uang){
            System.out.println("Saldo tidak mencukupi ");
        }
        return this.saldo;
    }
    public String getNorek() {
        return norek;
    }
    public void setNorek(String n) {
        this.norek = n;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String p) {
        this.pin = p;
}
    public void setPoint(int c){
        this.point+=c;
    }
    public int getPoint(){
        return point;
    }
}
