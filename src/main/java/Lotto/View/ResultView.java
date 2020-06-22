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

    public static void printWinningStatistics() {
        System.out.println("당첨 통계");
        System.out.println("---------");
        System.out.println("3개 일치 (5000원)- ");
        System.out.println("4개 일치 (50000원)- ");
        System.out.println("5개 일치 (1500000원)- ");
        System.out.println("6개 일치 (2000000000원)- ");
    }
}
