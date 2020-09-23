package com.sameer.source;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSumWithPositives()
    {
        Arithmetic arth = null; 

        // create object
        arth = new Arithmetic(); 
        int actual = arth.sum(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }
    @Test
    public void testSumwithNegatives()
    {
        Arithmetic arth = null; 

        // create object 
        arth = new Arithmetic(); 
        int actual = arth.sum(-10, -20); 
        int expected = -30; 
        assertEquals(expected, actual);
    }

    @Test
    public void testSumwithMixed()
    {
        Arithmetic arth = null; 

        //create object
        arth = new Arithmetic(); 
        int actual = arth.sum(10, -20);
        int expected = -10; 
        assertEquals(expected, actual);
    }

    @Test
    public void testSumwithzeros()
    {
        Arithmetic arth = null; 

        // create object
        arth = new Arithmetic(); 
        int actual = arth.sum(0, 10);
        int expected = 10; 
        assertEquals(expected, actual);
    }
}
