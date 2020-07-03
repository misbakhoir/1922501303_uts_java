/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class contoh_bufferedRedaer {
    public static void main(String[] args) throws IOException {
        String nama;
        String alamat;
        String jabatan;
        String status;
        String ibu;
        //objek input stream
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //objek bufferedReader
        BufferedReader   br = new BufferedReader(isr);
        
        // variabel nama
        System.out.println("===========  BIODATA  ===========");
        System.out.println("siapa nama anda ? ");
        nama = br.readLine();
        System.out.println("alamat anda ? ");
        alamat = br.readLine();
        System.out.println(" jabatan anda ? ");
        jabatan = br.readLine();
        System.out.println(" apa status anda ? ");
        status = br.readLine();
        System.out.println("siapa nama ibu anda ?");
        ibu = br.readLine();
        
        // menampilkan output
        System.out.println("==========  BIODATA  ===========");
        
        System.out.println(" nama saya adalah" + nama );
        System.out.println(" alamat" + alamat);
        System.out.println(" jabatan" + jabatan);
        System.out.println(" status" + status);
        System.out.println("nama ibu" + ibu );
        
                
    }
    
}
