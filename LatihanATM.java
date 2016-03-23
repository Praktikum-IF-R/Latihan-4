package latihanatm;
public class LatihanATM {
    int pin;
    int saldo = 2000000;
    String nama = "Larasati";
    String asalRek = "155150400111101";
    public String bankAsli = "MANDIRI";
    public int bonuspoint;

    public void tarikTunai(int jumlah) {
        if (jumlah < saldo) {
            saldo -= jumlah;
            System.out.println("\n       Ambil uang anda\nJangan meninggalkan mesin ATM\nsebelum kartu dan uang keluar\n        Terima kasih\n");
            System.out.println("Saldo rekening anda saat ini : Rp " + saldo);
        } else {
            System.out.println("Saldo anda tidak mencukupi.");
        }
    }

    public void lihatSaldo() {
        System.out.println("Saldo rekening anda saat ini : Rp " + saldo);
    }

    public void transfer(int jumlah, String norek) {
        System.out.println("\nRek Tujuan : " + norek);
        System.out.println("Nama       : " + nama);
        System.out.println("Jumlah     : Rp " + jumlah);
        System.out.println("Dari rek.  : " + asalRek);
        if (jumlah < saldo) {
            saldo -= jumlah;
            System.out.println("Saldo rekening anda saat ini : Rp " + saldo);
        } else {
            System.out.println("Transfer gagal. Saldo anda tidak mencukupi.");
        }
    }
    public void BonusPoint(int transfer, String nb){
        if (transfer > 250000 && nb.equalsIgnoreCase(bankAsli)){
            bonuspoint+=10;
        }
        else{
            bonuspoint+=0;
        }
    }
    public int getBonusPoint(){
        return bonuspoint;
    }
    public void displayBonus(){
        System.out.println("Anda Mendapatkan Bonus Point Sebesar : "+getBonusPoint());
    }
}

