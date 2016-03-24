package time1;

public class atm {

    private String nama;
    private String noRek;
    private String pin;
    private double saldo;
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public atm(String nama, String noRek, String pin, double saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.pin = pin;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean tambahSaldo(double value) {
        if (value > 0) {
            this.saldo += value;
            return true;
        } else {
            return false;
        }
    }

    public boolean kurangiSaldo(double value) {
        if (value > 0 && this.saldo - value >= 0) {
            this.saldo -= value;
            return true;
        } else {
            return false;
        }
       }
    

    public void transferSaldo(atm n, double value) {
        if (kurangiSaldo(value)) {
            n.tambahSaldo(value);
            if (value >=250000){
                point += 10;
            }
            System.out.printf("Transfer Rp. %.2f Ke %s(%s) BERHASIL!\n", value, n.getNama(), n.getNoRek());
        } else {
            System.out.printf("Transfer Rp. %.2f Ke %s(%s) GAGAL!\n", value, n.getNama(), n.getNoRek());
        }
    }

    public void cetakSaldo() {
        System.out.printf("Saldo anda sebesar Rp. %.2f\n", this.saldo);
    }

    public void tarikSaldo(double value) {
        if (kurangiSaldo(value)) {
            System.out.printf("Tarik saldo sebesar Rp. %.2f BERHASIL! Sisa saldo Rp. %.2f\n", value, this.saldo);
        } else {
            System.out.printf("Tarik saldo sebesar Rp. %.2f GAGAL! Sisa saldo Rp. %.2f\n", value, this.saldo);
        }
    
    }
 
    public void showPoint(){
        System.out.println("point anda adalah : " +getPoint());
    }
}
