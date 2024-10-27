package nl.violinist.studprofuni.service;

import nl.violinist.studprofuni.entity.University;

public interface PersonIdentificator {

    String getName();
    void setName(String name);
    int getId();
    void setId(int id);
    University getUniversity();
    void setUniversity(University university);
}
