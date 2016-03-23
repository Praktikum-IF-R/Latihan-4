package Laporan2Revisi;

/**
 *
 * @author wahyu
 */
public class MesinATM {

    String myrek;
    int pin, tunai, tarik, sisa, rek, jumlah;
    private int point;

    public MesinATM(String a, int b, int c) {
        myrek = a;
        pin = b;
        tunai = c;
    }

    public int setPIN() {
        int d = pin;
        return d;
    }

    public void cekSaldo() {
        System.out.println("Saldo Anda : " + tunai);
    }

    public int tarikTunai(int a) {
        tarik = a;
        if (tarik > tunai) {
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("------------------------------------------------");
        } else {
            tunai = tunai - tarik;
            System.out.println("Silahkan Ambil Uang Anda");
            System.out.println("Sisa Saldo Anda : " + tunai);
        }
        return tunai;
    }

    public void transfer(int a, int b) {
        jumlah = a;
        rek = b;
        if (jumlah > tunai) {
            System.out.println("Maaf, Saldo Anda Tidak Mencukupi");
            System.out.println("------------------------------------------------");
        } else {
            tunai = tunai - jumlah;
            System.out.println("Proses Transfer Berhasil");
            System.out.println("Uang Sebesar " + jumlah + " ke Rekening " + rek);
            System.out.println("------------------------------------------------");
        }
    }

    public void poin(int a) {
        point = point + a;
    }

    public int getPoin() {
        return point;
    }
}
