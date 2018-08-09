package institution.interlink;

import person.Student;
import java.lang.*;
import java.util.ArrayList;

public class Internship {
    private String name;
    ArrayList<Student> listOfInterns = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        if (student.getKnowledge() > student.getStudentUniversity().getUniAverage()) {
            listOfInterns.add(student);
        }
    }

    public String getStudents() {
        if (listOfInterns.isEmpty()) {
            return "The list of interns is empty";
        }

        StringBuilder sb = new StringBuilder();
        for (Student st : listOfInterns) {
            sb.append(st.getName()).append("\n");
        }
        return sb.toString();
    }
}
