/*
два абстрактных метода getKeywords и getLabel, один из которых будет возвращать набор ключевых слов, а второй метку,
которой необходимо пометить положительные срабатывания. Нам незачем показывать эти методы потребителям классов,
поэтому оставим доступ к ним только для наследников
 */



public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

}
