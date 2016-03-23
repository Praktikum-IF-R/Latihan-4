package atm;

public class ATM {

    private int saldo;
    private String PIN;
    private String rekening;
    private int bonuspoin;
    private int saldobonus;
    public ATM() {
        saldo = 5000000;
    }

    public void setPIN(String p) {
        this.PIN = p;
    }

    public String getPIN() {
        return this.PIN;
    }

    public void setrekening(String r) {
        rekening = r;
    }

    public String getrekening() {
        return rekening;
    }

    public int checksaldo() {
        System.out.print("Saldo yang anda miliki sebesar :");
        return saldo;
    }

    public int Tariktunai(int uang) {
        if (saldo < uang) {
            System.out.println("Maaf sisa saldo anda tidak mencukupi");
        } else {
            saldo -= uang;
            System.out.println("Penarikan tunai sebesar " + uang + " telah Sukses");
            System.out.println("Saldo anda sekarang ");
        }
        return saldo;
    }

    public int TransferTunai(int uangtransfer) {
        if (saldo < uangtransfer) {
            System.out.println("Maaf sisa saldo anda tidak mencukupi");
        } else {
            saldo -= uangtransfer;
            System.out.println("Transfer ke no rekening " + getrekening() + " sebesar " + uangtransfer + " berhasil");
            System.out.println("Sisa saldo anda sebesar :" + saldo);
        }
        return saldo;
    }

    public int bonuspoint(int uangtransfer) {
        if (saldo < uangtransfer) {
            System.out.println("Anda tidak mendapatkan point");
        } else {
            int bonus = uangtransfer / 250000;
            bonuspoin=bonus*10;
            System.out.println("Anda mendapatkan bonus poin sebesar "+bonuspoin);
        }
        return bonuspoin;
    }
    public void pointsekarang(){
        saldobonus+=bonuspoin;
        System.out.println("Poin yang anda miliki sekarang : "+saldobonus);
    }
}
