package com.playtika.exam;

import java.util.List;


public class Student {
    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //The method returns random value from 0 to 5
    public int takeExam() {
        return 1 + (int) (Math.random() * 5);
    }

    //This method goes through collection and returns random pointer from it
    public int takeTicket(List<Ticket> tickets) {
        return (int) (Math.random() * tickets.size());

    }

}

