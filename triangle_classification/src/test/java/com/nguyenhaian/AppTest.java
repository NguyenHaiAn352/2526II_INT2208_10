package com.nguyenhaian;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static String getSystemOutput (String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn((in));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});
        
        String consoleOutput = out.toString().trim();
        return consoleOutput;
    }

    /**
     * Test Case 1: 0 - 50 - 50
     */
    @Test
    public void testCase1()
    {
        String input = "0\n50\n50";
        assertEquals("Invalid Input", getSystemOutput(input));
    }

    /**
     * Test Case 2: 101 - 50 - 50
     */
    @Test
    public void testCase2()
    {
        String input = "101\n50\n50";
        assertEquals("Invalid Input", getSystemOutput(input));
    }

    /**
     * Test Case 3: 50 - 0 - 50
     */
    @Test
    public void testCase3()
    {
        String input = "50\n0\n50";
        assertEquals("Invalid Input", getSystemOutput(input));
    }

    /**
     * Test Case 4: 50 - 101 - 50
     */
    @Test
    public void testCase4()
    {
        String input = "50\n101\n50";
        assertEquals("Invalid Input", getSystemOutput(input));
    }

    
    /**
     * Test Case 5: 50 - 50 - 0
     */
    @Test
    public void testCase5()
    {
        String input = "50\n50\n0";
        assertEquals("Invalid Input", getSystemOutput(input));
    }

    /**
     * Test Case 6: 50 - 50 - 101
     */
    @Test
    public void testCase6()
    {
        String input = "50\n50\n101";
        assertEquals("Invalid Input", getSystemOutput(input));
    }

    /**
     * Test Case 7: R1 + 1 - 2 - 3
     */
    @Test
    public void testCase7()
    {
        String input = "1\n2\n3";
        assertEquals("Not a Triangle", getSystemOutput(input));
    }

    /**
     * Test Case 8: R2 + 50 - 50 - 50
     */
    @Test
    public void testCase8()
    {
        String input = "50\n50\n50";
        assertEquals("Equilateral", getSystemOutput(input));
    }

    /**
     * Test Case 9: R2 + 100 - 100 - 100
     */
    @Test
    public void testCase9()
    {
        String input = "100\n100\n100";
        assertEquals("Equilateral", getSystemOutput(input));
    }

    /**
     * Test Case 10: R3 + 50 - 50 - 40
     */
    @Test
    public void testCase10()
    {
        String input = "50\n50\n40";
        assertEquals("Isosceles", getSystemOutput(input));
    }

    /**
     * Test Case 11: R4 + 40 - 50 - 50
     */
    @Test
    public void testCase11()
    {
        String input = "40\n50\n50";
        assertEquals("Isosceles", getSystemOutput(input));
    }

    /**
     * Test Case 12: R5 + 50 - 40 - 50
     */
    @Test
    public void testCase12()
    {
        String input = "50\n40\n50";
        assertEquals("Isosceles", getSystemOutput(input));
    }

    /**
     * Test Case 13: R6 + 3 - 4 - 5
     */
    @Test
    public void testCase13()
    {
        String input = "3\n4\n5";
        assertEquals("Scalene", getSystemOutput(input));
    }

    /**
     * Test Case 14: R6 + 98 - 99 - 100
     */
    @Test
    public void testCase14()
    {
        String input = "98\n99\n100";
        assertEquals("Scalene", getSystemOutput(input));
    }

    /**
     * Test Case 15: R1 + 10 - 20 - 50
     */
    @Test
    public void testCase15()
    {
        String input = "10\n20\n50";
        assertEquals("Not a Triangle", getSystemOutput(input));
    }
}
