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
        String beli = input.nextLine();
        int i = 0;


           
    System.out.println( " nama barang ke- "+i+ "=");
    String nama = input.next();
    System.out.println(" harga "+i+ "=");
    int harga = input.nextInt();
    System.out.println(" jumlah "+i+ "=");
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
    }
    }
    
}

}