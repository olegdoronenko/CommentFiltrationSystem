public class Main implements TextAnalyzer{

    String[] badWords = {"плохой", "отстой"};
    SpamAnalyzer spamA = new SpamAnalyzer(badWords);
    NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
    TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(17);
    TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};

    public static void main(String[] args) {

    }
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return null;

    }

    @Override
    public Label processText(String text) {
        return null;
    }
}