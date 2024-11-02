package nl.violinist.studprofuni._main;

import nl.violinist.studprofuni.entity.Professor;
import nl.violinist.studprofuni.entity.Student;
import nl.violinist.studprofuni.entity.University;

public class Main {

    public static void main(String[] args) {
        University university1 = new University();
        university1.setUniName("Yale");
        Professor professor1 = new Professor();
        professor1.setName("S. James");
        professor1.setSubject("History");
        Student student1 = new Student();
        student1.setName("Brian Connor");
        student1.setGroup(3);
        professor1.setStudent(student1);
        student1 = new Student("Brian Connor", 3,
                university1, professor1);

        student1.attendingLectures();
        student1.makingReport();
        professor1.givingLectures();
        professor1.gradingReports();
        professor1.goingToCanteen();
        student1.goingToCanteen();
    }
}
