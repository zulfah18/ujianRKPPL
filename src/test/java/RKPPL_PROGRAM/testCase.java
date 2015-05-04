/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RKPPL_PROGRAM;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 *
 * @author SB6 604-12
 */
public class testCase {
    
   private static Soal s1;
   
   @Before
   public void testStart() {
       s1 = new Soal();
       System.out.println("==== TESTING DIMULAI ====");
   } 
   
   
   
   @Test
   public void test1() {
       //faktorial 1
       int Tampung = s1.faktorial(0);
       assertNotNull("seharusnya tidak null", Tampung);
   }
   
   @Test
   public void test2() {
       //faktorial 2
       int Tampung2 = s1.faktorial(6);
       assertNotNull("seharusnya tidak null", Tampung2);
   }
   
   @Test
   public void test3() {
       //pangkat
       assertNotSame("Harusnya ", 5, s1.pangkat(2, 2));
   }
   
   @Test
   public void test4() {
       //pangkat
       assertNotNull("seharusnya tidak null", s1.pangkat(3, 2));
   }
   
   @Test
   public void test5() {
     assertSame("Harusnya ", 6, s1.perkalian(2, 3));
   }
   
   @Test
   public void test6() {
      assertNotSame("Harusnya Bukan ", 3, s1.perkalian(3, 4));
   }
   
    @After
   public void testAkhir() {
       System.out.println("==========================");
   }
   
  
   
   
   
    
}
