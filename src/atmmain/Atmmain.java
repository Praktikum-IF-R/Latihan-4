package atmmain;
import java.util.Scanner;
public class Atmmain {
 public static void main(String[] args) {
        int tarik=0, menu,x=0;
        Scanner inp = new Scanner(System.in);
        atm nasabah1 = new atm("010996");
        for(int i=0; i<=2; i++){
        System.out.print("Password : ");
        String pass = inp.next();
        if (pass.equals(nasabah1.getPassword())){
            i=3;
            x=i;
        }
        else{
            System.out.println("Password salah");
            x=i;
        }
        }
        switch(x){
        case 3:
        nasabah1.setSaldo(15000000);
        do{
        System.out.println("==================");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Uang");
        System.out.println("3. Transfer");
        System.out.println("0. Keluar");
        System.out.print("Pilih Menu : ");
        menu = inp.nextInt();
        switch(menu){
            case 1: System.out.println("Sisa Saldo anda Rp "+nasabah1.getSaldo());
                    break;
            case 2: do{
                        System.out.println("Tarik Uang tunai 50.000/100.000/200.000/500.000 ?");
                        tarik = inp.nextInt();                  
                    }while(tarik>nasabah1.getSaldo());
                    
                        nasabah1.setTarik(tarik);
                        nasabah1.getTarik();
                        System.out.println("Sisa saldo anda : Rp "+nasabah1.getSaldo()); 
                                        
                    
                    break;
            case 3: System.out.print("Rekening Penerima : ");
                    int rek = inp.nextInt();
                    System.out.print("Jumlah transfer : ");
                    int trf = inp.nextInt();
                    if(trf>=nasabah1.getSaldo()){
                        System.out.println("Saldo tidak mencukupi");
                    }else{
                        nasabah1.setTransfer(trf);
                        nasabah1.getTransfer();
                        System.out.println("Transfer Berhasil");
                        System.out.println("Sisa saldo anda : Rp "+nasabah1.getSaldo());
                    }
                    break;
            case 0: System.out.println("Silahkan Ambil Kartu Anda");
                    System.exit(0);
                   
            default:System.out.println("Pilihan tidak tersedia");
        }
        int bonus = nasabah1.bonus;
        System.out.println("Total bonus: "+bonus);
        }while(menu!=0);
                break;
        case 2:
                System.out.println("Atm terblokir");
                break;
        }
    }
}
