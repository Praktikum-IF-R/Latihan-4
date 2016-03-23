 package ATM3;
import java.util.*;
class mainATM {
    static int banyak;
    static final ATM user[] = new ATM[19];
    int ini;
    double nominal;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan banyak nasabah terlebih dahulu (minimal 2) (max 19): ");
        banyak = in.nextInt();
        for (int i = 0; i < banyak; i++) {
            user[i] = new ATM();
            System.out.print("nama : ");
            String nama = in.nextLine();
            nama = in.nextLine();
            user[i].setNama(nama);
            System.out.print("pass : ");
            String pass = in.nextLine();
            user[i].setPass(pass);
            System.out.print("saldo : ");
            double saldo = in.nextDouble();
            user[i].setSaldo(saldo);
            user[i].setNomorRek(i);
            user[i] = new ATM(user[i].nama, user[i].pass, user[i].saldo, user[i].nomorRek);
            System.out.println("nomor rek anda :" + (int) user[i].nomorRek);
            System.out.println("====================================");
        }
        System.out.print("masukkan PIN : ");
        String PIN = in.nextLine();
        PIN = in.nextLine();
        for (int i = 0; i < banyak; i++) {
            if (PIN.equalsIgnoreCase(user[i].pass)) {
                boolean t = true;
                while (t) {
                    user[i].screenMenu();
                    System.out.println("pilih : ");
                    int pilih = in.nextInt();
                    user[i].pilih(pilih);
                    t = user[i].t;
                }
            }
        }
    }
    int cari(int nomor) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < banyak; i++) {
            if (user[i].nomorRek == nomor) {
                ini = i;
                System.out.println("dikirim ke atas nama : " + user[i].nama);
                System.out.println("masukkan nominal uang yang akan di transfer : ");
                nominal = in.nextDouble();
                
                transaksi(i);
            } 
        }
        if (ini == banyak) {
            System.out.println("nama tidak ditemukan");
        }
        return ini;
    }
    double transaksi(int i) {
        user[i].saldo += nominal;
       return nominal;
    }
}
