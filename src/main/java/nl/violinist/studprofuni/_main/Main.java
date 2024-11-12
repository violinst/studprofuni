package nl.violinist.studprofuni._main;

import nl.violinist.studprofuni.entity.Professor;
import nl.violinist.studprofuni.entity.Student;
import nl.violinist.studprofuni.entity.University;
import nl.violinist.studprofuni.service.CommonService;
import nl.violinist.studprofuni.service.ProfessorService;
import nl.violinist.studprofuni.service.StudentService;

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

        StudentService studentService = new StudentService();
        ProfessorService professorService = new ProfessorService();
        CommonService commonService = new CommonService();

        studentService.makeAttendingLectures(student1);
        studentService.makeMakingReport(student1);
        professorService.makeGivingLectures(professor1);
        professorService.makeGradingReport(professor1);
        commonService.makeGoingToCanteen(student1);
        commonService.makeGoingToCanteen(professor1);
    }
}
