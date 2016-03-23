package mainatm;

/**
 *
 * @author Acer-pc
 */
public class User {
    private int nomorAkun;
    private int pin;
    private int saldo;
    private int point;/*private instance variabel yang digunakan untuk menyimpan point*/
    
    public User(){
        nomorAkun = 0;
        pin = 0;
        saldo = 0;
    }
    
    public User(int na, int p,int s){
        nomorAkun = na;
        pin = p;
        saldo = s;
    }
    
    public boolean cekpassword(int na, int p){
       boolean cek;
       if(na == nomorAkun && p ==pin)
           cek = true;
       else
           cek = false;
       
       return cek;
    }
    
    public void setNomorAkun(int na){
         nomorAkun = na;
    }
    
    public int getNomorAkun(){
        return nomorAkun;
    }
    
    
    public void setPin(int p){
         pin = p;
    }
    
    public int getPin(){
        return pin;
    }
    
    /*
    method getPoint yang berfungsi sebagai accessor untuk mengambil
    dan membalikan nilai point
    */
    public int getPoint(){
        return point;
    }
    
    public void setSaldo(int s){
         saldo = s;
    }
    
    public int liatSaldo(){
        return saldo;
    }
    
    public int ambilUang(int uang){
        
        saldo -= uang;
        
        return uang;
    }
    
    public int transferUang(int uang,int kb, int na){
        
        /*
        point didapatkan apabila melakukan transfer dengan syarat
        nominal uang yang ditransfer sebesar 250000 dan kepada bank
        yang sama
        */
        
        /*
        dimisalkan 150 merupakan kode bank yang sama yang digunakan
        oleh user yang melakukan transfer
        */
        
        if(uang >= 250000 && kb==150){
            point+=10;
            saldo-=uang;
        }
        
        else
            saldo-=uang;
        
        return uang;
    }
    
}
