package com.playtika.exam;


public class Ticket {

    private int id;
    private String question;

    public Ticket(int id, String question) {
        this.id = id;
        this.question = question;
    }

    //This method was overrided for trainings
    @Override
    public String toString() {
        return "id=" + id + " question: " + question;
    }
}

