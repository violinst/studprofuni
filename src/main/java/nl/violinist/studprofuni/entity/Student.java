package nl.violinist.studprofuni.entity;

import nl.violinist.studprofuni.service.PersonIdentificator;
import nl.violinist.studprofuni.service.SubmittingReport;

public class Student implements PersonIdentificator, SubmittingReport {

    private String name;
    private int id;
    private University university;
    private Professor professor;

    public Student() {

    }

    public Student(String name, int group, University university, Professor professor) {
        this.name = name;
        this.id = group;
        this.university = university;
        this.professor = professor;

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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

