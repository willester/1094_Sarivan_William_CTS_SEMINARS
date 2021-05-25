package ro.ase.csie.cts.g1092.testing.tests;

import org.junit.*;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1092.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1092.testing.models.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestStudent {

    // test fixture
    static Student student;
    static ArrayList<Integer>  grades;
    static String initialName;
    static int initialAge;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        grades = new ArrayList<>();
        grades.add(9);
        grades.add(10);
        initialName = "John";
        initialAge = 21;
    }

    @Before
    public void setUp() throws Exception {
        student = new Student(initialName, initialAge, grades);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        grades.clear();
        grades = null;
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test(){
        fail();
    }

    @Test
    public void testSetNameRightValues() throws WrongNameException {
        String newName = "Alice";
        student.setName(newName);
        assertEquals("Testing with proper name", newName, student.getName());

    }

    @Test
    public void testSEtAgeRightValues(){
        int newAge = initialAge + 1;
        try {
            student.setAge(newAge);
            assertEquals("testing for proper age value", newAge, student.getAge());
        } catch (WrongAgeException e) {
            fail("we got an exception when that was not expected");
        }
    }




}