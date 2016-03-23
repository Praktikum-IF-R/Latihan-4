package student;


public class ATM {

    private int saldo;
    private int password;
    private int point = 0;

    public void Poin() {

        point = point + 10;

    }

    public int getPoin() {
        return this.point;
    }

    void setPassword(int pw) {
        this.password = pw;
    }

    int getPassword() {
        return this.password = password;
    }

    void setSaldo(int s) {
        this.saldo = s;
    }

    int getSaldo() {
        return this.saldo = saldo;
    }

    public ATM(int pw, int s) {
        this.password = pw;
        this.saldo = s;

    }

}

