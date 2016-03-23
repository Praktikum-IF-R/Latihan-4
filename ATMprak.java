package tugas.encapsulation.praktikum;

import java.util.Scanner;

public class ATMprak {

    public int password;
    private int cekPassword;
    private int saldo;
    private int norek;
    private int tarikuang;
    private int transfer;
    private int jumlahpoint;
    private String namabank = "BRI";

    public ATMprak() {
        password = 123456;
        saldo = 7000000;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void cekpassword(int cekPassword) {
        this.cekPassword = cekPassword;
        if (this.cekPassword != password) {
            do {
                System.out.println("PASSWORD SALAH");
            } while (cekPassword == password);

        } else {
            setSaldo();
        }

    }

    public void setSaldo() {
        this.saldo = saldo;
        System.out.println("saldo anda : Rp." + saldo);
    }

    public int getSaldo() {
        return saldo;
    }

    public void tarikuang(int tarikuang) {
        this.tarikuang = tarikuang;
        if (saldo > tarikuang) {
            saldo = saldo - tarikuang;
            System.out.println("Sisa saldo anda sekarang: Rp." + saldo);
        } else if (saldo < tarikuang) {
            System.out.println("GAGAL, SALDO TIDAK CUKUP");
        }

    }

    public void transfer(int transfer) {
        this.transfer = transfer;
        if (saldo > transfer) {
            saldo = saldo - transfer;
            System.out.println("Sisa saldo anda sekarang: Rp." + saldo);
        } else if (saldo < transfer) {
            System.out.println("GAGAL, SALDO TIDAK CUKUP");
        }

    }

    public void setNorek(int norek) {
        this.norek = norek;
    }

    public int getNorek() {
        return norek;
    }

    public void HitungPoint(String namabank1) {
        if (this.transfer > 250000 && namabank1.equalsIgnoreCase(this.namabank)) {
            jumlahpoint += 10;
        } else {
            jumlahpoint += 0;
        }
    }
    public int getJumlahPoint(){
        return jumlahpoint;
    }

    public void displayTransfer() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println("Uang anda telah ditransfer ke NO rekening:");
        System.out.println(getNorek());
        System.out.println("sejumlah " + transfer);
        System.out.println("setiap anda mentransfer ke Bank yang sama,"
                + " dan setiap transfer melebihi Rp.250.000"
                + "maka akan mendapatkan point sebanyak 10 point");
        System.out.println("jumlah bonus point adalah : " + jumlahpoint);
        System.out.println("dan sisa saldo anda sebesar: Rp. " + saldo);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
    }

}
