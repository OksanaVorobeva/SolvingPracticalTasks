package com.exampl.taskGuru.prt2.spam;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

   private final String[] negativeTexts ={":(", "=(", ":|"};


    @Override
    protected String[] getKeywords() {
        return negativeTexts;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
