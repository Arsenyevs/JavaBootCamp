package sef.Final_Task.Activity2;

import junit.framework.TestCase;


public class CalculatorTest extends TestCase {
    private Calculator theCalc;

    protected void setUp() throws Exception {
        super.setUp();
        theCalc = new Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testAddition() {

        int a = 17;
        int b = 18;
        assertEquals(35, (theCalc.Addition(a,b)));
        assertEquals(35, (theCalc.Addition(b,a)));

        a = -17;
        b = 8;
        assertEquals(-9, (theCalc.Addition(a,b)));
        assertEquals(-9, (theCalc.Addition(b,a)));

        a = -17;
        b = -8;
        assertEquals(-25, (theCalc.Addition(a,b)));
        assertEquals(-25, (theCalc.Addition(b,a)));
    }

    public void testMultiply() {

        double a = 17;
        double b = 8;
        assertEquals(136, (theCalc.Multiply(a,b)),0);
        assertEquals(136, (theCalc.Multiply(b,a)),0);

        a = -17;
        b = 8;
        assertEquals(-136, (theCalc.Multiply(a,b)),0);
        assertEquals(-136, (theCalc.Multiply(b,a)),0);

        a = -17;
        b = -8;
        assertEquals(136, (theCalc.Multiply(a,b)),0);
        assertEquals(136, (theCalc.Multiply(b,a)),0);
    }
    public void testGetQuotient() {

        double a = 17;	double b = 8;
        assertEquals(2.125, (theCalc.Devide(a,b)),0);
        assertEquals(0.47058823529411764,(theCalc.Devide(b,a)),0);

        a = 17;	b = -8;
        assertEquals(-2.125, (theCalc.Devide(a,b)),0);
        assertEquals(-0.47058823529411764, (theCalc.Devide(b,a)),0.007);

        a = -17;	b = -8;
        assertEquals(2.125, (theCalc.Devide(a,b)),0);
        assertEquals(0.47058823529411764, (theCalc.Devide(b,a)),0);
    }

    public void testDifference() {

        int a = 17;
        int b = 8;
        assertEquals(9, (theCalc.Difference(a,b)));
        assertEquals(-9, (theCalc.Difference(b,a)));

        a = 17;
        b = -8;

        assertEquals(25, (theCalc.Difference(a,b)));
        assertEquals(-25, (theCalc.Difference(b,a)));

        a = -17;
        b = -8;
        assertEquals(-9, (theCalc.Difference(a,b)));
        assertEquals(9, (theCalc.Difference(b,a)));
    }
}
