package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Task119 {
    //Конвертирование коллекции в массив
    List<String> names = Arrays.asList("ana","mario","vio");
    Object[] namesArrayAsObjects = names.toArray();

    String[] namesArrayAsStrings = names.toArray(new String[names.size()]);
    String[] namesArrayAsStrings2 = names.toArray(new String[0]);
    String[] namesArrayAsStrings3 = names.toArray(String[]::new);

    String[] namesArray={"ana","mario","vio"};

    List<String> namesArrayAsList = List.of(namesArray);
    Set<String> namesArrayAsSet = Set.of(namesArray);

}
