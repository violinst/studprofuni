package nl.violinist.studprofuni.entity;

public class Student implements CommonAction, StudentAction {

    private String name;
    private int group;
    private University university;
    private Professor professor;

    public Student() {
    }

    public Student(String name, int group, University university, Professor professor) {
        this.name = name;
        this.group = group;
        this.university = university;
        this.professor = professor;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity() {
        this.university = university;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void attendingLectures() {
        System.out.println("Student attends the lecture of " + professor.getName()
                + " about " + " " + getProfessor().getSubject() + ".");
    }

    @Override
    public void makingReport() {
        System.out.println("Student " + name + " writes a report about "
                + getProfessor().getSubject() + " lecture of " + " professor " + professor.getName() + ".");
    }

    @Override
    public void goingToCanteen() {
        System.out.println("Group " + getGroup() + " goes to the canteen after their History class.");
    }
}

