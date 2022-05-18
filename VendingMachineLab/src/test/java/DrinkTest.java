import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    Drink drink;

    @Before
    public void setUp(){
        drink = new Drink("Coke", "Coca Cola");
    }

    @Test
    public void hasName(){
        assertEquals("Coke", drink.getName());
    }

    @Test
    public void hasBrand(){
        assertEquals("Coca Cola", drink.getBrand());
    }
}
