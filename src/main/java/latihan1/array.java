/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;
import java.util.Scanner;

 /*
 *bayu 
       gam  
 */
public class array {
    public void array2d(){
     Scanner inputan= new Scanner(System.in);
        int A [][]=new int [2] [2];
        int B [][]=new int [2] [2];
        int C [][]=new int [2] [2];
        
        System.out.println("masukkan nilai matriks X");
        System.out.println("=======================");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {    
                System.out.print("[" + (i+1) + "] [" +(j+1) + "] :");
                A [i][j]=inputan.nextInt();
            }
        }
        System.out.println("\nMasukkan Nilai Matriks Y") ;
        System.out.println("==========================");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {    
                System.out.print("[" + (i+1) + "] [" +(j+1) + "] :");
                B [i][j]=inputan.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {    
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("\nHASIL PENJUMLAHAN MATRIKS : ") ;
        System.out.println("==========================");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            { 
                System.out.print(+(C[i][j])+"");
                System.out.println("");
            }
        }
    }
}
