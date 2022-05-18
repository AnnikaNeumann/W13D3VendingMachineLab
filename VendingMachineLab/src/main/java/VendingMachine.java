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

    public void addDrawer(Drawer drawer){
        drawers.add(drawer);
    }

    public Product buyProduct(Drawer.Code code) {
        if (coinCount() >= getDrawer(code).getPrice()) {
            this.coins.clear();
            return getDrawer(code).removeFromDrawer();
        }
        return null;
    }


    public Drawer getDrawer(Drawer.Code code) {
        for (Drawer drawer : drawers) {
            if (drawer.getCode() == code) {
                return drawer;
            }
        }
        return null;
    }




    public double coinCount(){
        double total = 0.0;
        for (Coin coin: coins){
            total += coin.getCoinValue();
        }
        return total;
    }

}
