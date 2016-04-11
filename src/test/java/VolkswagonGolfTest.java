import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VolkswagonGolfTest {

    @Test
    public void testCost() throws Exception {
        VolkswagonGolf testVW = new VolkswagonGolf();

        double expected = 24000;

        double actual = testVW.cost();

        assertEquals(actual, expected, 0.01);

    }

    @Test
    public void testGetDescription() throws Exception {

        VolkswagonGolf testVW = new VolkswagonGolf();

        String expected = "Volkswagon Golf with: ";

        String actual = testVW.getDescription();

        assertEquals(actual, expected);
    }
}

