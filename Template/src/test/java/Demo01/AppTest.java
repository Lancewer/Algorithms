package Demo01;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private long start_time;

    @Before
    public void timerStart() {
        start_time = System.currentTimeMillis();
    }


    @After
    public void timerStop() {
        System.out.println("\n[Total time]: " + (System.currentTimeMillis() - start_time));
    }

    @After
    public void after() {
        System.out.println("======================================\n");
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        System.out.println("This is practice 1");
        System.out.println("Method name:" + Thread.currentThread().getStackTrace()[1].getMethodName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(true);
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp2() {
        System.out.println("This is practice 2");
        assertTrue(true);
    }
}
