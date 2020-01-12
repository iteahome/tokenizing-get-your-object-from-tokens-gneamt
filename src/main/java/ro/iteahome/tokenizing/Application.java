package ro.iteahome.tokenizing;

/*
Let's consider the class Student with the following fields: id, firstName, lastName, city, nativeLanguage, grade.
Please write this class in Java and define a string representation for it (e.g.: 1,Andrei,Mladin,Cluj-Napoca,Romana,10).
Define a delimiter (any of: ,;:.).
Override toString() method to return this representation.
Do tokenize a such string and create the Student object with the data found there.
 */

import ro.iteahome.tokenizing.model.Student;

public class Application {
    public static void main(String[] args){

        Student s1 = new Student(1, "Ionut", "Popescu", "Alba-Iulia", "Romana", 10);
        System.out.println(s1.toString());
    }
}
