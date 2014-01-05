package com.lawrence.algorithms;

import edu.princeton.cs.introcs.StdOut;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: lawrence
 * Date: 14-1-5
 * Time: AM11:11
 * Description:
 */
public class Practice1 {
    private long startTime;

    /**
     * Practice 1.1.1
     */
    @Test
    public void p1_1_1() {
        //a.
        System.out.println((0 + 15) / 2);

        //b.
        StdOut.println(2.0e-6 * 100000000.1);

        //c.
        StdOut.println(true && false || true && true);
    }


    @Before
    public void timerStart() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void timerStop() {
        System.out.println("\n[Time used]:" + (System.currentTimeMillis() - startTime));
        System.out.println("===================================\n");
    }
}
