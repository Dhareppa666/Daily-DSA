package org.REAL_TIME_COMP_QUES.zee;

import java.util.Comparator;

public class Comparator_Class implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getDept().compareTo(o2.getDept()) == 0)
            return o1.getName().compareTo(o2.getName());
        return o1.getDept().compareTo(o2.getDept());
    }
}
