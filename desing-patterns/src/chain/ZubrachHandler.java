package chain;

import decorator.StudentType;

public class ZubrachHandler extends Handler {
    public void handle(StudentType studentType) {
        if (studentType == StudentType.ZUBRACH) {
            System.out.println("Отива в купчина: Зубрачи");
        } else if (next != null) {
            next.handle(studentType);
        }
    }
}
