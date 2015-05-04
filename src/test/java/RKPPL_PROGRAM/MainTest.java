/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RKPPL_PROGRAM;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author SB6 604-12
 */
public class MainTest {
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(testCase.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
        System.out.println("SUKSES");
    }
}
