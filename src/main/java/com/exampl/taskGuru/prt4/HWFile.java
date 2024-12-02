package com.exampl.taskGuru.prt4;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HWFile {
    public static void main(String[] args) {

    }

    public static void outputCatalog(String name) {
        outputCatalog(name, 0);
    }

    public static void outputCatalog(String name, int tab) {
        File dir = new File(name);
        List<File> fileList = Arrays.asList(dir.listFiles());
        fileList.sort((a, b) -> {
            if (a.isDirectory()) {
                return 1;
            }
            return -1;
        });
        for (File file : fileList) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
                outputCatalog(file.getAbsolutePath(), tab + 4);
            } else {
                System.out.println(" ".repeat(tab) + file.getName());
            }
        }
    }
}

