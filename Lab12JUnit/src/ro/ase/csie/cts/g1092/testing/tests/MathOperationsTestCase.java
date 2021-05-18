package ro.ase.csie.cts.g1092.testing.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import ro.ase.csie.cts.g1092.testing.models.MathOperations;

import static org.junit.Assert.*;

public class MathOperationsTestCase {


    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Clean up");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Hello from test case");
    }

    @Test
    public void test(){
        fail("not yet implemented");
    }

    @Test
    public void testAdd() {
        System.out.println("App started");

        int a = 5;
        int b = 5;
        int expectedResult = 10;
        int result = MathOperations.add(a, b);
        assertEquals("Testing adding 2 int values", expectedResult, result);

    }



}