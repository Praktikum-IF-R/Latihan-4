package Constructor;
public class ATM {
    private int bonus;
    private int poin;
    String noRek;
    private int tarik;
    int saldo;
    public ATM(){
        saldo = 0;
        bonus = 0;
        noRek = "";
    }
    public ATM (String noRek,int a,int c){
        this.noRek = noRek;
        saldo = a;
        bonus = c;
    }
    public void tarik (int a){
        saldo  = saldo - a;
    }
    public void transfer (int a,String c){
        saldo = saldo - a;
        Bonus(a,c);
    }
    public int getBonus(){
        return bonus;
    }
    
    public int Bonus(int a, String c){
        bonus = 0;
            if(c.equalsIgnoreCase("BNI")){
                if(a>=250000){
                    bonus = bonus+10;
                    
                }
                else{
                    bonus = bonus;
                }
            }
            return bonus;
    }
    public void BonusNow(){
        poin += bonus;
        System.out.println("Poin anda sekarang adalah   \t:"+poin);
        
    }
    
}
    

