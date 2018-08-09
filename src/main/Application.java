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

        /*
            We don't need to calculate uniAverage each time we use getUniAverage()
            and that's why we use the updateUniAverage() method.
         */
        university.updateUniAverage();
        for(Student st : university.getStudentsList()) {
            internship.setStudent(st);
        }

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
        //System.out.println(university.getUniAverage());
    }
}
