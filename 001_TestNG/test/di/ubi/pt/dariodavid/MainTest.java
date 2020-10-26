import di.ubi.pt.dariodavid.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test(groups = { "correct"})
    public void testSomar()
    {
        assertEquals(4, Main.somar(3, 1));
    }

    @Test(groups = { "incorrect"})
    public void testSomar2()
    {
        assertNotEquals(-5, Main.somar(4, 1));
    }


}