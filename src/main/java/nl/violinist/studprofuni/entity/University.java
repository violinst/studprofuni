package nl.violinist.studprofuni.entity;

public class University {
    private String uniName;
    private Student student;
    private Professor professor;

    public University() {
    }

    public University(String uniName) {
        this.uniName = uniName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
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
