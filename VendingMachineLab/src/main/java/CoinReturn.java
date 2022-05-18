import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public double CoinCount(){
        double total = 0.0;
        for (Coin coin: coins){
            total += coin.getCoinValue();
        }
        return total;
    }

    public void addCoinToDrawer(Coin coin){
        this.coins.add(coin);
    }

    public int numberOfCoins(){
        return this.coins.size();
    }


}
