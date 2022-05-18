import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void setUp(){
        coin = new Coin(CoinType.TEN);
    }

    @Test
    public void hasCoinType(){
        assertEquals(0.10, coin.getCoinValue(), 0.0);
    }




}
