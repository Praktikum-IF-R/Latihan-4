package mainatm;
import java.util.Scanner;
public class MainATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        int saldo;
        int pin;
        ATM nasabah = new ATM();
        nasabah.setPIN(789831);
        nasabah.setSaldo(10000000);
        System.out.print("Masukkan PIN : ");
        pin = input.nextInt();
        do{
            if(pin == nasabah.getPIN()){
                System.out.println("1. Lihat Saldo");
                System.out.println("2. Penarikan Uang");
                System.out.println("3. Transfer");
                System.out.println("4. Cek Poin");
                System.out.println("5. Keluar");
                System.out.print("Masukkan Pilihan : ");
                pilihan = input.nextInt();
                switch(pilihan){
                    case 1:
                        System.out.println("Saldo Anda : Rp "+nasabah.getSaldo());
                        System.out.println("==========================");break;
                    case 2:
                        System.out.print("Jumlah Penarikan : ");
                        int trk = input.nextInt();
                        if(trk<nasabah.getSaldo()){
                            saldo=nasabah.getSaldo()-trk;
                            nasabah.setSaldo(saldo);
                            System.out.println("Sisa Saldo Anda : "+saldo);
                        }
                        else{
                            System.out.println("Saldo Tidak Mencukupi");
                        }
                        System.out.println("==========================");break;
                    case 3:
                        System.out.println("1. Transfer ke Bank yang sama");
                        System.out.println("2. Transfer ke Bank lain");
                        System.out.print("Masukkan Pilihan : ");
                        int pilih = input.nextInt();
                        switch(pilih){
                            case 1:
                                System.out.print("Masukkan Rekening Tujuan : ");
                                int rek1 = input.nextInt();
                                System.out.print("Jumlah Transfer : ");
                                int trf1 = input.nextInt();
                                if(trf1<nasabah.getSaldo()){
                                    saldo=nasabah.getSaldo()-trf1;
                                    nasabah.setSaldo(saldo);
                                    System.out.println("Transfer Berhasil");
                                    System.out.println("Sisa Saldo Anda : "+saldo);
                                    int bonus = trf1/250000;
                                    if(bonus>0){
                                        nasabah.setPoin(bonus);
                                    }
                                }
                                else{
                                    System.out.println("Saldo Tidak Mencukupi");
                                }
                                System.out.println("==========================");break;
                            case 2:
                                System.out.print("Masukkan kode bank : ");
                                int kode = input.nextInt();
                                System.out.print("Masukkan Rekening Tujuan : ");
                                int rek2 = input.nextInt();
                                System.out.print("Jumlah Transfer : ");
                                int trf2 = input.nextInt();
                                if(trf2<nasabah.getSaldo()){
                                    saldo=nasabah.getSaldo()-trf2;
                                    nasabah.setSaldo(saldo);
                                    System.out.println("Transfer Berhasil");
                                    System.out.println("Sisa Saldo Anda : "+saldo);
                                }
                                else{
                                    System.out.println("Saldo Tidak Mencukupi");
                                }
                            }
                    case 4:
                        System.out.println("Jumlah Poin Anda : "+nasabah.getPoin());break;
                    case 5:
                        System.out.println("Jangan Lupa Ambil Kartu Anda");
                        System.out.println("Terima Kasih");
                        System.out.println("==========================");break;
                }
            }
            else{
                System.out.println("PIN Anda Salah");
            }
        }while(pilihan>=1 && pilihan<5);
    }
}