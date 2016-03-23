package constructor2;
import java.util.Scanner;
public class mainATM {
    public static void main (String[]args){
        ATM A = new ATM();
        Scanner i = new Scanner (System.in);
        System.out.println("//////////////////////////////////////");
        System.out.println("Selamat datang di ATM Bank A-Bank");
        System.out.println("//////////////////////////////////////");
        String PIN = A.getPin(); 
        System.out.print("Silahkan masukkan pin anda (6 digit): ");
        String p = i.next();
        System.out.println("================================");
        int choose, jumlah;
        if (PIN.equals(p)){
            do{
                System.out.println("PILIH MENU DIBAWAH INI");
                System.out.println("========================");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Transfer");
                System.out.println("4. Cek Poin");
                System.out.println("5. Keluar");
                System.out.println("========================");
                System.out.print("Pilihan anda: ");
                choose = i.nextInt();
                switch(choose){
                    case 1:{
                        System.out.println("Saldo anda saat ini adalah Rp"+A.Saldo());break;
                    }
                    case 2:{
                        System.out.println("Masukkan nominal tarik tunai");
                        System.out.print("Rp");
                        jumlah = i.nextInt();
                        A.setTarik(jumlah);
                        System.out.println("Penarikan berhasil.");break;
                    }
                    case 3:{
                        System.out.println("Pilih jenis transfer dibawah ini:");
                        System.out.println("1. Transfer sesama Bank A-Bank");
                        System.out.println("2. Transfer ke Bank lain");
                        System.out.print("Pilih: ");
                        int pilihtrf = i.nextInt();
                        switch(pilihtrf){
                            case 1:{
                                System.out.println("Transfer sesama Bank A-Bank");
                                System.out.print("Masukkan nomor rekening tujuan: ");
                                String noRekTjn = i.next();
                                System.out.print("Masukkan nominal transfer Rp");
                                jumlah = i.nextInt();
                                A.setTrfs(jumlah);
                                if(jumlah>250000){
                                    A.setPoint(10);
                                    System.out.println("Anda berhak mendapatkan 10 poin untuk transaksi ini.");
                                }else{
                                    System.out.println(" ");
                                }break;
                            }
                            case 2:{
                                System.out.println("Transfer ke Bank lain");
                                System.out.print("Masukkan nomor rekening tujuan: ");
                                String noRekTjn = i.next();
                                System.out.print("Masukkan nominal transfer Rp");
                                jumlah = i.nextInt();
                                A.setTrfa(jumlah);
                                System.out.println("Transaksi dikenakan biaya admin Rp5.000,-");break;                            
                            }
                        };break;
                    }
                    case 4:{
                        System.out.println("Total poin anda saat ini adalah "+A.getPoint()+"poin.");break;
                    }
                    case 5:{
                        System.out.println("Terima kasih telah menggunakan jasa ATM kami.");
                        System.out.println("Jangan meninggalkan ATM sebelum mengambil kartu anda.");break;
                    }
                    default:
                        System.out.println("PILIHAN TIDAK TERSEDIA.");break;
                }
            }while(choose!=5);    
        }else{
            System.out.println("PIN yang anda masukkan salah.");
        }
    }    
}