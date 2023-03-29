package POSTTEST4;

public final class basket extends lapangan{
    public final String tipeb = "Basket";
    private String nama;
    
    public basket(String tipe, String nama, String luas, String harga, int jumlah){
        super(tipe, luas, harga, jumlah);
        this.nama = nama;
    }
    
    public void setmodel(String capnama){
        nama = capnama;
    }
    public String getnama(){
        return nama;
    }
    public void buat(int jb){
        System.out.println("| menambah " + jb + " lapangan...");
    }
    
    @Override
    public
    void selesai(){
        System.out.println("| Selesai membuat lapangan...");
    }
}