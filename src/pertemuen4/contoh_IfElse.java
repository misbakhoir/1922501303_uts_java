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
public class contoh_IfElse {
    public static void main(String[] args) {
       //variabel dan Scanner
       int nilai;
       String nama;
       Scanner scan = new Scanner(System.in);
        
       // masukkan input
       System.out.print(" nama  :");
       nama = scan.nextLine();
        System.out.println(" nilai  :");
        nilai = scan.nextInt();
        
        //output
        if(nilai >=70){
            System.out.println(" selamat " + nama + " anda lulus");
        }
        else
            System.out.println(" maaf " + nama + " anda gagal");
        
        }
       
    }
          
    

