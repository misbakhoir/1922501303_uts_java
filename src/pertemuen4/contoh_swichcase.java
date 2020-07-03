/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuen4;

/**
 *
 * @author HP
 */
 import java.util.Scanner;
public class contoh_swichcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String makanan,pilih,bonus;
        int total,jumlah,harga,total_bayar;
        
        System.out.println("======WARUNG MAKAN======");
        System.out.println("");
        
        System.out.println("1.pecel lele  2.ayam goreng 3.ayam bakar ");
        System.out.println("masukkan pilihan anda");
        pilih = input.nextLine();
        
        switch (pilih){
            case "1" : makanan = "pecel lele";
            harga = 14000;
            break;
            case "2" : makanan = "ayam goreng";
            harga = 18000;
            break;
            case "3" : makanan = "ayam bakar";
            harga = 20000;
            break;
            default : makanan = "tidak ada";
            harga = 0;
            break;
            
        }
        System.out.println("jumlah yang di beli");
        jumlah = input.nextInt();
        total = harga*jumlah;
        if (total>=30000)
        bonus ="es teh";
        else
        bonus = "air putih";
        
        System.out.println(" makanan :" + makanan);
        System.out.println(" harga   :" + harga);
        System.out.println(" jumlah beli :" + jumlah);
        System.out.println(" total :" + total);
        System.out.println(" bonus :" + bonus);
        
        
        
    }
    
}
