package com.exampl.guru.enamHw.spam;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final  int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }


    @Override
    public Label processText(String text) {
        Label result= Label.OK;
        if (text.length() > maxLength) {
            result= Label.TOO_LONG;
        }
        return result;
    }
}
