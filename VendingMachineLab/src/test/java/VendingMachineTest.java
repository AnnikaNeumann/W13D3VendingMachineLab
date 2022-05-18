import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void canAddCoin(){
        vendingMachine.addCoin(coin);
        assertEquals(1, vendingMachine.numberOfCoins());
    }

    @Test
    public void canCheckIfValid(){
        coin = new Coin(CoinType.FIVE);
        vendingMachine.addCoin(coin);
        assertEquals(0, vendingMachine.numberOfCoins());
        assertEquals(1, vendingMachine.numberOfCoinsInReturn());
        }
}
