package decorator;

public class WrinklePower extends StudentDecorator {

    public WrinklePower(Student student) {
        super(student);
    }

    public String work() {
        return super.work() + " + се мръщи силно";
    }
}
