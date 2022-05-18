import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin;


    @Before
    public void setUp(){
        coin =  new Coin(CoinType.TEN);
        vendingMachine = new VendingMachine();
    }

    @Test
    public void coinsStartEmpty(){
        assertEquals(0, vendingMachine.numberOfCoins());
    }

    @Test
    public void drawersStartEmpty(){
        assertEquals(0, vendingMachine.numberOfDrawers());
    }

    @Test
    public void hasCoinReturn(){
        assertEquals(0, vendingMachine.numberOfCoinsInReturn());
    }
}
