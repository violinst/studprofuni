package nl.violinist.studprofuni.entity;

public class University {
    private String name;
    private Student student;
    private Professor professor;

    public University() {

    }

    public University(String name, Student student, Professor professor) {
        this.name = name;
        this.student = student;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
