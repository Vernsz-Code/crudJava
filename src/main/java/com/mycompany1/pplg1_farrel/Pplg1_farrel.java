/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany1.pplg1_farrel;
import latihan1.percabangan;
import latihan1.array;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import latihan2.calculator;
/**
 *
 * @author asus
 */
public class Pplg1_farrel {

    public static void main(String[] args) {
        // hello_world hello = new hello_world();
        // hello.panggilAku();
//        percabangan percabangan = new percabangan();
//        array arr = new array();
//        arr.array2d();

        calculator calc = new calculator();
        calc.addWindowListener(new MyWindowListener());
        calc.setVisible(true);
    }
    static class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            // Menangani peristiwa penutupan
            int option = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
