package examples;

public class AsyncCommand implements Command {

    private Object object;

    public void setState(Object object) {
        this.object = object;
    }

    public Object execute() {
        return object;
    }
}
