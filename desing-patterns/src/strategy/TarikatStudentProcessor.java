package strategy;

import decorator.StudentType;
import factory.ShortTask;
import factory.Task;

public class TarikatStudentProcessor implements StudentProcessor {
    @Override
    public StudentType getStudentType() {
        return StudentType.TARIKAT;
    }

    @Override
    public Task createTask() {
        return new ShortTask();
    }
}
