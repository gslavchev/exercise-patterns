package decorator;

public class Telepathy extends StudentDecorator {
    public Telepathy(Student student) {
        super(student);
    }

    public String work() {
        return super.work() + " + използва телепатия";
    }
}
