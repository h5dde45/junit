package cl;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorImplTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();
    }

    @Test
    public void add() throws Exception {
        //case1
        int expectedResult1=10;
        int actualResult1=calculator.add(3,7);
        assertEquals(expectedResult1,actualResult1);
        //case2
        int expectedResult2=-4;
        int actualResult2=calculator.add(3,-7);
        assertEquals(expectedResult2,actualResult2);
        //case3
        int expectedResult3=-10;
        int actualResult3=calculator.add(-3,-7);
        assertEquals(expectedResult3,actualResult3);

    }

    @Test
    public void sub() throws Exception {
        //case1
        int expectedResult1=7;
        int actualResult1=calculator.sub(10,3);
        assertEquals(expectedResult1,actualResult1);
        //case2
        int expectedResult2=-13;
        int actualResult2=calculator.sub(-10,3);
        assertEquals(expectedResult2,actualResult2);
    }

    @Test
    public void mul() throws Exception {
        //case1
        int expectedResult1=21;
        int actualResult1=calculator.mul(3,7);
        assertEquals(expectedResult1,actualResult1);
        //case2
        int expectedResult2=-21;
        int actualResult2=calculator.mul(3,-7);
        assertEquals(expectedResult2,actualResult2);
        //case3
        int expectedResult3=21;
        int actualResult3=calculator.mul(-3,-7);
        assertEquals(expectedResult3,actualResult3);
    }

    @Test
    public void div() throws Exception {
        //case1
        int expectedResult1=3;
        int actualResult1=calculator.div(21,7);
        assertEquals(expectedResult1,actualResult1);
        //case2
        int expectedResult2=-3;
        int actualResult2=calculator.div(-21,7);
        assertEquals(expectedResult2,actualResult2);
        //case3
        int expectedResult3=3;
        int actualResult3=calculator.div(-21,-7);
        assertEquals(expectedResult3,actualResult3);
        //case4
        int expectedResult4=0;
        int actualResult4=calculator.div(-21,0);
        assertEquals(expectedResult4,actualResult4);
        //case5
        int expectedResult5=0;
        int actualResult5=calculator.div(0,0);
        assertEquals(expectedResult5,actualResult5);
        //case6
        int expectedResult6=0;
        int actualResult6=calculator.div(0,3);
        assertEquals(expectedResult6,actualResult6);
    }

}