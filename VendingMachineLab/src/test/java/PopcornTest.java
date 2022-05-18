import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PopcornTest {

    Popcorn popcorn;

    @Before
    public void setUp(){
        popcorn = new Popcorn("Salted", "Proper Corn");
    }

    @Test
    public void hasName(){
        assertEquals("Salted", popcorn.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Proper Corn", popcorn.getBrand());
    }

}
