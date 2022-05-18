import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    CoinReturn coinReturn;
    Coin coin;

    @Before
    public void setUp(){
        coinReturn = new CoinReturn();
        coin = new Coin(CoinType.POUND);
    }

    @Test
    public void hasEmptyCoinList(){
        assertEquals(0, coinReturn.numberOfCoins());
    }

    @Test
    public void canAddCoinToDrawer(){
        coinReturn.addCoinToDrawer(coin);
        coinReturn.addCoinToDrawer(coin);
        assertEquals(2, coinReturn.CoinCount(), 0.0);
    }



}


