package atm;

public class ATM {
    private String pin;
    private int penarikan;
    private int saldo;
    private String transfer;
    private String cekpin;
    private int point;
    private String nama;
    
    public ATM(){   
    }
    public void setpin (String p){
        this.pin = p;}
    public String getpin (){
        return pin;}
    public void setpenarikan (int t){
        penarikan = t;}
    public int getpenarikan (){
        return penarikan;}
    public void settransfer (String tr){
        this.transfer = tr;}
    public String gettransfer (){
        return transfer;}
    public int ceksaldo (){
        return saldo;}
    String [] pin2 = {"280598"};
    int [] saldo2 = {1000000};
    public void cekpin (){
        for (int i = 0; i < pin2.length; i++){
            if (getpin().equalsIgnoreCase(pin2[i])){
                saldo = saldo2[i];}
        } 
    }
       public void setnama(String n){
        this.nama = n;
    }
       public String getnama(){
           return nama;
       }
       public void setpoin(){
           this.point=0;
       }
    public int getpoin(){
        if (getpenarikan()>250000 && nama.equalsIgnoreCase("MANDIRI")){
            point+=10;
            return point;
        }
        else
            point +=0;
        return point;
    }
    public void display(){
        System.out.println("");
        System.out.println("Anda mentransfer uang ke BANK : "+nama);
        System.out.println("Dengan nomor rekening : "+transfer);
        System.out.println("Sebesar : "+penarikan);}
}
