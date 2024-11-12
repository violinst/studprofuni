package nl.violinist.studprofuni.service;

import nl.violinist.studprofuni.entity.ProfessorAction;

public class ProfessorService {

    public void makeGivingLectures(ProfessorAction professorAction) {
        professorAction.givingLectures();
    }

    public void makeGradingReport(ProfessorAction professorAction) {
        professorAction.gradingReports();
    }
}
