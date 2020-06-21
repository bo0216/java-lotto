import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TextTotalTest {
    @DisplayName("숫자 합계")
    @Test
    public void sumTest() {
        String[] text = {"1", "2", "3"};
        TextTotal textTotal = new TextTotal(text);
        assertThat(textTotal.sum()).isEqualTo(6);
    }

    @DisplayName("입력값이 음수가 있을때")
    @Test
    public void checkNegativeTest() {
        String[] text = {"-1", "2", "3"};
        TextTotal textTotal = new TextTotal(text);
        assertThatThrownBy(() -> textTotal.sum())
                .isInstanceOf(RuntimeException.class);
    }
}
