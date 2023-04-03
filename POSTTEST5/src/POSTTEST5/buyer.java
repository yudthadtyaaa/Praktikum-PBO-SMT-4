package POSTTEST5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class buyer implements akun{
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(isr);
    static ArrayList<futsal> listfutsal = new ArrayList<>();
    static ArrayList<basket> listbasket = new ArrayList<>();

    private String username, password, nama;

    public buyer(String username, String password, String nama){
        this.username = username;
        this.password = password;
        this.nama = nama;
    }
    public String getUser(){
        return username;
    }
    public void user(String username){
        this.username = username;
    }
    public String getPass(){
        return password;
    }
    public void setPass(String password){
        this.password = password;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public void menu() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|              =====   MENU   =====             |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   [1] Tambah                                  |");
        System.out.println("|   [2] Lihat                                   |");
        System.out.println("|   [3] Ubah                                    |");
        System.out.println("|   [4] Hapus                                   |");
        System.out.println("|   [5] Keluar                                  |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Menu : ");
        int select = Integer.valueOf(input.readLine());
        
        switch(select){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> edit();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("| Tidak ada pilihan..."); 
        }
    }

    @Override
    public void tambah() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   TAMBAH LAPANGAN   =====       |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Jenis Lapangan :                      |");
        System.out.println("|   [1] Futsal                                  |");
        System.out.println("|   [2] Basket                                  |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        int select = Integer.valueOf(input.readLine());
        
        switch(select){
            case 1 -> tambahfutsal(); 
            case 2 -> tambahbasket();
            default -> System.out.println("| Tidak ada pilihan..."); 
            }
        }
    
        static void tambahfutsal() throws IOException{
            System.out.println("+-----------------------------------------------+");
            System.out.println("|          =====   TAMBAH FUTSAL   =====        |");
            System.out.println("+-----------------------------------------------+");
            String tipe = "Futsal";
            System.out.print("| Nama Lapangan: ");
            String nama = input.readLine();
            System.out.print("| Luas Lapangan: ");
            String luas = input.readLine();
            System.out.print("| Harga Lapangan: ");
            String harga = input.readLine();
            System.out.print("| Jumlah : ");
            int jumlah = Integer.parseInt(input.readLine());
            futsal f = new futsal(tipe, nama, luas, harga, jumlah);
            f.buat(jumlah);
            f.selesai();
            listfutsal.add(f);
        }
        static void tambahbasket()throws IOException{
            System.out.println("+-----------------------------------------------+");
            System.out.println("|          =====   TAMBAH BASKET   =====        |");
            System.out.println("+-----------------------------------------------+");
            String tipe = "Basket";
            System.out.print("| Nama Lapangan: ");
            String nama = input.readLine();
            System.out.print("| Luas Lapangan : ");
            String luas = input.readLine();
            System.out.print("| Harga Lapangan: ");
            String warna = input.readLine();
            System.out.print("| Jumlah : ");
            int jumlah = Integer.parseInt(input.readLine());
            basket b = new basket(tipe, nama, luas, warna, jumlah);
            b.buat(jumlah);
            b.selesai();
            listbasket.add(b);
        }

    @Override
    public void tampil() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   LIHAT LAPANGAN   =====        |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Lapangan :                            |");
        System.out.println("|   [1] Futsal                                  |");
        System.out.println("|   [2] Basket                                  |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        int select = Integer.valueOf(input.readLine());
        switch(select){
            case 1 -> tampilfutsal();
            case 2 -> tampilbasket();
        }
    }

    static void tampilfutsal(){
        if(listfutsal.isEmpty()){
            System.out.println("| Tidak ada data...");
        }else{
            System.out.println("+-----------------------------------------------+");
            System.out.println("|     =====   LIST LAPANGAN FUTSAL   =====      |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| No.\ttipe\tNama\tLuas\tHarga\tJumlah\t  |");
            for(int i = 0; i < listfutsal.size(); i++){
                System.out.print("| " + (i + 1) + "\t");
                System.out.print(listfutsal.get(i).tipef + "\t");
                System.out.print(listfutsal.get(i).getnama() + "\t");
                System.out.print(listfutsal.get(i).getluas() + "\t");
                System.out.print(listfutsal.get(i).getharga() + "\t");
                System.out.println(listfutsal.get(i).getjumlah() + "\t  |");
            }
        }
    }
    
    static void tampilbasket(){
        if(listbasket.isEmpty()){
            System.out.println("| Tidak ada data...");
        }else{
            System.out.println("+-----------------------------------------------+");
            System.out.println("|     =====   LIST LAPANGAN BASKET   =====      |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| No.\ttipe\tNama\tLuas\tHarga\tJumlah\t  |");
            for(int i = 0; i < listbasket.size(); i++){
                System.out.print("| " + (i + 1) + "\t");
                System.out.print(listbasket.get(i).tipeb + "\t");
                System.out.print(listbasket.get(i).getnama() + "\t");
                System.out.print(listbasket.get(i).getluas() + "\t");
                System.out.print(listbasket.get(i).getharga() + "\t");
                System.out.println(listbasket.get(i).getjumlah() + "\t |");
            }
        }
    }

    @Override
    public void edit() throws IOException{
        int pilih, select;
        System.out.println("+-----------------------------------------------+");
        System.out.println("|          =====   UBAH LAPANGAN   =====        |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Lapangan :                            |");
        System.out.println("|   [1] Futsal                                  |");
        System.out.println("|   [2] Basket                                  |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        pilih = Integer.parseInt(input.readLine());
        switch (pilih) {
            case 1 -> {
                tampilfutsal();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor  : ");
                select = Integer.parseInt(input.readLine());
                select--;
                System.out.print("| Nama Lapangan: ");
                listfutsal.get(select).setmodel(input.readLine());
                System.out.print("| Luas Lapangan: ");
                listfutsal.get(select).setluas(input.readLine());
                System.out.print("| Harga Lapangan: ");
                listfutsal.get(select).setharga(input.readLine());
                System.out.print("| Jumlah : ");
                listfutsal.get(select).setjumlah(Integer.parseInt(input.readLine()));
                System.out.println("| Lapangan telah diperbarui...");
            }
            case 2 -> {
                tampilbasket();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor  : ");
                select = Integer.parseInt(input.readLine());
                select--;
                System.out.print("| Nama Lapangan: ");
                listbasket.get(select).setmodel(input.readLine());
                System.out.print("| Luas Lapangan: ");
                listbasket.get(select).setluas(input.readLine());
                System.out.print("| Harga Lapangan: ");
                listbasket.get(select).setharga(input.readLine());
                System.out.print("| Jumlah : ");
                listbasket.get(select).setjumlah(Integer.parseInt(input.readLine()));
                System.out.println("| Lapangan telah diperbarui...");
            }
            default -> System.out.println("| Tidak ada pilihan...");
        }
    }

    @Override
    public void hapus() throws IOException{
        int pilih, select;
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   HAPUS LAPANGAN   =====        |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Lapangan :                            |");
        System.out.println("|   [1] Futsal                                  |");
        System.out.println("|   [2] Basket                                  |");
        System.out.println("+-----------------------------------------------+");
        System.out.print("| Pilih Tipe : ");
        pilih = Integer.parseInt(input.readLine());
        switch (pilih) {
            case 1 -> {
                tampilfutsal();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor  : ");
                select = Integer.parseInt(input.readLine());
                select--;
                listfutsal.remove(select);
                System.out.println("| Lapangan telah dihapus...");
            }
            case 2 -> {
                tampilbasket();
                System.out.println("+-----------------------------------------------+");
                System.out.print("| Pilih Nomor  : ");
                select = Integer.parseInt(input.readLine());
                select--;
                listbasket.remove(select);
                System.out.println("| Lapangan telah dihapus...");
            }
            default -> System.out.println("| Tidak ada pilihan...");
        }
    }
}
