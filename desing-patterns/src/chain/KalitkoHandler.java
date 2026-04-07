package chain;

import decorator.StudentType;

public class KalitkoHandler extends Handler {

    public void handle(StudentType studentType) {
        if (studentType == StudentType.KALITKO) {
            System.out.println("Отива в купчина: Калитковци");
        } else {
            System.out.println("Неизвестен тип студент");
        }
    }
}
