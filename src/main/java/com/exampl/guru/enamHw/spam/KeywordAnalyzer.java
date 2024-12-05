package com.exampl.guru.enamHw.spam;

import java.util.Arrays;

abstract class KeywordAnalyzer  implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        Label result = getLabel();
        if (!Arrays.stream(getKeywords()).anyMatch(k->k.contains(k))) {
            result= Label.OK;
        }
        return result;
    }
}
