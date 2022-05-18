import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DvdTest {

    Dvd dvd;

    @Before
    public void setUp(){
        dvd = new Dvd("Mamma Mia", "Universal Studios");
    }

    @Test
    public void hasName(){
        assertEquals("Mamma Mia", dvd.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Universal Studios", dvd.getBrand());
    }
}
