import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin;
    Drawer drawer;
    Drink drink;

    @Before
    public void setUp(){
        coin =  new Coin(CoinType.POUND);
        vendingMachine = new VendingMachine();
        drawer = new Drawer(Drawer.Code.C1, 2.00);
        drink = new Drink("Water", "Highland Spring");
        drawer.addToDrawer(drink);
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

    @Test
    public void canAddDrawer() {
        vendingMachine.addDrawer(drawer);
        assertEquals(1, vendingMachine.numberOfDrawers());

    }

    @Test
    public void canBuyProduct(){
        vendingMachine.addDrawer(drawer);
        vendingMachine.addCoin(coin);
        vendingMachine.addCoin(coin);
        vendingMachine.buyProduct(Drawer.Code.C1);
        assertEquals(0, vendingMachine.getDrawer(Drawer.Code.C1).productCount());
        assertEquals(0, vendingMachine.coinCount(), 0.0);
    }

}
