package Lotto;

public class LastWinningNumbers {
    private static final String DELIMITER = ",";
    private int[] winningNumbers = new int[6];

    public LastWinningNumbers(String input) {
        winningNumbers = makeWinningNumbers(input);
    }

    private int[] makeWinningNumbers(String input) {
        String[] stringInput = input.split(DELIMITER);
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = Integer.parseInt(stringInput[i]);
        }
        return winningNumbers;
    }
}
