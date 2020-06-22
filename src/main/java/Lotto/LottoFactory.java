package Lotto;

import Lotto.Utils.LottoNumbers;

import java.util.List;

public class LottoFactory {
    private List<LottoNumbers> lottoNumbersList;

    public void addLottoNumbers(LottoNumbers lottoNumbers) {
        lottoNumbersList.add(lottoNumbers);
    }

    public List<LottoNumbers> getLottoNumbersList() {
        return lottoNumbersList;
    }
}
