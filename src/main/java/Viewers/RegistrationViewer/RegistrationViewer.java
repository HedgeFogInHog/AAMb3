package Viewers.RegistrationViewer;

public class RegistrationViewer {

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showRegistrationPrompt() {
        System.out.println("Please enter user details to register.");
    }

    public void showRegistrationPromptName() {
        System.out.println("Name: ");
    }

    public void showRegistrationPromptPass() {
        System.out.println("Password: ");
    }

    public void showRegistrationSuccess() {
        System.out.println("Registration successful!");
    }

    public void showRegistrationError(String message) {
        System.out.println("Error: " + message);
    }
}
