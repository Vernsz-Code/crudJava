/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */

public class percabangan {
    public void ifelse(int nilai){
        String hasil = "Grade = ";
        if(nilai >= 90 && nilai <= 100){
            hasil += "A";
        }
        else if(nilai >= 80 && nilai < 90){
            hasil += "B";
        }
        else if(nilai >= 70 && nilai < 80){
            hasil += "C";
        }
        else if (nilai >= 0 && nilai < 70){
            hasil += "D";
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Nilai Diluar Nalar coy");
            return;
        }
        JOptionPane.showMessageDialog(null, hasil);
    }

    public void switchcase(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String hadiah[] = {
            "mobil", "zonk", "motor", "handphone"
        };
        
        int[] hadiahRandom = new int[5];
        String[] hasilHadiahRandom = new String[5];
        
        int random, pilihHadiah;
        
        for(int i = 0; i < 5; i++){
            random = rand.nextInt(5);
            hadiahRandom[i] = random;
            System.out.println(random);
            hasilHadiahRandom[i] = hadiah[hadiahRandom[i]];
        }
        System.out.print("Pilih Hadiah mu [0/4]:");
        pilihHadiah = sc.nextInt();
        
        System.out.println("Hadiah Mu : " + hasilHadiahRandom[pilihHadiah]);
    }
    
    public static void yayaya() {
        int nilai, nilaiA, nilaiB, hasil;
        String haha = "Nilai Akhir : ";
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Nilai A :");
        nilaiA = sc.nextInt();

        System.out.println("Masukan Nilai B :");
        nilaiB = sc.nextInt();

        System.out.println("Masukan OPERASI 1(+) 2(-) 3(*) 4(/) 5(exit) :");
        nilai = sc.nextInt();

        hasil = switch (nilai) {
            case 1 -> nilaiA + nilaiB;
            case 2 -> nilaiA - nilaiB;
            case 3 -> nilaiA * nilaiB;
            case 4 -> (nilaiB != 0) ? nilaiA / nilaiB : 0; // Check for division by zero
            case 5 -> {
                System.out.println("Program telah berhenti");
                yield 0;
            }
            default -> 0;
        };

        haha += hasil;

        System.out.println(haha);
    }
}
