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
}
