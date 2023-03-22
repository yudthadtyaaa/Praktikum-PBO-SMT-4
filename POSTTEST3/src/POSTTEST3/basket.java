package POSTTEST3;

public class basket extends lapangan{
    private String model;
    
    public basket(String tipe, String model, String ukuran, String warna, int jumlah){
        super(tipe, ukuran, warna, jumlah);
        this.model = model;
    }
    
    public void setmodel(String capmodel){
        model = capmodel;
    }
    public String getmodel(){
        return model;
    }
    public void buat(int jj){
        System.out.println("| menambah " + jj + " lapangan...");
    }
    public void selesai(){
        System.out.println("| Selesai membuat lapangan...");
    }
}