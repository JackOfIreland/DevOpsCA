import org.junit.Test;

import static org.junit.Assert.*;

public class DesignACarTest {

    @Test
    public void testChooseCarType() throws Exception {
        ToyotaAvensis expected = new ToyotaAvensis();


        assertEquals(expected.getDescription(), DesignACar.chooseCarType(1).getDescription());


    }

    public void testChooseCarType2() throws Exception {
        FordMondeo expected = new FordMondeo();


        assertEquals(expected.getDescription(), DesignACar.chooseCarType(0).getDescription());


    }
}