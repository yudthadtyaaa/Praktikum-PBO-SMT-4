package POSTTEST5;

public abstract class lapangan {
    protected String tipe, luas, harga;
    protected int jumlah;
    
    protected lapangan(String tipe, String luas, String harga, int jumlah){
        this.luas = luas;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public void setluas(String capluas){
        luas = capluas;
    }
    public String getluas(){
        return luas;
    }
    public void setharga(String capharga){
        harga = capharga;
    }
    public String getharga(){
        return harga;
    }
    public void setjumlah(int capjumlah){
        jumlah = capjumlah;
    }
    public int getjumlah(){
        return jumlah;
    }
    abstract void selesai();
}