package ATM;

/**
 * @author DS
 */
public class ATM {
//deklarasi variabel

    private String PIN;
    private int jumlah;
    private int jumlahtransfer;
    private int jumlahtransferlain;
//pemberian nilai awal
    private int ambil = 0;
    private int transferlain = 0;
    private int transfersama = 0;
    private int poin = 0;
//intialisasi variabel saldo
    public int saldo = 2000000;

//contructor guna mendklarasi dan menginisialisasi nilai. 
    public ATM() {
        PIN = "563478";
    }
//method getPin berguna untuk mencek benar tidaknya inputan PIN

    public String getPin() {
        return PIN;
    }

//method setTransfersama berguna untuk memberi nilai ketika transfer ke sesama bank
    public void setTransfersama(int transfersama) {
        this.transfersama = transfersama;
        if (this.transfersama >= 250000) {
            poin += 10;
        } else {
            poin = 0;
        }
        jumlahtransfer += transfersama;
        saldo -= jumlahtransfer;
    }
     //method getpoint untuk dapat menampilkan poin
    public int getPoin() {
        return poin;
    }
//method setTransferlain berguna memberi nilai ketika transfer ke lain bank

    public void setTransferlain(int transferlain) {
        this.transferlain = transferlain;
        jumlahtransferlain += transferlain + 5000;
        saldo -= jumlahtransferlain;
    }
//method setAmbil digunakan untuk proses transaksi tarik tunai

    public void setAmbil(int a) {
        ambil = a;
        jumlah += a;
        saldo = saldo - ambil;

    }
//method getAmbil untuk menampilkan berapa hasil penarikan di ATM

    public int getAmbil() {

        return ambil;
    }
    //method saldo digunakan untuk menapilkan saldo

    public int Saldo() {

        return saldo;
    }
   
//method Slip digunakan untuk menampilkan slip transaksi yang telah terjadi

    public void Slip() {
        System.out.println("***********************************************");
        System.out.println("                ATM BANK RBI ");
        System.out.println("            Melayani Setulus Jiwa");
        System.out.println("***********************************************");
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Transaksi anda sebagai berikut ");
        System.out.println();
        //menampilkan transaksi yang terjadi

        System.out.println("Jumlah Ambil Tunai            :Rp. " + jumlah);

        if (transferlain == 0) {
            System.out.println("Transfer Uang sebanyak        :Rp. " + jumlahtransfer);
        } else {
            System.out.println("Transfer Uang Sebanyak        :Rp. " + jumlahtransferlain);

        }
        System.out.println("Sisa Saldo Anda               :Rp. " + Saldo());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("*-Simpan Slip Berikut Sebagai Bukti yang Sah-*");
        System.out.println("           ~~~ TERIMA KASIH ~~~~ ");
        System.out.println();
        System.out.println("Ambil Kartu Anda");
    }
}
