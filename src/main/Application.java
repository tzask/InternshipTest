package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import resources.DemoStudentsReader;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        DemoStudentsReader dsr = new DemoStudentsReader();
        for(Student st : dsr.readStudents()) {
            university.addStudent(st);
        }

        Internship internship = new Internship("Interlink");
        internship.addUniversity(university);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
