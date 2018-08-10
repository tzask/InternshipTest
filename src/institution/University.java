package institution;

import person.Student;
import java.util.ArrayList;

public class University {
    private double uniAverage = 0;
    private String name;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (student != null) {
            student.setStudentUniversity(this);
            studentsList.add(student);
        }
    }

    public void updateUniAverage() {
        if (!studentsList.isEmpty()) {
            uniAverage = 0;
            for (Student st : studentsList) {
                uniAverage += st.getKnowledge();
            }
            uniAverage /= studentsList.size();
        } else {
            uniAverage = 0;
        }
    }

    public double getUniAverage() {
        return  uniAverage;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }
}