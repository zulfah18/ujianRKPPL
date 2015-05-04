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
       //faktorial
       int Tampung = s1.faktorial(5);
       assertNotNull("seharusnya tidak null", Tampung);
   }
   
   @Test
   public void test2() {
       //faktorial
       int Tampung2 = s1.faktorial(-1);
       assertNotNull("seharusnya error", Tampung2);
   }
   
   @Test
   public void test3() {
       //pangkat
       assertSame("Harusnya ", 10, s1.pangkat(5, 2));
   }
   
   @Test
   public void test4() {
       //pangkat
       assertSame("Harusnya ", 6, s1.pangkat(3, 2));
   }
   
   @Test
   public void test5() {
     assertSame("Harusnya ", 6, s1.perkalian(2, 3));
   }
   
   @Test
   public void test6() {
      assertSame("Harusnya ", 9, s1.perkalian(3, 3));
   }
   
   @After
   public void testAkhir() {
       System.out.println("TEST BERAKHIR");
   }
   
   
   
    
}
