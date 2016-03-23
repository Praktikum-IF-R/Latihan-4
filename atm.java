import java.util.Scanner;
public class atm {
private int saldo,point,penarikan,uang,transfer;
private String pin;
    public atm(String pin) {
        this.pin=pin;
    }
public boolean cekpin(){
     Scanner ew = new Scanner(System.in);
        System.out.println("|               WELCOME TO ATM BRI                   |");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan password Anda: ");
        String pws=ew.next();
        boolean c = false;
        if (pin.equalsIgnoreCase(pws)){
            c=true;
        }
        else{ 
            c=false;
        }
        return c;
}
public void setSaldo(int saldo){
    this.saldo=saldo;
}
public int getSaldo (){
    return saldo;
}

public void setpenarikan(int s){
    saldo -= s;
    
}

public void penarikan ()
{
    Scanner ew= new Scanner (System.in);
    System.out.print("Masukkan jumlah penarikan: ");
    int penarikan= ew.nextInt();
    setpenarikan(penarikan);
    getSaldo();
    getpenarikan();
    if (penarikan > saldo)
    {    System.out.println("Maaf, saldo anda tidak mencukupi untuk melakukan penarikan");}
    else
    {    System.out.println("Anda telah melakukan penarikan sebesar "+penarikan);
    }
    uang=saldo;
}
public int getpenarikan(){
    
    return uang;
}

public void ceksaldo(){
    System.out.println("Saldo di rekening anda saat ini: Rp "+saldo);
}
public void transfer(){
      Scanner wew = new Scanner (System.in);
    System.out.print("Masukkan bank tujuan anda: ");
    String nama= wew.next();
    System.out.print("Masukkan rekening tujuan: ");
    int rekening= wew.nextInt();
    System.out.print("Masukkan jumlah uang yang di transfer: Rp ");
    int money= wew.nextInt();
    settransfer(money);
    getSaldo();
    gettransfer();
    if (saldo>money){
        saldo-=money;
        transfer=saldo;
    System.out.println("Anda telah melakukan transaksi sebesar Rp "+ money +" kepada nomor rekening " + rekening + " pada Bank " + nama);    
}
else{ 
    System.out.println("Maaf, saldo anda tidak mencukupi untuk melakukan transaksi! ");
}
}
public void settransfer(int money){
  saldo-=money;
}
public int gettransfer(){
    return transfer;
}
public void cekpoint(){
    setcekpoint(transfer);
}
public void setcekpoint(int money){
   if (money>=250000)
        point=10;
    System.out.println("Point anda: "+point);
}
public int getcekpoint(){
    return point;
}
}



