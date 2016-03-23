/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM3;

/**
 *
 * @author Deltaviyahya
 */

    public class atm {
      double saldo;
      String pin;
      int poin;
     
     public atm(){
         saldo = 0;
         pin = "Belum Diset";
         poin = 0;
     }
     public void setData(String a, double b, int c){
         saldo = b;
         pin = a;
         poin = c;
     }
     public double getSaldo(){
         return saldo;
     }
     public String getPin(){
         return pin;
     }
     public int getPoin(){
         return poin;
     }
     public void Transfer(int a, String b){
         if(a<=saldo){
         saldo = saldo-a;
        }
         else{
             System.out.println("Jumlah nominal uang yang ingin ditransfer terlalu banyak.");
         }
         poinPoin(a, b);
     }
     public void Tarik(int a){
         if(a<=saldo){
             saldo = saldo-a;
         }
         else{
             System.out.println("Jumlah nominal uang yang ingin diambil terlalu banyak.");
         }
     }
     private void poinPoin(int a, String b){
         if(b.equalsIgnoreCase("BNY")){
             if(a>=250000){
             poin += 10;
             }
             else{
             poin = poin;
            }
         }
         else{
             poin = poin;
         }
     }
   
}
