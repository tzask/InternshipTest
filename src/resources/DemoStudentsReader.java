package resources;

import person.Student;
import java.util.ArrayList;

public class DemoStudentsReader implements StudentsDataReader{

    public ArrayList<Student> readStudents() {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Andrew Kostenko", 5));
        studentsList.add(new Student("Julia Veselkina", 10));
        studentsList.add(new Student("Maria Perechrest", 13));

        return studentsList;
    }
}
