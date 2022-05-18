import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> coins;
    private CoinReturn coinReturn;

    public VendingMachine() {
        drawers = new ArrayList<Drawer>();
        coinReturn = new CoinReturn();
        coins = new ArrayList<Coin>();
    }

    public void addCoin(Coin coin){
        if (isValid(coin)) {
            coins.add(coin);
        }
        else{
            coinReturn.addCoinToDrawer(coin);
        }
    }

    public boolean isValid(Coin coin){
        return coin.getCoinValue() > 0.05;
    }

    public int numberOfCoins(){
        return coins.size();
    }

    public int numberOfDrawers(){
        return drawers.size();
    }

    public int numberOfCoinsInReturn(){
        return this.coinReturn.numberOfCoins();
    }


}
