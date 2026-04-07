package chain;

import decorator.StudentType;

public class TarikatHandler extends Handler {

    public void handle(StudentType studentType) {
        if (studentType == StudentType.TARIKAT) {
            System.out.println("Отива в купчина: Тарикати");
        } else if (next != null) {
            next.handle(studentType);
        }
    }
}
