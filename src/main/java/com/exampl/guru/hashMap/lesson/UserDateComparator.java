package com.exampl.guru.hashMap.lesson;

import java.util.Comparator;

public class UserDateComparator  implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getCreatDate().isAfter(o2.getCreatDate())) {
            return 1;
        }else if (o1.getCreatDate().isBefore(o2.getCreatDate())) {
            return -1;
        }else {
            return 0;
        }
    }
}
