package decorator;

public abstract class StudentDecorator extends Student{

    protected Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }

    public String work() {
        return student.work();
    }
}
