/*
SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.

 */

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

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
    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

}
