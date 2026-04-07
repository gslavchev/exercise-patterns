package strategy;

import decorator.StudentType;
import factory.Task;
import factory.TrickyTask;;

public class ZubrachStudentProcessor implements StudentProcessor {
    @Override
    public StudentType getStudentType() {
        return StudentType.ZUBRACH;
    }

    @Override
    public Task createTask() {
        return new TrickyTask();
    }
}
