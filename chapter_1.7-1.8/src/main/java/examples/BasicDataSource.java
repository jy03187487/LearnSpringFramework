package examples;

import lombok.Data;

@Data
public class BasicDataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public void close() {

    }

    @Override
    public String toString() {
        return String.format("%s=[%s,%s,%s,%s].", BasicDataSource.class, driverClassName, url, username, password);
    }
}
