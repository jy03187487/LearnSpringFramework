package examples;

public interface Command {

    void setState(Object object);
    Object execute();
}
