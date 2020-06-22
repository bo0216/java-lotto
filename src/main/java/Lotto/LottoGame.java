package Lotto;

import Lotto.Utils.LottoNumbers;
import Lotto.View.InputView;
import Lotto.View.ResultView;

public class LottoGame {
    public void startLotto() {
        LottoMaker lottoMaker = new LottoMaker(InputView.inputPurchaseAmount());
        int lottoCount = lottoMaker.getLottoCount();

        ResultView.printLottoCount(lottoCount);

        for (int i = 0; i < lottoCount; i++) {
            LottoNumbers lottoNumbers = new LottoNumbers();
            ResultView.printLottoNumbers(lottoNumbers.makeLottoNumbers());
        }

        InputView.inputWinningNumber();
    }
}
