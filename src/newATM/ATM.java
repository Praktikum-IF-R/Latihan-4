package newATM;

public class ATM {

    private String nama;
    private String noRek;
    private String pin;
    private int balance;
    private int poin = 0;

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

    public ATM(String nama, String noRek, String pin, int balance) {
        this.nama = nama;
        this.noRek = noRek;
        this.pin = pin;
        this.balance = balance;
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

    public double getBalance() {
        return balance;
    }

    public boolean incBalance(int value) {
        if (value > 0) {
            this.balance += value;
            return true;
        } else {
            return false;
        }
    }

    public boolean decBalance(int value) {
        if (value > 0 && this.balance - value >= 0) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public void transferBalance(ATM n, int value) {
        if (decBalance(value)) {
            n.incBalance(value);
            if (value >= 250000) {
                poin += 10;
            }
            System.out.printf("Transfer dana ke %s a/n %s sebesar Rp.%d BERHASIL!\n", n.getNoRek(), n.getNama(), value);
            System.out.printf("Sisa saldo anda sebesar Rp.%d\n", this.balance);
            System.out.println("Anda mendapatkan bonus poin! Poin anda saat ini adalah : " + poin);
        } else {
            System.out.printf("Transfer dana ke %s a/n %s sebesar Rp.%d GAGAL!\n", n.getNoRek(), n.getNama(), value);
            System.out.printf("Sisa saldo anda sebesar Rp.%d\n", this.balance);
        }
        System.out.println("Anda tidak mendapatkan bonus poin! Transfer dengan nominal Rp.250000 atau lebih untuk mendapatkan bonus poin!");
    }

    public void showPoint() {
        System.out.println("Point anda saat ini adalah : " + getPoin());
    }

    public void printBalance() {
        System.out.printf("Saldo anda sebesar Rp.%d\n", this.balance);
    }

    public void withdrawBalance(int value) {
        if (decBalance(value)) {
            System.out.printf("Tarik saldo sebesar Rp.%d BERHASIL! Sisa saldo anda sebesar Rp.%d\n", value, this.balance);
        } else {
            System.out.printf("Tarik saldo sebesar Rp.%d GAGAL! Sisa saldo anda sebesar Rp.%d\n", value, this.balance);
        }
    }

}

/*tambah fungsi untuk menampilkan jumlah bonus point, dimana point akan selalu bertambah ketika user melakukan transaksi satu kali transfer
 kepada bank yang sama dan minimal nominal transfer 250k. Setiap satu kali transaksi point akan bertambah 10. Fungsi bonus point ini menampilkan
 keterangan berapa banyak point yang sudah didapatkan user selama ini. (menerapkan konsep encapsulation)
 */
