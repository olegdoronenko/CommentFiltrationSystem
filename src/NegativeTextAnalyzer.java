/*
NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию.
 */

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] negative = {":(", "=( ", ":|"};
    @Override
    protected String[] getKeywords() {
        return negative;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }


    //Constructor
    NegativeTextAnalyzer() {

    }

}
