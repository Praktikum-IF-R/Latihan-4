package ATM;
import java.util.Scanner;
public class MainImplementasiATM {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        int saldo;
        int pin;
        implementasiATM mesin = new implementasiATM();
        mesin.setPw(007);
        mesin.setSaldo(10000000);
        System.out.print("Masukkan PIN : ");
        pin = input.nextInt();
        do{
            if(pin == mesin.getPw()){
                System.out.println("1. Cek Saldo");
                System.out.println("2. Penarikan Uang");
                System.out.println("3. Transfer ");
                System.out.println("4. Cek poin");
                System.out.println("5. Selesai");
                System.out.print("Masukkan Pilihan : ");
                pilihan = input.nextInt();
                switch(pilihan){
                    case 1:
                        System.out.println("Saldo Anda : Rp "+mesin.getSaldo());
                        System.out.println("==========================");break;
                    case 2:
                        System.out.print("Jumlah Penarikan : ");
                        int tarik = input.nextInt();
                        if(tarik<mesin.getSaldo()){
                            saldo=mesin.getSaldo()-tarik;
                            mesin.setSaldo(saldo);
                            System.out.println("Sisa Saldo Anda : "+saldo);
                        }
                        else{
                            System.out.println("Saldo Tidak Mencukupi");
                        }
                        System.out.println("==========================");break;
                    case 3:
                        System.out.println("Pilih jenis transfer :");
                        System.out.println("1. Transfer sesama");
                        System.out.println("2. Transfer ke Bank lain");
                        System.out.print("Pilih: ");
                        int pilih = input.nextInt();
                        switch(pilih){
                            case 1 :
                                System.out.println("Transfer ke sesama : ");
                                System.out.println("Masukan nomer rekening tujuan : ");
                                int norek = input.nextInt();
                        System.out.print("Jumlah Transfer : Rp.");
                        int transfer = input.nextInt();
                            if(transfer<mesin.getSaldo()){
                            saldo=mesin.getSaldo()-transfer;
                            mesin.setSaldo(saldo);
                            System.out.println("Transaksi Berhasil");
                            System.out.println("Sisa Saldo Anda : "+saldo);
                        if(transfer>=250000){
                         mesin.setPoin(10);
                                    System.out.println("Anda mendapatkan 10 poin untuk transaksi ini.");
                                }
                        }
                        else{
                            System.out.println("Saldo Tidak Mencukupi");
                        }
                        System.out.println("==========================");break;
                            case 2 :
                                
                                System.out.println("Transfer bank lain : ");
                                System.out.println("Masukan nomer rekening tujuan : ");
                                int noRek = input.nextInt();
                        System.out.print("Jumlah Transfer : Rp.");
                        int trf = input.nextInt();
                            if(trf<mesin.getSaldo()){
                            saldo=mesin.getSaldo()-trf;
                            mesin.setSaldo(saldo);
                            System.out.println("Transaksi Berhasil");
                            System.out.println("Sisa Saldo Anda : "+saldo);
                        }
                        else{
                            System.out.println("Saldo Tidak Mencukupi");
                        }
                        System.out.println("==========================");break;
                    case 5:
                        System.out.println("Jangan Lupa Ambil kembali Kartu");
                        System.out.println("Terima Kasih");
                        System.out.println("==========================");break;
                }
                    default :
                        System.out.println("PILIHAN TIDAK TERSEDIA ");break;
            }
            }
            else{
                System.out.println("PIN Anda Salah");
            }
        }while(pilihan>=1 && pilihan<5);
    }
}