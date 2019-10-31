package paa;
import java.util.*;
public class PAA {
    public static Scanner input = new Scanner(System.in);
    public static Buku daftar = new Buku();
    
    static void menu(){
        int pilih;
        System.out.print("1. Lihat Daftar Buku\n2. Cari Buku\nPilih ");pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                int sortby;
                    System.out.print("\nSort By:\n1. Harga Tinggi ke Rendah\n2. Harga Rendah ke Tinggi\nPilih: ");
                    sortby = input.nextInt();
                    
                    switch(sortby){
                        case 1:
                            daftar.sort_tinggi();
                            daftar.view();
                            System.out.println("");
                            menu();
                        break;
                        
                        case 2:
                            daftar.sort_rendah();
                            daftar.view();
                            System.out.println("");
                            menu();
                        break;
                        
                    }            
            break;
                
            case 2:
                String judul;
                System.out.print("\nMasukkan Judul Buku: ");
                input.nextLine();
                judul = input.nextLine();
                daftar.search(judul);
                
                int harga = daftar.buku, uang;
                if(harga == 0){
                    menu();
                }else{
                System.out.print("\nMasukkan Jumlah Uang: ");uang = input.nextInt();
                daftar.bayar(harga, uang);
                }
            break;
                
        }
        
    }
    
    public static void main(String[] args) {
        daftar.tambah(0, "Mawar", 200);
        daftar.tambah(1, "Mawar Merah", 100);
        daftar.tambah(2, "Yang", 50);
        daftar.tambah(3, "Hilang", 300);
        daftar.tambah(4, "Bumi", 200);
        menu();
    }
    
}
