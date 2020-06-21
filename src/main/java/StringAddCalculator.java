public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (InputText.checkNullOrEmptyText(text)) {
            return 0;
        }
        return new TextTotal(Operator.matchDelimiter(text)).sum();
    }
}
