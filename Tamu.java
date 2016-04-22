/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author admin2
 */
public class Tamu {
    
    private static int count=0;
    private final String nama,nmrtelp,alamat,kewarganegaraan;
    
    public Tamu (String a,String b,String c,String d){
        nama = a;
        nmrtelp = b;
        alamat=c;
        kewarganegaraan=d;
        
        count++;
    }
    public static int getcount (){
        return count;
    }
    public void display(){
        System.out.println("nama: "+nama+"\tnomor hp: "+nmrtelp);
    }
}
