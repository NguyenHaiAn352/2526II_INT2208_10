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
public class mainTest 
{
    /**
     * Test Case 1: 17 - 43M - 564 - F
     */
    @Test
    public void testCase1()
    {
        String input = "17\n43000000\n564\nF";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn((in));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});
        
        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

     /**
     * Test Case 2: 66 - 432M - 333 - F
     */
    @Test
    public void testCase2()
    {
        String input = "66\n432000000\n333\nF";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn((in));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});
        
        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

     /**
     * Test Case 3: 23 - 4.9M - 758 - C
     */
    @Test
    public void testCase3()
    {
        String input = "23\n4900000\n758\nC";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn((in));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});
        
        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

    /**
     * Test Case 4: 34 - 500.1M - 435 - F
     */
    @Test
    public void testCase4() {
        String input = "34\n500100000\n435\nF\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

    /**
     * Test Case 5: 45 - 234M - 299 - C
     */
    @Test
    public void testCase5() {
        String input = "45\n234000000\n299\nC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

    /**
     * Test Case 6: 56 - 129M - 851 - C
     */
    @Test
    public void testCase6() {
        String input = "56\n129000000\n851\nC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

    /**
     * Test Case 7: 23 - 65M - 432 - A
     */
    @Test
    public void testCase7() {
        String input = "23\n65000000\n432\nA\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Invalid Input", consoleOutput);
    }

    /**
     * Test Case 8: 65 - 20M - 300 - C -> Reject
     */
    @Test
    public void testCase8() {
        String input = "65\n20000000\n300\nC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Reject", consoleOutput);
    }

    /**
     * Test Case 9: 34 - 5M - 550 - F -> Reject
     */
    @Test
    public void testCase9() {
        String input = "34\n5000000\n550\nF\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Reject", consoleOutput);
    }

    /**
     * Test Case 10: 18 - 14M - 750 - F -> Reject
     */
    @Test
    public void testCase10() {
        String input = "18\n14000000\n750\nF\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Reject", consoleOutput);
    }

    /**
     * Test Case 11: 54 - 7M - 850 - C -> Manual Review
     */
    @Test
    public void testCase11() {
        String input = "54\n7000000\n850\nC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Manual Review", consoleOutput);
    }

    /**
     * Test Case 12: 26 - 500M - 725 - F -> Manual Review
     */
    @Test
    public void testCase12() {
        String input = "26\n500000000\n725\nF\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Manual Review", consoleOutput);
    }

    /**
     * Test Case 13: 62 - 45M - 666 - F -> Manual Review
     */
    @Test
    public void testCase13() {
        String input = "62\n45000000\n666\nF\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Manual Review", consoleOutput);
    }

    /**
     * Test Case 14: 23 - 234M - 555 - C -> Approve
     */
    @Test
    public void testCase14() {
        String input = "23\n234000000\n555\nC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Approve", consoleOutput);
    }

    /**
     * Test Case 15: 44 - 324M - 777 - C -> Approve
     */
    @Test
    public void testCase15() {
        String input = "44\n324000000\n777\nC\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main.main(new String[]{});

        String consoleOutput = out.toString().trim();
        assertEquals("Approve", consoleOutput);
    }

}
