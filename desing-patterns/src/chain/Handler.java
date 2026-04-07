package chain;

import decorator.StudentType;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handle(StudentType studentType);
}
