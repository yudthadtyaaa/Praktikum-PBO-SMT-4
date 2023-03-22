package POSTTEST3;

public class futsal extends lapangan{
    private String model;
    
    public futsal(String tipe, String model, String ukuran, String warna, int jumlah){
        super(tipe, ukuran, warna, jumlah);
        this.model = model;
    }
    
    public void setmodel(String capmodel){
        model = capmodel;
    }
    public String getmodel(){
        return model;
    }
    public void buat(int jb){
        System.out.println("| menambah " + jb + " lapangan...");
    }
    public void selesai(){
        System.out.println("| Selesai membuat lapangan...");
    }
}
