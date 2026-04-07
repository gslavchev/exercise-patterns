package decorator;

public class InfraredVision extends StudentDecorator {

    public InfraredVision(Student student) {
        super(student);
    }

    public String work() {
        return super.work() + " + използва инфрачервено зрение";
    }
}
