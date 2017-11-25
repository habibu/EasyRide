package service;

import junit.framework.Test;
import junit.framework.TestCase;
import model.CarModel;
import model.Cliente;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static model.CarModel.BMW;
import static model.CarModel.Mercedes;
import static org.junit.Assert.*;

/**
 * Unit test for simple Car.
 */
public class ClienteTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private Cliente Szomba;
    private Cliente David;
    private Cliente Gabor;

    @BeforeClass
    public static void beforeClass() {
//        System.out.println("before class - runs once");
    }

    @AfterClass
    public static void afterClass() {
//        System.out.println("after class - runs once");
    }


    /**
     public ClienteTest( String testName )
    {

        System.out.println("Testing");
    }
     */
    @Before
    public void setUp() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.David = new Cliente(
                "David",
                "Kovacs",
                dateFormat.parse("1975-06-04"),
                null,
                CarModel.BMW);
        this.Gabor = new Cliente(
                "Gabor",
                "Kiss",
                dateFormat.parse("1929-10-31"),
                null,
                CarModel.Ferrari
        );
        this.Szomba = new Cliente(
                "Szomba",
                "Moreira",
                dateFormat.parse("2007-10-31"),
                null,
                CarModel.Jeep
        );
    }

    @After
    public void tearDown() {
//        System.out.println("tear down");
    }

    @Test
    public void testName() {
        assertEquals(David.getFirstName(), "David");
    }

    @Test
    public void testRent() {
        assertEquals(David.getCarModel().compareTo(Mercedes));
    }

    @Test
    public void testName() {
        assertEquals(Gabor.getsurName(), "Testing");
    }

    @Test
    public void testRent() {
        assertEquals(Gabor.getCarModel().compareTo(BMW));
    }

    private void assertEquals(int i) {
    }

    private void assertEquals(String firstName, String david) {
    }

    /**
     * @return the suite of tests being tested

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)

    public void testApp()
    {
        assertTrue( true );
    }
     */
}
