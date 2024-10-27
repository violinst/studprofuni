package nl.violinist.studprofuni.entity;

import nl.violinist.studprofuni.service.GradingReport;
import nl.violinist.studprofuni.service.PersonIdentificator;

public class Professor implements PersonIdentificator, GradingReport {
    private String name;
    private int id;
    private University university;
    private Student student;

    public Professor() {

    }

    public Professor(String name, int id, University university, Student student) {
        this.name = name;
        this.id = id;
        this.university = university;
        this.student = student;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public University getUniversity() {
        return university;
    }

    @Override
    public void setUniversity(University university) {
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
