package atm2;
public class Atm2 {
    private int password;
    private int saldo;
    private long rekening;
    private int tarik;
    private int uangtransf;
    protected int poin = 0;
    
    public Atm2(int a){
        saldo = a;
    }

        public void menu()
    {
        System.out.println("SELAMAT DATANG DI ATM BRI");
        System.out.println("1.CEK SALDO");
        System.out.println("2.TARIK TUNAI");
        System.out.println("3.TRANSFER");
        System.out.println("4.CEK POIN");
        System.out.println("5.KELUAR");
        System.out.print("PILIHAN : ");
    }

        
    public void tampil()
    {
        System.out.println("Saldo anda sebesar : "+saldo);
    }
    
    public void transfer(long a , int b)
    {
        
        rekening = 155207222;
        if(a != rekening)
        {
            System.out.println("Rekening Salah");
        }
        else
        {
            uangtransf = b;
            saldo = saldo - uangtransf;
            System.out.println("");
            System.out.println("");
            System.out.println("Uang terkirim ke Anton Sefaro sebesar "+uangtransf);
            System.out.println("Saldo anda : "+saldo);
        }
    }
    
    public void transfer2(long a , int b , int c){
        int kode = 207;
        long rek  = 155207111;
        if(kode != c){
            System.out.println("Kode Bank Salah");
        }
        else{
            if(rek != a){
                System.out.println("Rekening Salah");
            }
            else{
                saldo = saldo - b;
                System.out.println("Uang telah terikirm ke Reza Arap sebesar : "+b);
                System.out.println("Bank Mandiri");
                System.out.println("Saldo anda : "+saldo);
            }                
        }
    }
    
    public void tarik(int a)
    {
        if(a < saldo){
        tarik = a;
        saldo = saldo - tarik;
        System.out.println("Anda telah menarik uang sebesar "+tarik);
        System.out.println("Saldo anda : "+saldo);
        }
        else
            System.out.println("Saldo Anda Tidak Cukup");
    }
    
    public int getsaldo(){
        return saldo;
    }
    
    public void setpoin(int a){
        poin = poin + a;
    }
    
    public int getpoin(){
        return poin;
    }
    
}