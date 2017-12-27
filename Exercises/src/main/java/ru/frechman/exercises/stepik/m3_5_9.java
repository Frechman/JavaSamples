package ru.frechman.exercises.stepik;


enum Label {
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

interface TextAnalyzer {
    Label processText(String text);
}

public class m3_5_9 {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {


        for (TextAnalyzer lyzers : analyzers
                ) {
            if (lyzers.processText(text) != Label.OK) {
                return lyzers.processText(text);
            }
        }
        return Label.OK;

    }


    abstract class KeywordAnalyzer implements TextAnalyzer {


        @Override
        public Label processText(String text) {
            for (int i = 0; i < getKeywords().length; i++) {

                if (text.contains(getKeywords()[i])) {
                    return getLabel();
                }
            }
            return Label.OK;
        }

        protected abstract String[] getKeywords();

        protected abstract Label getLabel();
    }

    class SpamAnalyzer extends KeywordAnalyzer {

        private String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return this.keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }

    }


    class NegativeTextAnalyzer extends KeywordAnalyzer {


        public NegativeTextAnalyzer() { // конструктор по умолчанию
        }

        @Override
        protected String[] getKeywords() {
            return new String[]{":(", "=(", ":|"};
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    class TooLongTextAnalyzer implements TextAnalyzer {

        private int maxLength;

        public TooLongTextAnalyzer(int maxLengthComment) {
            this.maxLength = maxLengthComment;
        }

        @Override
        public Label processText(String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            }
            return Label.OK;
        }

    }

}
