/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author FADJRUL
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 12code application logic here
        
            System.out.println( "program Array mencari nilai maximum dan nilai minimum");
            System.out.println();
             
            Scanner sc = new Scanner(System.in);
            int x[] = new int[100];
            int jml = 100, stop = 0;
            for (int i=0;i<jml;i++) {
                System.out.print("Masukkan data " + (i+1) + " = ");
                x[i] = sc.nextInt();
                    if(x[i]==-1){
                        jml = -1;
                        stop =i;
                    }
            } 
            
            int max = x[0];
            int min = x[0];
            for(int i=0;i<stop;i++) {
                if (x[i]>max){
                    max = x[i];
                }
                else if(x[i]<min){
                    min= x[i];
                }
            }
            
                 
            System.out.println("");
            System.out.println("Nilai maximum : " + max);
            System.out.println("Nilai minimum : " + min);
        }
    }
