package Lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMakerTest {
    @DisplayName("로또 개수 생성")
    @ParameterizedTest
    @ValueSource(ints = 14)
    void TestLottoMaker(int expected) {
        LottoMaker lottoMaker = new LottoMaker(14000);
        assertThat(lottoMaker.getLottoCount()).isEqualTo(expected);
    }
}
