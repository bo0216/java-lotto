package Lotto.View;

public class ResultView {
    public static void printLottoCount(int lottoCount) {
        System.out.println(lottoCount + "개를 구매했습니다.");
    }

    public static void printLottoNumbers(int[] lottoNumbers) {
        System.out.print("[");
        for (int i = 0; i < lottoNumbers.length - 1; i++) {
            System.out.print(lottoNumbers[i] + ", ");
        }
        System.out.print(lottoNumbers[lottoNumbers.length - 1] + "]");
        System.out.println();
    }
}
