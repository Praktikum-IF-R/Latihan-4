package mesinatm;

public class atm {
    int total;
    private int pass, saldo;
    private int poin=0;

    public atm(int p, int s, int a) {
        pass = p;
        saldo = s;
        poin = a;
    }

    int getPass() {
        return pass;
    }

    int getSaldo() {
        return saldo;
    }

    public void setPoin() {
        poin = poin + 10;
    }
    int getPoin() {
        return poin;
    }

}
