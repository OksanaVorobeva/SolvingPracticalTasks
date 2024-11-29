package com.exampl.taskGuru.prt2.spam;

public class CommentValidatorRunner {
    public Label checkLabels(TextAnalyzer[] analyzers,String text){
        Label result =Label.OK;
        for(TextAnalyzer analyzer : analyzers){
            result=analyzer.processText(text);
            if(result!=Label.OK){
                break;
            }
        }
        return result;
    }
}
