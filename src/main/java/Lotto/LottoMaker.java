package Lotto;

public class LottoMaker {
    private int LottoCount;
    private final static int LottoPrice = 1000;

    public LottoMaker(int purchaseAmount) {
        this.LottoCount = makeLottoCount(purchaseAmount);
    }

    private int makeLottoCount(int purchaseAmount) {
        return (purchaseAmount / LottoPrice);
    }

    public int getLottoCount() {
        return LottoCount;
    }
}
