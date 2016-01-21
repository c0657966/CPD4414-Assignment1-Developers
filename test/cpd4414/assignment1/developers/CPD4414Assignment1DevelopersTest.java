/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.developers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0657050
 */
public class CPD4414Assignment1DevelopersTest {

    public CPD4414Assignment1DevelopersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of stringPower method, of class CPD4414Assignment1Developers.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("testEmptyStringShouldReturnEmptyString");
        String str = "";
        int a = 1;
        String expResult = "";
        String result = CPD4414Assignment1Developers.stringPower(str, a);
        assertEquals(expResult, result);
    }

    @Test
    public void testLessThanOneShouldReturnNull() {
        System.out.println("testLessThanOneShouldReturnNull");
        String str = "abc";
        int a = 0;
        String expResult = null;
        String result = CPD4414Assignment1Developers.stringPower(str, a);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndOneShouldReturnString() {
        System.out.println("testStringAndOneShouldReturnString");
        String str = "abc";
        int a = 1;
        String expResult = "abc";
        String result = CPD4414Assignment1Developers.stringPower(str, a);
        assertEquals(expResult, result);
    }
      @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String str = "abc";
        int a = 2;
        String expResult = "abcabc";
        String result = CPD4414Assignment1Developers.stringPower(str, a);
        assertEquals(expResult, result);
    }
}
