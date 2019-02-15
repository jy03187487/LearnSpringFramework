package fiona.apple;

public interface Command {
    void setState(Object object);
    Object execute();
}
