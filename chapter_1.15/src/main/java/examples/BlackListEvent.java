package examples;

public class BlackListEvent {

    private EmailService emailService;
    private String address;
    private String content;

    public BlackListEvent(EmailService emailService, String address, String content) {
        this.emailService = emailService;
        this.address = address;
        this.content = content;
    }
}
