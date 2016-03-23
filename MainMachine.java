package machine;
import java.util.*;
public class MainMachine {
    public static int cekTabungan(int p){
        int z=0;
        if(p==1551502001)
            z=1;
        else if(p==1551502002)
            z=2;
        else if(p==1551502003)
            z=3;
        return z;
    }
    public static void main(String [] args){
    int pilih,rek,pin,z,i=0;
    String n,pilihan="";
    String l="=================================================";
        Scanner in=new Scanner(System.in);
        Machine []nasabah=new Machine[4];
        nasabah[1]=new Machine(123456,"Yui",2000000,1551502001);
        nasabah[2]=new Machine(654321,"Toi",500000,1551502002);
        nasabah[3]=new Machine(112233,"Tori",1000000,1551502003);
    for(int q=1;;q++){
        System.out.println("insert ATM card ");rek=in.nextInt();
        z=cekTabungan(rek);
    do{System.out.println("masukkan pin ");pin=in.nextInt();
    if(nasabah[z].cekRek(nasabah[z],pin)==true){
        break;}
    else{
        System.out.println("PIN salah");i++;}
    }while (i!=3);
    if(i==3){
        continue;}
    do{System.out.println(l);
    System.out.println("Menu");
    System.out.println("1.Cek Saldo");
    System.out.println("2.Tarik Tunai");
    System.out.println("3.Trasfer");
    System.out.println("4.Cek Point");
    System.out.println(l);
    System.out.print("pilihan anda : ");pilih=in.nextInt();in.nextLine();
    switch(pilih){
        case 1:
            System.out.println(l);
            nasabah[z].cekSaldo();
            System.out.println(l);
            break;
        case 2:
            System.out.println("masukkan jumlah yang ingin diambil");int y=in.nextInt();in.nextLine();
            System.out.println(l);
            nasabah[z].tarikTunai(y);
            System.out.println(l);
            break;
        case 3:
            System.out.println("masukkan no rekening tujuan");int x=in.nextInt();
            int w=cekTabungan(x);
            System.out.println("masukkan jumlah yang akan ditransfer");y=in.nextInt();in.nextLine();
            System.out.println(l);
            if(y>=250000)
                nasabah[z].setPoint(10);
            nasabah[z].Transfer(nasabah[w], y);
            System.out.println(l);
            break;
        case 4:
            System.out.println("point anda saat ini :"+nasabah[z].getPoint());
    }System.out.print("Lakukan Transaksi lain? Y/N ");pilihan=in.nextLine();
    }while(pilihan.equalsIgnoreCase("Y"));
    }
    }
}    