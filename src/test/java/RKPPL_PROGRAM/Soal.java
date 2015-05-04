/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RKPPL_PROGRAM;

/**
 *
 * @author SB6 604-12
 */
public class Soal {

  
    
    public int pangkat(int bil, int pangkat) {
        int hasil =0;
        int n = 1;
        while(n<= pangkat) {
            n++;
            hasil *= bil;
        }
        return hasil;
    }
    
    public int faktorial(int bil) {
        int hasil = 1;
        for (int i = 1; i < 10; i++) {
            hasil *= i;
        }
        return hasil;
    }
    
    public int perkalian(int  bilA, int bilB) {
        return bilA * bilB;
    }
    
 
    
    
   
}
