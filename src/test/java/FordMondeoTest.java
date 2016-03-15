import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FordMondeoTest {

    @Test
    public void testCost() throws Exception {
        FordMondeo testFord = new FordMondeo();

        double expected = 28000;

        double actual = testFord.cost();

        assertEquals(actual, expected, 0.01);

    }

    @Test
    public void testGetDescription() throws Exception {

        FordMondeo testFord = new FordMondeo();

        String expected = "Ford Mondeo with: ";

        String actual = testFord.getDescription();

        assertEquals(actual, expected);
    }
}