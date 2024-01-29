/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class hello_world {

    /**
     * @param args the command line arguments
     */
    public void panggilAku(){
        String nama, alamat, kelahiran, hobi;
        
        nama = "Budi";
        alamat = "Jalan Bunga";
        kelahiran = "waykanan 10 11 1995";
        hobi = "makan";
        
        //Scanner JavaIn = new Scanner(System.in);
        
        //System.out.println("Hello World!");
        
        System.out.println("++++++ BIODATA DIRI ++++++");
        System.out.println("\n\nNama Saya adalah : " + nama);
        System.out.println("Alamat saya di : " + alamat);
        System.out.println("Tempat dan Tanggal lahir saya : " + kelahiran);
        System.out.println("Saya sangat suka : " + hobi);
        System.out.println("==========================");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
}
