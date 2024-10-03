package tech.eriksonmurrugarra.app.rest;

public class HelloMessageDto {

    private String message;

    public HelloMessageDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
