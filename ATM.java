/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author LENY
 */
public class ATM {

    private int password;
    private int saldo;
    private int point=0;
    public void Point(){
        
            point = point+10;        
        
    }
    
    public int getPoint(){
        return this.point;
    }
    void setPassword(int p) {
        this.password = p;
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

    public ATM(int p, int s) {
        this.password = p;
        this.saldo = s;
          
    }

}
