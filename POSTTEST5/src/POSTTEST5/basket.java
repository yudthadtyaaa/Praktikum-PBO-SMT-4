package POSTTEST5;

public final class basket extends lapangan{
    public final String tipeb = "Basket";
    private String nama;
    
    protected basket(String tipe, String nama, String luas, String harga, int jumlah){
        super(tipe, luas, harga, jumlah);
        this.nama = nama;
    }
    
    protected void setmodel(String capnama){
        nama = capnama;
    }
    protected String getnama(){
        return nama;
    }
    protected void buat(int jb){
        System.out.println("| menambah " + jb + " lapangan...");
    }
    
    @Override
    public
    void selesai(){
        System.out.println("| Selesai membuat lapangan...");
    }
}