package nl.violinist.studprofuni.service;

import nl.violinist.studprofuni.entity.CommonAction;

public class CommonService {

    public void makeGoingToCanteen(CommonAction commonAction) {
        commonAction.goingToCanteen();
    }
}
