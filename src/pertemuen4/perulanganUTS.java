/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuen4;

import java.util.Scanner;

/**
 *
 * @author HP
 */ 
public class perulanganUTS {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("          indomaret           ");
        System.out.println("==============================");
        
        System.out.println(" nama barang");
        int beli = input.nextInt();
        
        for(int i = 1; i<=beli; i++)
        {
        


           
    System.out.println( "  nama barang  "+i+ "=");
    String nama = input.next();
    System.out.println(" nama barang  "+i+ "=");
    int harga = input.nextInt();
    System.out.println("  nama barang  "+i+ "=");
    int jumlah = input.nextInt();
    System.out.println("");
    
    System.out.println("=============================");
    System.out.println(" nama barang    : " +nama);
    System.out.println(" harga barang   : " +harga);
    System.out.println(" jumlah barang  : " +jumlah);
    System.out.println("=============================");
    
    int total,totalb,diskon =0;
    total = harga = jumlah;
    System.out.println("total belanja = RP " + total);
    if (total>100000){
        diskon = total/5;
    } else{diskon = 0; }
    
            System.out.println("diskon = Rp." + diskon);
            totalb = total - diskon;
            System.out.println(" Total bayar = Rp." + totalb);
            System.out.println("uang bayar = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar - totalb;
            System.out.println("uang kembali = Rp." + kembali);
            System.out.println("==============================");
            System.out.println("terima kasih");
            System.out.println("selamat belanja kembali");
    }
    }
    
}
