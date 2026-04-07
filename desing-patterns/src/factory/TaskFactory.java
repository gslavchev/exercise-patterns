package factory;

import decorator.StudentType;
import strategy.KalitkoStudentProcessor;
import strategy.StudentProcessor;
import strategy.TarikatStudentProcessor;
import strategy.ZubrachStudentProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskFactory {
    private TaskFactory() {}
    public static Task createTask(StudentType type) {
        Optional<StudentProcessor> processor = getProcessor(type);

        return processor
                .map(StudentProcessor::createTask)
                .orElse(null);
    }

    private static Optional<StudentProcessor> getProcessor(StudentType type) {
        List<StudentProcessor> processors = new ArrayList<>(
                List.of(new KalitkoStudentProcessor(),
                        new ZubrachStudentProcessor(),
                        new TarikatStudentProcessor()));

        return processors
                .stream()
                .filter(processor -> processor.getStudentType() == type)
                .findFirst();
    }
}