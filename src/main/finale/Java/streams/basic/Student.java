package main.finale.Java.streams.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student {

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    private String name;

    private Integer id;
}