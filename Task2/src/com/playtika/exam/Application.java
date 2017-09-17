package com.playtika.exam;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        //Create array for students
        List<Student> students = new ArrayList();
        Student student1 = new Student("Jack", "Denils");
        students.add(student1);
        Student student2 = new Student("Jary", "Den");
        students.add(student2);
        Student student3 = new Student("Hog", "Dru");
        students.add(student3);
        Student student4 = new Student("Hi", "Jack");
        students.add(student4);
        Student student5 = new Student("Men", "Kru");
        students.add(student5);

        //Create array for result
        int[] result = new int[5];
        result[0] = student1.takeExam();
        result[1] = student2.takeExam();
        result[2] = student3.takeExam();
        result[3] = student4.takeExam();
        result[4] = student5.takeExam();

        //Circle to calculate average mark
        double sum = 0;

        for (int i = 0; i < result.length; i++)
            sum += result[i];

        sum = sum / result.length;

        //Make array with tickets
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(0, "Question1?"));
        tickets.add(new Ticket(1, "Question2?"));
        tickets.add(new Ticket(2, "Question3?"));
        tickets.add(new Ticket(3, "Question4?"));
        tickets.add(new Ticket(4, "Question5?"));
        tickets.add(new Ticket(5, "Question6?"));
        tickets.add(new Ticket(6, "Question7?"));
        tickets.add(new Ticket(7, "Question8?"));
        tickets.add(new Ticket(8, "Question9?"));
        tickets.add(new Ticket(9, "Question10?"));

        //Array for storing ticket's number result
        int[] numberTicket = new int[5];
        numberTicket[0] = student1.takeTicket(tickets);
        numberTicket[1] = student2.takeTicket(tickets);
        numberTicket[2] = student3.takeTicket(tickets);
        numberTicket[3] = student4.takeTicket(tickets);
        numberTicket[4] = student5.takeTicket(tickets);


        System.out.println("The first student gets mark " + result[0] + " and takes ticket number " + numberTicket[0]);
        System.out.println("The second student gets mark " + result[1] + " and takes ticket number " + numberTicket[1]);
        System.out.println("The third student gets mark " + result[2] + " and took ticket number " + numberTicket[2]);
        System.out.println("The fourth student gets mark " + result[3] + " and took ticket number " + numberTicket[3]);
        System.out.println("The fifth student gets mark " + result[4] + " and took ticket number " + numberTicket[4]);
        System.out.println("The average students mark is " + sum);

    }
}
