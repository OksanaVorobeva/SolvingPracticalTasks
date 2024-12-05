package com.exampl.guru.fiel;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) throws IOException {
        File dir = new File("/Users/oksanavorobeva/Desktop/Java/javaTest");
        dir.mkdirs();

        for (int i = 0; i < 20; i++) {
            File file = new File(dir, "test" + i + ".txt");
            file.createNewFile();
            try (OutputStream os = new FileOutputStream(file);
                 BufferedOutputStream bos = new BufferedOutputStream(os)) {
                bos.write(("Java " + i).getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (File file : dir.listFiles()) {
            try (FileReader fr = new FileReader(file);
                 Scanner sc = new Scanner(fr)) {
                while (sc.hasNextLine()) {
                    if (sc.nextLine().equals("Java 7")) {
                        System.out.println("I found file " + file.getName());
                    }
                }
            }
        }
    }
}

class User implements Serializable{
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               '}';
    }
}

class TestUser{
    public static void main(String[] args) {
        User user1 = new User("Test");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.txt"))) {
            outputStream.writeObject(user1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("test.txt"))){
           User user2 = (User) inputStream.readObject();
            System.out.println(user2);
            System.out.println(user1.equals(user2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}


