package institution.interlink;

import institution.University;
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

    public void addUniversity(University university) {
        //We don't need to calculate uniAverage each time we use getUniAverage()
        //and that's why we use the updateUniAverage() method.
        university.updateUniAverage();
        for(Student st : university.getStudentsList()) {
            this.setStudent(st);
        }
    }

    /*
          The getStudents() method returns a String with the list of interns.
          We can change it to return ArrayList<Student> listOfInterns
          and  @Override toString() method.
    */
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
