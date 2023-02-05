public class Main {

    static String[] badWords = {"плохой", "отстой"};
    static SpamAnalyzer spamA = new SpamAnalyzer(badWords);
    static NegativeTextAnalyzer negativeTA = new NegativeTextAnalyzer();
    static TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(17);
    static TextAnalyzer[] analyzers = {spamA, negativeTA, tooLongTA};

    public static void main(String[] args) {
        System.out.println(checkLabels(analyzers, "Хороший текст для теста."));
        System.out.println(checkLabels(analyzers, "Плохой текст для теста, так как это :( ужас."));
        System.out.println(checkLabels(analyzers, "Плохой текст для теста, полный отстой."));
        System.out.println(checkLabels(analyzers, "И это все, что вы хотели написать в комментариях. Да ну, вообще..."));

    }
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }


}