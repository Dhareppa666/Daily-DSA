package org.streams;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String grade;

    @Getter @Setter
    private double salary;
}
