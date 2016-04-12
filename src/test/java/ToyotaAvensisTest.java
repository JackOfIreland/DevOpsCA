import org.junit.Test;

import static org.junit.Assert.*;

public class ToyotaAvensisTest {

    @Test
    public void testCost() throws Exception {
        ToyotaAvensis testToyota = new ToyotaAvensis();

        double expected = 26000;

        double actual = testToyota.cost();

        assertEquals(actual, expected, 0.01);

    }

    @Test
    public void testGetDescription() throws Exception {

        ToyotaAvensis testToyota = new ToyotaAvensis();

        String expected = "Toyota Avensis with: ";

        String actual = testToyota.getDescription();

        assertEquals(actual, expected);

    }
}