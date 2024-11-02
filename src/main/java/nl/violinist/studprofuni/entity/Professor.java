package nl.violinist.studprofuni.entity;

public class Professor implements CommonAction, ProfessorAction {
    private String name;
    private String subject;
    private University university;
    private Student student;

    public Professor() {

    }

    public Professor(String name, String subject, University university, Student student) {
        this.name = name;
        this.subject = subject;
        this.university = university;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity() {
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void givingLectures() {
        System.out.println("Professor checks the report on " + subject +
                " of " + getStudent().getName() + ".");
    }

    @Override
    public void gradingReports() {
        System.out.println("Professor gives A to all the students of group " + getStudent().getGroup() + ", who attended the lecture.");
    }

    @Override
    public void goingToCanteen() {
        System.out.println("Professor " + getName() + " goes to drink a cup of coffee in the canteen with his colleagues.");
    }
}
