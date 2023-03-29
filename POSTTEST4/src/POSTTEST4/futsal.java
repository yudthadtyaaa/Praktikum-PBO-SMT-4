package POSTTEST4;

public final class futsal extends lapangan{
    public final String tipef = "Futsal";
    private String nama;
    
    public futsal(String tipe, String nama, String luas, String harga, int jumlah){
        super(tipe, luas, harga, jumlah);
        this.nama = nama;
    }
    
    public void setmodel(String capnama){
        nama = capnama;
    }
    public String getnama(){
        return nama;
    }
    public void buat(int jf){
        System.out.println("| menambah " + jf + " lapangan...");
    }

    @Override
    public
    void selesai(){
        System.out.println("| Selesai membuat lapangan...");
    }
}