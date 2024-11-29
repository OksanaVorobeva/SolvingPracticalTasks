package com.exampl.taskGuru.pr3.user2;

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
