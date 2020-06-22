package Lotto;

public class LottoMaker {
    private final static int LottoPrice = 1000;

    private int LottoCount;

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
