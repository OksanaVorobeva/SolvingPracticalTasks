package com.exampl.taskGuru.pr3;

import java.util.*;

public class HWSort {
}

class HWSort2 {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "two", 2,
                "five", 5,
                "three", 3,
                "one", 1,
                "four", 4
        );

       Map<String, Integer> sortedMap = sortByValue(nonSortedMap);
       sortedMap.entrySet().forEach(System.out::println);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
       TreeMap<String, Integer> sortedMap = new TreeMap<>(new NumberComparator(map));
       sortedMap.putAll(map);
       return sortedMap;
    }


}
 class NumberComparator implements Comparator<String>{
    private final Map<String, Integer> map;
    public NumberComparator(Map<String, Integer> map) {
        this.map = map;
    }
    public int compare(String o1, String o2) {
        return map.get(o1) - map.get(o2);
    }
}

class HWSort1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kolya", 3, 2.5));
        students.add(new Student("Olya", 2, 5.0));
        students.add(new Student("Vanya", 1, 3.7));
        students.add(new Student("Petya", 3, 4.0));

        SortStudentByName sortStudentByName = new SortStudentByName();
        System.out.println(sortStudents(students, sortStudentByName));
        SortStudentByGroup sortStudentByGroup = new SortStudentByGroup();
        System.out.println(sortStudents(students, sortStudentByGroup));
        SortStudentByAverageRating sortStudentByAverageRating = new SortStudentByAverageRating();
        System.out.println(sortStudents(students, sortStudentByAverageRating));
        students.sort(sortStudentByGroup.thenComparing(sortStudentByAverageRating));
        System.out.println(students);
        System.out.println(removeStudent(students));
    }

    public static List<Student> sortStudents(List<Student> students, Comparator<Student> comparator) {
        students.sort(comparator);
        return students;
    }

    public static List<Student> removeStudent(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageRating() < 3.0) {
                students.remove(i);
            }
        }
        return students;
    }
}

class Student {
    private String name;
    private int group;
    private double averageRating;

    public Student(String name, int group, double averageRating) {
        this.name = name;
        this.group = group;
        this.averageRating = averageRating;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageRating() {
        return averageRating;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", group=" + group +
               ", averageRating=" + averageRating +
               '}';
    }
}

class SortStudentByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortStudentByGroup implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup() - o2.getGroup();
    }
}

class SortStudentByAverageRating implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageRating() > o2.getAverageRating()) {
            return 1;
        } else if (o1.getAverageRating() < o2.getAverageRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}