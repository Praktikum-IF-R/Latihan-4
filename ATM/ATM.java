package ATM;
class ATM {
    private long pin, norek;
    private int jumlahtransfer, saldo, jumlahtarik, poin=0;
    private String namarek, bank;
public ATM() {
   System.out.print("Masukkan PIN anda : ");        
    }
public void setBank(String s){
    this.bank = s;
}
public String getBank(){
    return bank;
}
public int poin(){
    if(getJumlahTransfer()>250000 && bank.equalsIgnoreCase("BRI")){
        poin+=10;
        return poin;
    }
    else{
        poin+=0;
        return poin;
    }
}
public void setPin(long p){
    this.pin = p;
}                
public long getPin(){
    return pin;
}
public void setTarikSaldo(int t){
    this.jumlahtarik = t;
}
public int getTarikSaldo(){
    return jumlahtarik;
}
public void setNorek(long n){
    this.norek = n;
}
public long getNorek(){
    return norek;
}
public void setJumlahTransfer(int j){
    this.jumlahtransfer = j;
}
public int getJumlahTransfer(){
    return jumlahtransfer;
}
public void pilihan(){
    System.out.println("===============================");
    System.out.println("PILIHAN MENU BANK BRAWIJAYA");
    System.out.println("1. Cek Saldo");
    System.out.println("2. Transfer Saldo");
    System.out.println("3. Penarikan Saldo");
    System.out.println("===============================");
    }
public void tarikSaldo(){
    System.out.print("Berapa jumlah uang yang ingin ditarik : Rp. ");
}
public void tarikSaldo2(){
    pin();
    if (saldo > jumlahtarik){
        System.out.println("Jumlah saldo yang ditarik : "+jumlahtarik);
    }
    else {
        System.out.println("Jumlah saldo anda tidak mencukupi");
    }
}
public void pin(){
    if (pin == 123456){
        saldo = 12500000;
    }
    else if (pin == 654321){
        saldo = 10000000;
    }
    else {
        System.out.println("Maaf pin anda salah");
    }
}
public void norek(){
    if (norek == 123456789){
        namarek = "Fadhyl Farhan";
    }
    else if (norek == 234567890){
        namarek = "Kurniawan";
    }
    else if (norek == 345678901){
        namarek = "Sucipto";
    }
}
public void ceksaldo(){
    pin();
    System.out.println("Saldo anda saat ini adalah : Rp. "+saldo);
    }
public void transfersaldo(){
    System.out.print("Nama rekening tujuan : ");
    }
public void transfersaldo1(){
    System.out.print("Nomor rekening tujuan : ");
    }
public void transfersaldo2(){
    System.out.print("Jumlah yang ingin ditransfer : Rp. ");
    }
public int getTransfer(){
    return jumlahtransfer;
    }
public String namarek(){
    return namarek;
    }
public void transfersaldo3(){
    pin();
    norek();
    if (jumlahtransfer < saldo){
    System.out.println("Anda ingin mentransfer ke rekening "+namarek());
    System.out.println("Sejumlah Rp. "+getTransfer());
    System.out.println("Nama bank penerima : "+getBank());
        }
    else if (jumlahtransfer > saldo){
    System.out.println("Jumlah saldo anda tidak mencukupi");
        }
    else {
    System.out.println("Nomor rekening tujuan tidak terdaftar");    
        }
    }
public void Akhir(){
    System.out.println("Terima kasih telah menggunakan Bank Brawijaya");
    }
}