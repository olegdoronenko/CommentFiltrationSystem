/*
SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.

 */

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    //private String text;


    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }


    //Constructor
    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

}
