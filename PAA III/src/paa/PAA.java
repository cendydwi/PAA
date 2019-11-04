package paa;
import java.util.*;
public class PAA {
    public static Scanner input = new Scanner(System.in);
    public static Buku daftar = new Buku();
    
    static void menu(){
        int pilih, index = 0;
        do{
            System.out.println("       TOKO BUKU SIMPLE      ");
            System.out.println("=============================");
            System.out.println("||           MENU          ||");
            System.out.println("||1. Input Buku            ||");
            System.out.println("||2. Lihat Daftar Buku     ||");
            System.out.println("||3. Cari Buku             ||");
            System.out.println("=============================");
            System.out.print("Pilih ");pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    String judul;
                    int harga;
                    
                    if(index < daftar.judul.length){
                        input.nextLine();
                        System.out.print("Masukkan Judul Buku: ");
                        judul = input.nextLine();
                        System.out.print("Masukkan Harga Buku: ");
                        harga = input.nextInt();
                        daftar.tambah(index, judul, harga);
                        
                        index = index + 1;
                        System.out.println("");
                        
                    }else{
                        System.out.println("Data Penuh");
                    }
                    
                    break;
                
                case 2:
                    int sortby;
                    System.out.println("\n=============================");
                    System.out.println("||Sort By:                   ||");
                    System.out.println("||1. Harga Tinggi ke Rendah  ||");
                    System.out.println("||2. Harga Rendah ke Tinggi  ||");
                    System.out.println("=============================");
                    System.out.print("Pilih: ");
                    sortby = input.nextInt();
                    
                    switch(sortby){
                        case 1:
                            daftar.sort_tinggi(index);
                            daftar.view(index);
                            System.out.println("");
                        break;
                        
                        case 2:
                            daftar.sort_rendah(index);
                            daftar.view(index);
                            System.out.println("");
                        break;
                        
                    }
                    
                    break;
                
                case 3:
                    String cari;
                    
                    System.out.print("\nMasukkan Judul Buku: ");
                    input.nextLine();
                    cari = input.nextLine();
                    daftar.search(cari, index);
                    
                    int bayar = daftar.buku, uang;
                    if(bayar == 0){
                        menu();
                    }else{
                        System.out.print("\nMasukkan Jumlah Uang: ");uang = input.nextInt();
                        daftar.bayar(bayar, uang);
                        System.out.println("");
                    }
                    
                    break;
            }
        }while(pilih != 4);
    }
    
    public static void main(String[] args) {
        menu();
    }
    
}
