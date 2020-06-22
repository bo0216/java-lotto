package Lotto;

import Lotto.Utils.LottoNumbers;
import Lotto.View.InputView;
import Lotto.View.ResultView;

public class LottoGame {
    public void startLotto() {
        LottoMaker lottoMaker = new LottoMaker(InputView.inputPurchaseAmount());
        LottoFactory lottoFactory = new LottoFactory();
        int lottoCount = lottoMaker.getLottoCount();

        ResultView.printLottoCount(lottoCount);

        for (int i = 0; i < lottoCount; i++) {
            LottoNumbers lottoNumbers = new LottoNumbers();
            lottoFactory.addLottoNumbers(lottoNumbers);
            ResultView.printLottoNumbers(lottoNumbers.makeLottoNumbers());
        }

        LastWinningNumbers lastWinningNumbers = new LastWinningNumbers(InputView.inputWinningNumber());

    }
}
