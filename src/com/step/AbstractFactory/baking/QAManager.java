package com.step.AbstractFactory.baking;

import com.step.AbstractFactory.ProjectManager;

public class QAManager implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("QA ProjectManager ....");
    }
}
