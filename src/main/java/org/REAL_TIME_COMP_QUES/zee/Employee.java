package org.REAL_TIME_COMP_QUES.zee;

//@Getter
//@Setter
public class Employee {

    private String name;
    private String dept;

    public String getName() {
        return this.name;
    }

    public String getDept() {
        return this.dept;
    }

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    /*@Override
    public int compareTo(Object obj) {
        Employee emp = (Employee) obj;
        if (this.getDept().compareTo(emp.getDept()) == 0) {
            return this.getName().compareTo(emp.getName());
        } else {
            return this.getDept().compareTo(emp.getDept());
        }
    }*/

    @Override
    public String toString() {
        return this.dept + " : " + this.name;
    }
}
