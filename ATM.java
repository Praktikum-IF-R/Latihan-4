package praktikum2;

public class ATM {

    private String nama, pin, norek, bank;
    private int saldo, trans, point;
    String[] pin2 = {"111238"};
    int[] saldoawal = {2000000};

    public void cekpin() {
        for (int i = 0; i < pin2.length; i++) {
            if (getPin().equalsIgnoreCase(pin2[i])) {
                saldo = saldoawal[i];
            }
        }
    }

    public int ceksaldo() {
        System.out.println("Saldo anda saat ini \t" + saldo);
        return saldo;
    }

    public int penarikansaldo(int tariksaldo) {
        if (saldo > tariksaldo) {
            saldo = saldo - tariksaldo;
            System.out.println("Transaksi anda berhasil!");
        } else if (saldo == tariksaldo) {
            System.out.println("Maaf saldo anda tidak cukup!");
        } else if (saldo < tariksaldo) {
            System.out.println("Maaf saldo anda tidak cukup!");
        }
        return this.saldo;
    }
    public void setTransfer(int trans) {
        this.trans = trans;
        if (saldo > trans) {
            saldo = saldo - trans;
            System.out.println("Transaksi anda berhasil!");
        } else if (saldo == trans) {
            System.out.println("Maaf saldo anda tidak cukup!");
        } else if (saldo < trans) {
            System.out.println("Maaf saldo anda tidak cukup!");
        }
    }
    public int getTransfer() {
        return trans;
    }
    public void setPoint(){
        this.point = 0;
    }
    public int getPoint(){
        if (getTransfer() >= 250000 && bank.equalsIgnoreCase("MANDIRI")){
            point+=10;
            return point;
        } else {
            point+=0;
            return point;
        }
    }
    public void setbank(String bank) {
        this.bank = bank;
    }

    public void setnorektujuan(String notujuan) {
        this.norek = notujuan;
    }

    public String getnorektujuan(String notujuan) {
        return this.norek;
    }

    public String getbank() {
        return bank;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }
}