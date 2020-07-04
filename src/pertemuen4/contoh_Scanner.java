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
public class contoh_Scanner {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);                
        System.out.print(" Nama : ");
        String Nama = input.nextLine();
        System.out.println(" NIM : ");
        String NIM  = input.nextLine();
        System.out.print(" Nilai UTS : ");
        int nilai1 = input.nextInt();
        System.out.print("Nilai UAS : ");
        int nilai2 = input.nextInt();
        
        System.out.println(" ===== NILAI AKHIR ======");
        System.out.println(" Nama : " + Nama);
        System.out.println(" NIM  : " + NIM);
        System.out.print("Nilai UTS dan Nilai UAS : " +(nilai1 + nilai2));
        System.out.println(" lebih semangat yaa");   

    }
}
        
        
        
       
       
     
        
        
        
    

