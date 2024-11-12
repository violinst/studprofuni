package nl.violinist.studprofuni.service;

import nl.violinist.studprofuni.entity.StudentAction;

public class StudentService {

    public void makeAttendingLectures (StudentAction studentAction) {
        studentAction.attendingLectures();
    }

    public void makeMakingReport (StudentAction studentAction) {
        studentAction.makingReport();
    }
}
