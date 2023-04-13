package POSTTEST6;

public final class futsal extends lapangan{
    public final String tipef = "Futsal";
    private String nama;
    
    protected futsal(String tipe, String nama, String luas, String harga, int jumlah){
        super(tipe, luas, harga, jumlah);
        this.nama = nama;
    }
    
    protected void setmodel(String capnama){
        nama = capnama;
    }
    protected String getnama(){
        return nama;
    }
    protected void buat(int jf){
        System.out.println("| menambah " + jf + " lapangan...");
    }

    @Override
    public
    void selesai(){
        System.out.println("| Selesai membuat lapangan...");
    }
}