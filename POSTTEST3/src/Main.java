
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import POSTTEST3.*;

public class Main{
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(isr);
    static ArrayList<futsal> listfutsal = new ArrayList<>();
    static ArrayList<basket> listbasket = new ArrayList<>();
    
    static void menu() throws IOException{
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
    
    static void tambah() throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|         =====   TAMBAH LAPANGAN   =====       |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Pilih Lapangan :                            |");
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
        System.out.print("| Nama : ");
        String model = input.readLine();
        System.out.print("| Ukuran : ");
        String ukuran = input.readLine();
        System.out.print("| Harga : ");
        String harga = input.readLine();
        System.out.print("| Jumlah : ");
        int jumlah = Integer.parseInt(input.readLine());
        futsal f = new futsal(tipe, model, ukuran, harga, jumlah);
        f.buat(jumlah);
        f.selesai();
        listfutsal.add(f);
    }
    static void tambahbasket()throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|          =====   TAMBAH BASKET   =====        |");
        System.out.println("+-----------------------------------------------+");
        String tipe = "Basket";
        System.out.print("| Nama : ");
        String model = input.readLine();
        System.out.print("| Ukuran : ");
        String ukuran = input.readLine();
        System.out.print("| Harga : ");
        String warna = input.readLine();
        System.out.print("| Jumlah : ");
        int jumlah = Integer.parseInt(input.readLine());
        basket b = new basket(tipe, model, ukuran, warna, jumlah);
        b.buat(jumlah);
        b.selesai();
        listbasket.add(b);
    }
    
    static void tampil() throws IOException{
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
            System.out.println("| No.\ttipe\tNama\tJumlah\tUkuran\tHarga\t  |");
            for(int i = 0; i < listfutsal.size(); i++){
                System.out.print("| " + (i + 1) + "\t");
                System.out.print(listfutsal.get(i).tipe + "\t");
                System.out.print(listfutsal.get(i).getmodel() + "\t");
                System.out.print(listfutsal.get(i).getukuran() + "\t");
                System.out.print(listfutsal.get(i).getwarna() + "\t");
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
            System.out.println("| No.\ttipe\tNama\tJumlah\tUkuran\tHarga\t  |");
            for(int i = 0; i < listbasket.size(); i++){
                System.out.print("| " + (i + 1) + "\t");
                System.out.print(listbasket.get(i).tipe + "\t");
                System.out.print(listbasket.get(i).getmodel() + "\t");
                System.out.print(listbasket.get(i).getukuran() + "\t");
                System.out.print(listbasket.get(i).getwarna() + "\t");
                System.out.println(listbasket.get(i).getjumlah() + "\t |");
            }
        }
    }
    
    static void edit() throws IOException{
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
                System.out.print("| Nama : ");
                listfutsal.get(select).setmodel(input.readLine());
                System.out.print("| Ukuran : ");
                listfutsal.get(select).setukuran(input.readLine());
                System.out.print("| HargaS : ");
                listfutsal.get(select).setwarna(input.readLine());
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
                System.out.print("| Nama : ");
                listbasket.get(select).setmodel(input.readLine());
                System.out.print("| Ukuran : ");
                listbasket.get(select).setukuran(input.readLine());
                System.out.print("| Harga : ");
                listbasket.get(select).setwarna(input.readLine());
                System.out.print("| Jumlah : ");
                listbasket.get(select).setjumlah(Integer.parseInt(input.readLine()));
                System.out.println("| Lapangan telah diperbarui...");
            }
            default -> System.out.println("| Tidak ada pilihan...");
        }
    }
    
    static void hapus() throws IOException{
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
    
    public static void main(String[] args) throws IOException{
        System.out.println("+-----------------------------------------------+");
        System.out.println("|                Selamat Datang                 |");
        System.out.println("|                    ADMIN                      |");
        while(true){
            menu();
        }
    }
}