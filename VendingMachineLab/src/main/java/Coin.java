public class Coin {

    private CoinType coinType;

    public Coin(CoinType coinType) {
        this.coinType = coinType;
    }

    public double getCoinValue() {
        return coinType.getValue();
    }



}
