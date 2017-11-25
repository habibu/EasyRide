package service;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import model.CarRental;

/**
 * Unit test for simple Car.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    CarRental carRental = new CarRental();
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("Testing");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
