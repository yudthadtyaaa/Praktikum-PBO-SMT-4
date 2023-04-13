package POSTTEST6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    static InputStreamReader log = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(log);
    
        public static void main(String[] args) throws IOException {
        ArrayList<buyer> dataBuyer = new ArrayList<>();
        ArrayList<admin> dataAdmin = new ArrayList<>();
        dataBuyer.add(new buyer("buyer", "1234", "dita"));
        dataAdmin.add(new admin("admin", "admin", "yudith"));
        
        while(true){
            System.out.println("1. login");
            System.out.println("2. keluar");
            System.out.println("Masukkan pilihan :");
            int select = Integer.parseInt(input.readLine());
                if(select == 1){
                    System.out.println("Masukkan Username :");
                    String username = input.readLine();
                    System.out.println("Masukkan Password :");
                    String password = input.readLine();
                    for(buyer buyer : dataBuyer){
                        if(username.equals(buyer.getUser()) && password.equals(buyer.getPass())){
                            buyer.menu();
                        }
                    }
                    for(admin admin : dataAdmin){
                        if(username.equals(admin.getUser()) && password.equals(admin.getPass())){
                            admin.menu();
                        }
                    }
                } else {
                    System.exit(0);
                }
            System.out.println("Username atau Password salah...");
        }   
    }
}      


        