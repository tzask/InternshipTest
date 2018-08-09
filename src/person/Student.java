package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;
    private University studentUni;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int knowledgeLevel) {
        this.name = name;
        knowledge = new Knowledge(knowledgeLevel);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
    public int getKnowledge() {
        return knowledge.getLevel();
    }

    public void setStudentUniversity(University uni) {
        studentUni = uni;
    }
    public University getStudentUniversity() {
        return studentUni;
    }
}
