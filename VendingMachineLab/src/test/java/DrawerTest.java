import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer;
    Drink drink;


    @Before
    public void setUp(){
        drawer = new Drawer(Drawer.Code.A1, 1.00);
        drink = new Drink("Beer", "Tennant");

    }

    @Test
    public void hasCode(){
        assertEquals(Drawer.Code.A1, drawer.getCode());
    }

    @Test
    public void hasPrice(){
        assertEquals(1.00, drawer.getPrice(), 0.0);
    }

    @Test
    public void productsStartEmpty(){
        assertEquals(0, drawer.productCount());
    }

    @Test
    public void canAddProduct(){
        drawer.addToDrawer(drink);
        assertEquals(1, drawer.productCount());
    }

    @Test
    public void canRemoveProduct(){
        drawer.addToDrawer(drink);
        drawer.removeFromDrawer();
        assertEquals(0, drawer.productCount());
    }


}
