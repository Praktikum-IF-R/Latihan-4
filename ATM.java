package mainatm;
public class ATM {
    private String rek;
    private int saldo, jmltr, tariksaldo;
    private int point = 0;
    
    public void setSaldo(int m){
        saldo = m;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void cekSaldo(){
        System.out.println("Saldo Anda          : Rp "+saldo);
    }
    
    public void Transfer(String r, int s){
        rek = r;
        jmltr = s;
        //sisa saldo
        if (jmltr < saldo){
            saldo = saldo - jmltr;
            System.out.println("Saldo Anda          : Rp "+saldo);
        }
        else
            System.out.println("Saldo Anda Tidak Mencukupi");
        
        //menghitung point yg didapat
        if (jmltr >= 250000)
            hitungpoint();
        else
            System.out.println("Point Anda saat ini : "+point);
    }
    
    public void tarikTunai(int ts){
        tariksaldo = ts;
        if (tariksaldo < saldo){
            saldo = saldo - tariksaldo;
            System.out.println("Saldo Anda              : Rp "+saldo);
            System.out.println("");
        }
        else
            System.out.println("Saldo Anda Tidak Mencukupi");
    }
    
    private void hitungpoint(){
        point = point + 10;
        System.out.println("Point Anda saat ini : "+point);
    }
}