package ro.iteahome.tokenizing;

/*
Let's consider the class Student with the following fields: id, firstName, lastName, city, nativeLanguage, grade.
Please write this class in Java and define a string representation for it (e.g.: 1,Andrei,Mladin,Cluj-Napoca,Romana,10).
Define a delimiter (any of: ,;:.).
Override toString() method to return this representation.
Do tokenize a such string and create the Student object with the data found there.
 */

import ro.iteahome.tokenizing.model.Student;

import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args){

        Student s1 = new Student(1, "Ionut", "Popescu", "Alba-Iulia", "Romana", 10);
        System.out.println(s1.toString());

        String studentString = "2,George,Neamt,Cluj-Napoca,Romana,9";
        Student s2 = createStudentUsingTokenizer(studentString);
        System.out.println(s2.toString());
    }

    private static Student createStudentUsingTokenizer(String inputString){

        String[] tokenized = inputString.split(",");
        Student student = new Student(Integer.parseInt(tokenized[0]), tokenized[1], tokenized[2], tokenized[3], tokenized[4], Integer.parseInt(tokenized[5]));
        return student;
    };
}
