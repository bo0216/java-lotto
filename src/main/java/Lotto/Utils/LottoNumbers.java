package Lotto.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {
    private List<Integer> lottoNumber = new ArrayList<>();
    private int[] lottoNumbers = new int[6];

    public int[] makeLottoNumbers() {
        for (int i = 1; i <= 45; i++) {
            lottoNumber.add(i);
        }

        Collections.shuffle(lottoNumber);

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = lottoNumber.get(i);
        }

        Arrays.sort(lottoNumbers);

        return lottoNumbers;
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }
}
