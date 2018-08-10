package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 5));
        university.addStudent(new Student("Julia Veselkina", 10));
        university.addStudent(new Student("Maria Perechrest", 13));

        Internship internship = new Internship("Interlink");
        internship.addUniversity(university);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
        //System.out.println(university.getUniAverage());
    }
}
