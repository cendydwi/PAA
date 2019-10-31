package paa;
import java.util.*;
public class Buku{
        Scanner in = new Scanner(System.in);
        String[] judul = new String[50];
        int[] harga = new int[50];
        int buku;
        
        void tambah(int i, String judul, int harga){
            this.judul[i] = judul;
            this.harga[i] = harga;
        }
        
        void sort_rendah(int isi){
            int temp, kecil;
            String tempjud;
            for(int i = 0; i < isi-1 ; i++){
                kecil = i;
                for(int j = i+1; j < isi; j++){
                    if (harga[j] < harga[kecil])
                        kecil = j;
                }
              
                tempjud = judul[i];
                temp = harga[i];
                judul[i] = judul[kecil];
                harga[i] = harga[kecil];
                judul[kecil] = tempjud;
                harga[kecil] = temp;
            }
        }
        
        void sort_tinggi(int isi){
            int temp, besar;
            String tempjud;
            for(int i = 0; i < isi-1 ; i++){
                besar = i;
                for(int j = i+1; j < isi; j++){
                    if (harga[j] > harga[besar])
                        besar = j;
                }
              
                tempjud = judul[i];
                temp = harga[i];
                judul[i] = judul[besar];
                harga[i] = harga[besar];
                judul[besar] = tempjud;
                harga[besar] = temp;
            }
        }
        
        void view(int isi){
            if(isi > 0){
                System.out.println("\nDAFTAR BUKU\n");
                for(int i = 0; i < isi; i++){
                    System.out.println(judul[i]+" = "+harga[i]);
                }
            }else{
                System.out.println("\nData Kosong\n");
            }
            
        }
        
        void search(String cari, int isi){
            int pilihan = 0, hargabuku = 0;
            String pilihbuku;
            System.out.println("\nBuku Yang Dicari:");
            for(int i = 0; i < isi; i++){
                if(judul[i].contains(cari)){
                System.out.println(judul[i]+" : "+harga[i]);
                pilihan = pilihan + 1;
                }
                if(pilihan<2){
                    hargabuku = harga[i];
                }
            }
            if(pilihan > 1){
                System.out.print("\nPilih Buku: ");pilihbuku = in.nextLine();
                for(int i = 0; i < isi; i++){
                if(judul[i].equals(pilihbuku)){
                    buku = harga[i];
                }
            }
            }else if(pilihan == 1){
                    buku = hargabuku;
            }else{
                System.out.println("\nBuku Tidak Ditemukan\n");
            }
        }
        
        void bayar(int harga, int uang){
            int sisa;
            sisa = uang - harga;
            if(sisa < 0){
                sisa = sisa * -1;
                System.out.println("\nUang kurang = "+sisa+"\n");
            }else{
                System.out.println("\nKembalian = "+sisa);
            }
        }
    }