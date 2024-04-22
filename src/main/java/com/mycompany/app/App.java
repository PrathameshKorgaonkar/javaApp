package com.mycompany.app;

public class App {

    private String message;

    public App(){
        this.message = "Hello World!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
