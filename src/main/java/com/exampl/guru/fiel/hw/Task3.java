package com.exampl.guru.fiel.hw;

import java.io.*;
import java.util.Random;

public class Task3 {
    //Создать цепочку из трех папок
    //в конечном каталоге сождать 5 папок
    //заполнить их произвольными цифрами
    //содержимое файлов записать в один файл
    //записать название файлов в один файл

    public static void main(String[] args) throws IOException {

        for (int i = 0; i <= 3 ; i++) {
            File dir =new File("directory_" +i);
            dir.mkdir();
        }

        File dir =new File("directory_3");

        for (int i = 0; i <= 5 ; i++) {
            File file =new File("file_" +i+".txt");
            file.createNewFile();
            try (DataOutputStream os = new DataOutputStream(new FileOutputStream(file,true))){
                for (int j = 0; j < 10 ; j++) {
                    Random random = new Random();
                    os.write(random.nextInt(100));
                }
            }
        }

        File file =new File(dir,"fileContent.txt");

        for (File f: dir.listFiles()){
            try (DataInputStream is = new DataInputStream(new FileInputStream(f));
                 FileWriter os = new FileWriter(file,true)
            ){
                os.write(f.getName());
                for (int i =0; i<10; i++) {
                    os.write(is.read());
                }
                os.write("\n");
            }
        }

        File fileList =new File(dir,"fileList.txt");

        try (FileWriter fw = new FileWriter(fileList)){
            fw.write(dir.getName() + ":\n");
            for(File f: dir.listFiles()){
                if (f.getName().equals(fileList.getName())){
                    continue;
                }
                fw.write(f.getName() + ":\n");
            }
        }


    }
}
