package strategy;

import decorator.StudentType;
import factory.OldTask;
import factory.Task;

public class KalitkoStudentProcessor implements StudentProcessor {


    @Override
    public StudentType getStudentType() {
        return StudentType.KALITKO;
    }

    @Override
    public Task createTask() {
        return new OldTask();
    }
}
