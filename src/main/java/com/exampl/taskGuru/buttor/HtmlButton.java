package com.exampl.taskGuru.buttor;

import java.awt.*;

public class HtmlButton implements Buttor {
    @Override
    public void render() {
        System.out.println("HtmlButton");
    }

    @Override
    public void onClick() {
        System.out.println("HtmlButton onClick");
    }
}
