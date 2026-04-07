import chain.Handler;
import chain.KalitkoHandler;
import chain.TarikatHandler;
import chain.ZubrachHandler;
import decorator.*;
import factory.Task;
import factory.TaskFactory;
import singleton.University;

public class Main {

    public static void main(String[] args) {

        University university = University.getInstance();
        university.startExam();

        StudentType studentType = StudentType.TARIKAT;

        Task task = TaskFactory.createTask(studentType);
        System.out.println(task.getTask());

        Student student = new BaseStudent();
        student = new Telepathy(student);
        student = new InfraredVision(student);

        System.out.println(student.work());

        Handler zubrachHandler = new ZubrachHandler();
        Handler tarikatHandler = new TarikatHandler();
        Handler kalitkoHandler = new KalitkoHandler();

        zubrachHandler.setNext(tarikatHandler);
        tarikatHandler.setNext(kalitkoHandler);

        zubrachHandler.handle(studentType);
    }
}