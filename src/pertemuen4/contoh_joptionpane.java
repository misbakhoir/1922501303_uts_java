/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuen4;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class contoh_joptionpane {
    public static void main(String[] args) {
        String salam = JOptionPane.showInputDialog("halo");
        JOptionPane.showMessageDialog(null,"  " + salam);
        String nama = JOptionPane.showInputDialog("nama kamu siapa");
        JOptionPane.showMessageDialog(null,"nama kamu " + nama);
        String status = JOptionPane.showInputDialog("  status kamu apa");
        JOptionPane.showMessageDialog(null," status " + status);
        String kelas = JOptionPane.showInputDialog("masuk kelas apa ");
        JOptionPane.showMessageDialog(null, "kelas " + kelas);
        String semester =JOptionPane.showInputDialog(" semester berapa");
        JOptionPane.showMessageDialog(null,"semester " + semester );
              
    
    }
}
