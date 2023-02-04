/*
NegativeTextAnalyzer должен конструироваться конструктором по-умолчанию.
 */

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] negative = {":(", "=( ", ":|"};
    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }

    //Constructor
    NegativeTextAnalyzer() {

    }

}
