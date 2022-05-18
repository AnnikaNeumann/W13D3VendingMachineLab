public enum CoinType {

    TEN(0.1),
    TWENTY(0.2),
    FIFTY(0.5),
    POUND(1.0),
    ONE(0.01),
    TWO(0.02),
    FIVE(0.05);

    private final double value;
    CoinType(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}


