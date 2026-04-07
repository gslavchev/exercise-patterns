package strategy;

import decorator.StudentType;
import factory.Task;

public interface StudentProcessor {

    StudentType getStudentType();

    Task createTask();
}
