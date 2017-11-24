package Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void run() throws Exception {
        Context context = new Context();
        /*int actual = context.run("C2+3=");
        int expect = 5;

        assertEquals(expect,actual);
        */

        assertEquals(0, context.run("C"));
        assertEquals(2, context.run("C2"));
        assertEquals(6, context.run("C3+3="));
        assertEquals(24645, context.run("C24645"));
        assertEquals(24645, context.run("C24645="));
        assertEquals(100, context.run("С125-25="));
        assertEquals(777, context.run("С123+654="));
        assertEquals(8, context.run("C2+2*2="));
        assertEquals(2025, context.run("С45*45="));
        assertEquals(1, context.run("С9/5="));
        assertEquals(0, context.run("С9654*0="));
        assertEquals(40, context.run("C45+-*-5="));
        assertEquals(45, context.run("C5+15=30="));
    }

}